package com.github.rnveach.commands;

import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;
import com.github.rnveach.data.SaveData;
import com.google.gson.JsonElement;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.ParentCommand;

@Command(name = "update", aliases = { "--update", "-u" }, description = "Update only portions of a save file.")
public class UpdateCommand implements Callable<Integer> {

	@ParentCommand
	private HoloCureManagerCli parent;

	@Option(names = { "-h", "--help" }, usageHelp = true)
	private boolean help;

	@Option(names = { "--holoCoins" }, description = "Update HoloCoins.")
	private Double holoCoins;
	@Option(names = { "--sand" }, description = "Update Sand.")
	private Double sand;
	@Option(names = { "--usaChips" }, description = "Update UsaChips.")
	private Double usaChips;

	// TODO: raw support

	private void validateOptions() {
		if ((this.holoCoins == null) && (this.sand == null) && (this.usaChips == null)) {
			throw new ParameterException(this.parent.getSpec().commandLine(),
					"Error: Nothing was specified to be updated.");
		}
	}

	@Override
	public Integer call() throws Exception {
		this.parent.validateOptions();
		validateOptions();

		final JsonElement root = this.parent.getInputFileJson();

		if (this.holoCoins != null) {
			SaveData.setHoloCoins(root, this.holoCoins);
		}
		if (this.sand != null) {
			SaveData.setSand(root, this.sand);
		}
		if (this.usaChips != null) {
			SaveData.setUsaChips(root, this.usaChips);
		}

		this.parent.writeToInputFile(root.toString());

		return 0;
	}

}
