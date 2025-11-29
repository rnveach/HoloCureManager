package com.github.rnveach.commands;

import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;
import com.google.gson.GsonBuilder;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(name = "dump", aliases = { "--dump", "-d" }, description = "Perform a full dump of the save file.")
public final class DumpCommand implements Callable<Integer> {

	@ParentCommand
	private HoloCureManagerCli parent;

	@Option(names = { "-h", "--help" }, usageHelp = true)
	private boolean help;

	@Option(names = { "-p", "--pretty" }, description = "Pretty print the dump display.")
	private boolean pretty;

	private void validateOptions() {
		this.parent.validateOptions();
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		if (this.pretty) {
			System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(this.parent.getInputFileJson()));
		} else {
			System.out.println(this.parent.getInputFileData());
		}

		return 0;
	}

}
