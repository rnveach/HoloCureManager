package com.github.rnveach.commands;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;
import com.github.rnveach.data.Displayable;
import com.github.rnveach.data.SaveData;
import com.google.gson.JsonElement;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParentCommand;

@Command(name = "list", aliases = { "--list", "-l" }, description = "List known data from the save file.")
public final class ListCommand implements Callable<Integer> {

	@ParentCommand
	private HoloCureManagerCli parent;

	@Option(names = { "-h", "--help" }, usageHelp = true)
	private boolean help;

	private void validateOptions() {
		this.parent.validateOptions();
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		final JsonElement root = this.parent.getInputFileJson();

		// a ? represents unknown

		System.out.println("Game:");
		System.out.println(String.format("\tMajor Game Version: %.1f", SaveData.getMajorGameVersion(root)));
		System.out.println(String.format("\tMinor Game Version: %.1f", SaveData.getMinorGameVersion(root)));

		System.out.println();
		System.out.println("Main:");
		System.out.println(String.format("\tHoloCoins: %.1f", SaveData.getHoloCoins(root)));
		System.out.println(String.format("\tRandom Money Key?: %.1f", SaveData.getRandomMoneyKey(root)));
		System.out.println(String.format("\tTime Mode Unlocked: %b", SaveData.getTimeModeUnlocked(root)));
		System.out.println();
		printDisplay("\t", "Unlocked Stages:", SaveData.getUnlockedStages(root));
		System.out.println();
		printDisplay("\t", "Unlocked Outfits:", SaveData.getUnlockedOutfits(root));

		System.out.println();
		System.out.println("\tUpgrades:");
		System.out.println("\t\tAbilities:");
		System.out.println(String.format("\t\t\tSpecial Attack: %.1f", SaveData.getSpecialAttack(root)));
		System.out.println(String.format("\t\t\tGrowth: %.1f", SaveData.getGrowth(root)));
		System.out.println(String.format("\t\t\tReroll: %.1f", SaveData.getReroll(root)));
		System.out.println(String.format("\t\t\tEliminate: %.1f", SaveData.getEliminate(root)));
		System.out.println(String.format("\t\t\tHold Find: %.1f", SaveData.getHoldFind(root)));
		System.out.println(String.format("\t\t\tCustomize: %.1f", SaveData.getCustomize(root)));
		System.out.println(String.format("\t\t\tSupports: %.1f", SaveData.getSupports(root)));
		System.out.println(String.format("\t\t\tMaterial Find: %.1f", SaveData.getMaterialFind(root)));
		System.out.println(String.format("\t\t\tStamps: %.1f", SaveData.getStamps(root)));
		System.out.println(String.format("\t\t\tEnchantments: %.1f", SaveData.getEnchantments(root)));
		System.out.println(String.format("\t\t\tFandom: %.1f", SaveData.getFandom(root)));
		System.out.println(String.format("\t\t\tFan Letters: %.1f", SaveData.getFanLetters(root)));

		System.out.println();
		System.out.println("\t\tStats:");
		System.out.println(String.format("\t\t\tMax HP Up: %.1f", SaveData.getMaxHpUp(root)));
		System.out.println(String.format("\t\t\tATK Up: %.1f", SaveData.getAtkUp(root)));
		System.out.println(String.format("\t\t\tSPD Up: %.1f", SaveData.getSpdUp(root)));
		System.out.println(String.format("\t\t\tCrit Up: %.1f", SaveData.getCritUp(root)));
		System.out.println(String.format("\t\t\tPick Up Range: %.1f", SaveData.getPickUpRange(root)));
		System.out.println(String.format("\t\t\tHaste Up: %.1f", SaveData.getHasteUp(root)));
		System.out.println(String.format("\t\t\tRegeneration: %.1f", SaveData.getRegeneration(root)));
		System.out.println(String.format("\t\t\tDefense Up: %.1f", SaveData.getDefenseUp(root)));
		System.out.println(
				String.format("\t\t\tSpecial Cooldown Reduction: %.1f", SaveData.getSpecialCooldownReduction(root)));
		System.out.println(String.format("\t\t\tSkill Up: %.1f", SaveData.getSkillUp(root)));
		System.out.println(String.format("\t\t\tEXP Gain Up: %.1f", SaveData.getExpGainUp(root)));
		System.out.println(String.format("\t\t\tFood Drops Up: %.1f", SaveData.getFoodDropsUp(root)));
		System.out.println(String.format("\t\t\tMoney Gain Up: %.1f", SaveData.getMoneyGainUp(root)));
		System.out.println(String.format("\t\t\tEnhancement Rate Up: %.1f", SaveData.getEnhancementRateUp(root)));

		System.out.println();
		System.out.println("\t\tOther:");
		System.out.println(String.format("\t\t\tMarketing: %.1f", SaveData.getMarketing(root)));
		System.out.println(String.format("\t\t\tWeapon Limit: %.1f", SaveData.getWeaponLimit(root)));
		System.out.println(String.format("\t\t\tItem Limit: %.1f", SaveData.getItemLimit(root)));
		System.out.println(String.format("\t\t\tCollab Ban: %.1f", SaveData.getCollabBan(root)));
		System.out.println(String.format("\t\t\tSupers Ban: %.1f", SaveData.getSupersBan(root)));
		System.out.println(String.format("\t\t\tG-Rank Off: %.1f", SaveData.getGRankOff(root)));
		System.out.println(String.format("\t\t\tHardcore: %.1f", SaveData.getHardcore(root)));
		System.out.println(String.format("\t\t\tRefund All: %.1f", SaveData.getRefundAll(root)));

		System.out.println();
		System.out.println("HoloHouse:");
		printDisplay("\t", "Unlocked Furniture:", SaveData.getUnlockedFurnitures(root));
		System.out.println();
		System.out.println("\tFishing Pond:");
		System.out.println(String.format("\t\tSand: %.1f", SaveData.getSand(root)));
		System.out.println(String.format("\t\tActive Fish Rod: %s", getDisplay(SaveData.getActiveFishRod(root))));
		System.out.println();
		System.out.println("\tManagement:");
		System.out.println(String.format("\t\tLevel: %.1f", SaveData.getManagementLevel(root)));
		System.out.println(String.format("\t\tExp: %.1f", SaveData.getManagementExp(root)));
		System.out.println();
		System.out.println("\tCkia's Forge:");
		System.out.println(String.format("\t\tMine Level: %.1f", SaveData.getMineLevel(root)));
		System.out.println(String.format("\t\tMine Exp: %.1f", SaveData.getMineExp(root)));
		System.out.println(String.format("\t\tWoodcutting Level: %.1f", SaveData.getWoodcuttingLevel(root)));
		System.out.println(String.format("\t\tWoodcutting Exp: %.1f", SaveData.getWoodcuttingExp(root)));
		System.out.println(String.format("\t\tActive Pickaxe: %s", getDisplay(SaveData.getActivePickaxe(root))));
		System.out.println(String.format("\t\tActive Axe: %s", getDisplay(SaveData.getActiveAxe(root))));
		System.out.println();
		System.out.println("\tUsada Casino:");
		System.out.println(String.format("\t\tUsaChips: %.1f", SaveData.getUsaChips(root)));
		System.out.println(String.format("\t\tActive Pet: %s", getDisplay(SaveData.getActivePet(root))));
		System.out.println(String.format("\t\tActive Trail: %s", getDisplay(SaveData.getActiveTrail(root))));

		final Map<String, JsonElement> unknowns = SaveData.getUnknownFields(root);

		if (!unknowns.isEmpty()) {
			System.out.println();
			System.out.println(String.format("%d Unknowns?:", unknowns.size()));

			for (final Entry<String, JsonElement> entry : unknowns.entrySet()) {
				System.out.println(String.format("\t'%s': %s", entry.getKey(), entry.getValue().toString()));
			}
		}

		System.out.println();

		return 0;
	}

	private static void printDisplay(String tab, String header, Displayable[] values) {
		System.out.println(tab + header + " (" + values.length + ")");

		if (values.length == 0) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final Displayable value : values) {
				System.out.println(tab + String.format("\t%s", value.getDisplay()));
			}
		}
	}

	private static String getDisplay(Displayable value) {
		if (value == null) {
			return "null";
		}

		return value.getDisplay();
	}

}
