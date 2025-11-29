package com.github.rnveach.commands;

import java.util.concurrent.Callable;

import com.github.rnveach.data.SaveData;
import com.google.gson.JsonElement;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(name = "raw", aliases = { "--raw", "-r" }, description = "Update raw portions of a save file directly.")
public final class UpdateRawCommand implements Callable<Integer> {

	@ParentCommand
	private UpdateCommand parent;

	@Option(names = { "-h", "--help" }, usageHelp = true)
	private boolean help;

	@Option(names = { "-k", "--key" }, required = true)
	private String key;

	@Option(names = { "-v", "--value" }, required = true)
	private String value;

	@Option(names = { "-t",
			"--type" }, description = "Supported types are boolean, double, string, and json.", required = true)
	private String type;

	private void validateOptions() {
		// we skip the validation of the direct parent
		// this command acts like a replacement for it
		this.parent.getParent().validateOptions();
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		final JsonElement root = this.parent.getParent().getInputFileJson();

		SaveData.setRaw(root, this.key, this.value, this.type);

		this.parent.getParent().writeToInputFile(root.toString());

		return 0;
	}

}
