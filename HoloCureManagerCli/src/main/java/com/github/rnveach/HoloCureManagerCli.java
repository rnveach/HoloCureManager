package com.github.rnveach;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

import com.github.rnveach.commands.DumpCommand;
import com.github.rnveach.commands.ListCommand;
import com.github.rnveach.commands.UpdateCommand;
import com.github.rnveach.commands.WriteCommand;
import com.github.rnveach.data.Axe;
import com.github.rnveach.data.FishRod;
import com.github.rnveach.data.Pet;
import com.github.rnveach.data.Pickaxe;
import com.github.rnveach.data.Trail;
import com.github.rnveach.utils.Base64Util;
import com.github.rnveach.utils.CaseInsensitiveEnumConverter;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Model.CommandSpec;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.Spec;

@Command(name = "HoloCureManagerCli", mixinStandardHelpOptions = true, version = "0.0.1-SNAPSHOT", description = "HoloCure Manager", //
		subcommands = { DumpCommand.class, WriteCommand.class, ListCommand.class, UpdateCommand.class })
public class HoloCureManagerCli implements Callable<Integer> {

	@Spec
	private CommandSpec spec;

	@Option(names = { "-f", "--file" }, description = "The path to the save file to manage.", paramLabel = "PATH")
	private Path inputFilePath;

	public void validateOptions() {
		if (this.inputFilePath == null) {
			final String localAppData = System.getenv("LOCALAPPDATA");
			this.inputFilePath = Paths.get(localAppData, "HoloCure", "save_n.dat");
		}

		if (this.inputFilePath == null) {
			throw new CommandLine.ParameterException(this.spec.commandLine(),
					"Missing required option: either provide '-f, --file' or ensure a default path can be determined.");
		} else if (!Files.exists(this.inputFilePath)) {
			throw new ParameterException(this.spec.commandLine(),
					"Error: The provided filepath does not exist: " + this.inputFilePath.toAbsolutePath());
		} else if (!Files.isRegularFile(this.inputFilePath) || !Files.isReadable(this.inputFilePath)) {
			throw new ParameterException(this.spec.commandLine(),
					"Error: The provided filepath is not a file or is readable: "
							+ this.inputFilePath.toAbsolutePath());
		}
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		return 0;
	}

	public static void main(String... arguments) {
		final CommandLine cmd = new CommandLine(new HoloCureManagerCli());

		cmd.registerConverter(Axe.class, new CaseInsensitiveEnumConverter<>(Axe.class));
		cmd.registerConverter(FishRod.class, new CaseInsensitiveEnumConverter<>(FishRod.class));
		cmd.registerConverter(Pet.class, new CaseInsensitiveEnumConverter<>(Pet.class));
		cmd.registerConverter(Pickaxe.class, new CaseInsensitiveEnumConverter<>(Pickaxe.class));
		cmd.registerConverter(Trail.class, new CaseInsensitiveEnumConverter<>(Trail.class));

		System.exit(cmd.execute(arguments));
	}

	public CommandSpec getSpec() {
		return this.spec;
	}

	public Path getInputFilePath() {
		return this.inputFilePath;
	}

	public String getInputFileData() throws IOException {
		return Base64Util.decodeFrom(this.inputFilePath);
	}

	public JsonElement getInputFileJson() throws JsonSyntaxException, IOException {
		return JsonParser.parseString(getInputFileData());
	}

	public void writeToInputFile(String data) throws IOException {
		Base64Util.encodeTo(this.inputFilePath, data);
	}

}
