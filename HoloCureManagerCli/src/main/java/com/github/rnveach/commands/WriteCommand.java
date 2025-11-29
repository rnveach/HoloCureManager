package com.github.rnveach.commands;

import java.io.InputStreamReader;
import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.ParentCommand;

@Command(name = "write", aliases = { "--write",
		"-w" }, description = "Write the provided input stream or provided data to the save file.")
public final class WriteCommand implements Callable<Integer> {

	@ParentCommand
	private HoloCureManagerCli parent;

	@Option(names = { "-h", "--help" }, usageHelp = true)
	private boolean help;

	@Option(names = { "-d",
			"--data" }, description = "Data to directly write to file instead of input stream.", paramLabel = "STRING")
	private String data;

	private void validateOptions() {
		this.parent.validateOptions();
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		if (System.in.available() > 0) {
			final StringBuilder stringBuilder = new StringBuilder();
			final char[] buffer = new char[4096];

			try (InputStreamReader reader = new InputStreamReader(System.in)) {
				int charsRead;

				while ((charsRead = reader.read(buffer)) != -1) {
					stringBuilder.append(buffer, 0, charsRead);
				}
			}

			this.parent.writeToInputFile(stringBuilder.toString());
		} else if (this.data != null) {
			this.parent.writeToInputFile(this.data.toString());
		} else {
			throw new ParameterException(this.parent.getSpec().commandLine(),
					"Error: No data was provided to be written.");
		}

		return 0;
	}

}
