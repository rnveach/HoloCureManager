package com.github.rnveach.commands;

import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;
import com.github.rnveach.data.SaveData;
import com.google.gson.JsonElement;

import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;
import picocli.CommandLine.Mixin;
import picocli.CommandLine.ParentCommand;

@Command(name = "list", aliases = { "--list", "-l" }, description = "List known data from the save file.")
public final class ListCommand implements Callable<Integer> {

	@ParentCommand
	private HoloCureManagerCli parent;

	@Mixin
	private HelpCommand helpMixin;

	@Override
	public Integer call() throws Exception {
		this.parent.validateOptions();

		final JsonElement root = this.parent.getInputFileJson();

		System.out.println("Main:");
		System.out.println(String.format("\tHoloCoins: %.1f", SaveData.getHoloCoins(root)));
		System.out.println();
		System.out.println("HoloHouse:");
		System.out.println(String.format("\tSand: %.1f", SaveData.getSand(root)));
		System.out.println();
		System.out.println("\tUsada Casino:");
		System.out.println(String.format("\t\tUsaChips: %.1f", SaveData.getUsaChips(root)));

		return 0;
	}

}
