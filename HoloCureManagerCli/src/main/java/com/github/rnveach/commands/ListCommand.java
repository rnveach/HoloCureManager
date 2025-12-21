package com.github.rnveach.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import com.github.rnveach.HoloCureManagerCli;
import com.github.rnveach.data.AchievementName;
import com.github.rnveach.data.Achievements;
import com.github.rnveach.data.Axe;
import com.github.rnveach.data.Collaboration;
import com.github.rnveach.data.CookedFood;
import com.github.rnveach.data.CookedFoodItem;
import com.github.rnveach.data.Displayable;
import com.github.rnveach.data.FanLetter;
import com.github.rnveach.data.FandomExperience;
import com.github.rnveach.data.FishRod;
import com.github.rnveach.data.Furniture;
import com.github.rnveach.data.GatchaRank;
import com.github.rnveach.data.Generation;
import com.github.rnveach.data.Idol;
import com.github.rnveach.data.Inventory;
import com.github.rnveach.data.InventoryItem;
import com.github.rnveach.data.Item;
import com.github.rnveach.data.MiscUnlock;
import com.github.rnveach.data.Outfit;
import com.github.rnveach.data.Pickaxe;
import com.github.rnveach.data.Prism;
import com.github.rnveach.data.SaveData;
import com.github.rnveach.data.Scam;
import com.github.rnveach.data.Stage;
import com.github.rnveach.data.Tears;
import com.github.rnveach.data.Weapon;
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

	@Option(names = { "-m", "--missing" }, description = "List only things missing from 100%%.")
	private boolean missing;

	private void validateOptions() {
		this.parent.validateOptions();
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		final JsonElement root = this.parent.getInputFileJson();

		// a ? represents unknown

		if (this.missing) {
			// TODO: missing max level for some complex classes

			System.out.println("Main:");

			printMissingDisplay("\t", "Missing Stages:", SaveData.getUnlockedStages(root), Stage.values());
			printMissingDisplay("\t", "Missing Gatcha Ranks:", SaveData.getGatchaRanks(root));
			printMissingDisplay("\t", "Missing Fandom Experiences:", SaveData.getFandomExperiences(root));
			printMissingDisplay("\t", "Missing Tears:", SaveData.getTears(root));

			printMissingDisplay("\t", "Missing Outfits:", SaveData.getUnlockedOutfits(root), Outfit.values());
			printMissingDisplay("\t", "Missing Weapons:", SaveData.getUnlockedWeapons(root), Weapon.values());
			printMissingDisplay("\t", "Missing Items:", SaveData.getUnlockedItems(root), Item.values());
			printMissingDisplay("\t", "Missing Collaborations:", SaveData.getSeenCollaborations(root),
					Collaboration.values());
			printMissingDisplay("\t", "Missing Fan Letters:", SaveData.getFanLetters(root), FanLetter.values());

			System.out.println();
			System.out.println("\tUpgrades:");
			System.out.println("\t\tAbilities:");
			printMissingDisplay("\t\t\t", "Missing Special Attack", SaveData.getSpecialAttack(root),
					SaveData.SPECIAL_ATTACK_MAX);
			printMissingDisplay("\t\t\t", "Missing Growth", SaveData.getGrowth(root), SaveData.GROWTH_MAX);
			printMissingDisplay("\t\t\t", "Missing Reroll", SaveData.getReroll(root), SaveData.REROLL_MAX);
			printMissingDisplay("\t\t\t", "Missing Eliminate", SaveData.getEliminate(root), SaveData.ELIMINATE_MAX);
			printMissingDisplay("\t\t\t", "Missing Hold Find", SaveData.getHoldFind(root), SaveData.HOLD_FIND_MAX);
			printMissingDisplay("\t\t\t", "Missing Customize", SaveData.getCustomize(root), SaveData.CUSTOMIZE_MAX);
			printMissingDisplay("\t\t\t", "Missing Supports", SaveData.getSupports(root), SaveData.SUPPORTS_MAX);
			printMissingDisplay("\t\t\t", "Missing Material Find", SaveData.getMaterialFind(root),
					SaveData.MATERIAL_FIND_MAX);
			printMissingDisplay("\t\t\t", "Missing Stamps", SaveData.getStamps(root), SaveData.STAMPS_MAX);
			printMissingDisplay("\t\t\t", "Missing Enchantments", SaveData.getEnchantments(root),
					SaveData.ENCHANTMENTS_MAX);
			printMissingDisplay("\t\t\t", "Missing Fandom", SaveData.getFandom(root), SaveData.FANDOM_MAX);
			printMissingDisplay("\t\t\t", "Missing Fan Letters Unlocked", SaveData.getFanLettersUnlocked(root),
					SaveData.FAN_LETTERS_UNLOCKED_MAX);

			System.out.println();
			System.out.println("\t\tStats:");
			printMissingDisplay("\t\t\t", "Missing Max HP Up", SaveData.getMaxHpUp(root), SaveData.MAX_HP_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing ATK Up", SaveData.getAtkUp(root), SaveData.ATK_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing SPD Up", SaveData.getSpdUp(root), SaveData.SPD_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Crit Up", SaveData.getCritUp(root), SaveData.CRIT_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Pick Up Range", SaveData.getPickUpRange(root),
					SaveData.PICK_UP_RANGE_MAX);
			printMissingDisplay("\t\t\t", "Missing Haste Up", SaveData.getHasteUp(root), SaveData.HASTE_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Regeneration", SaveData.getRegeneration(root),
					SaveData.REGENERATION_MAX);
			printMissingDisplay("\t\t\t", "Missing Defense Up", SaveData.getDefenseUp(root), SaveData.DEFENSE_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Special Cooldown Reduction",
					SaveData.getSpecialCooldownReduction(root), SaveData.SPECIAL_COOLDOWN_REDUCTION_MAX);
			printMissingDisplay("\t\t\t", "Missing Skill Up", SaveData.getSkillUp(root), SaveData.SKILL_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing EXP Gain Up", SaveData.getExpGainUp(root), SaveData.EXP_GAIN_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Food Drops Up", SaveData.getFoodDropsUp(root),
					SaveData.FOOD_DROPS_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Money Gain Up", SaveData.getMoneyGainUp(root),
					SaveData.MONEY_GAIN_UP_MAX);
			printMissingDisplay("\t\t\t", "Missing Enhancement Rate Up", SaveData.getEnhancementRateUp(root),
					SaveData.ENHANCEMENT_RATE_UP_MAX);

			System.out.println();
			System.out.println("\t\tOther:");
			printMissingDisplay("\t\t\t", "Missing Marketing", SaveData.getMarketing(root), SaveData.MARKETING_MAX);
			// others are not really required, just make the game harder

			System.out.println();
			System.out.println("HoloHouse:");

			printMissingDisplay("\t", "Missing Furniture:", SaveData.getUnlockedFurnitures(root), Furniture.values());

			System.out.println();
			System.out.println("\tFishing Pond:");

			printMissingDisplay("\t\t", "Missing Fish Rods:", SaveData.getUnlockedFishRods(root), FishRod.values());

			if (SaveData.getCookingActive(root) == Boolean.TRUE) {
				printMissingDisplay("\t", "Missing Cooked Foods:", SaveData.getCookedFoods(root));
			} else {
				System.out.println("\tCooking is NOT active.");
			}

			System.out.println();
			System.out.println("\tCkia's Forge:");
			printMissingDisplay("\t\t", "Missing Pickaxes:", SaveData.getUnlockedPickaxes(root), Pickaxe.values());
			printMissingDisplay("\t\t", "Missing Axes:", SaveData.getUnlockedAxes(root), Axe.values());
			printMissingDisplay("\t\t", "Missing Prisms:", SaveData.getUnlockedPrisms(root), Prism.values());

			System.out.println();
			System.out.println("\tUsada Casino:");
			printMissingDisplay("\t\t", "Missing Scams:", SaveData.getActiveScams(root), Scam.values());

			printMissingDisplay("\t", "Missing Inventory:", SaveData.getInventory(root));
			printMissingDisplay("\t", "Missing Misc. Unlocks:", SaveData.getMiscUnlocks(root), MiscUnlock.values());
			printMissingDisplay("\t", "Missing Achievements:", SaveData.getAchievements(root));
		} else {
			System.out.println("Game:");
			printDisplay("\t", "Major Game Version", SaveData.getMajorGameVersion(root));
			printDisplay("\t", "Minor Game Version", SaveData.getMinorGameVersion(root));

			System.out.println();
			System.out.println("Main:");
			printDisplay("\t", "HoloCoins", SaveData.getHoloCoins(root));
			printDisplay("\t", "Random Money Key?", SaveData.getRandomMoneyKey(root));
			printDisplay("\t", "Time Mode Unlocked", SaveData.getTimeModeUnlocked(root));
			System.out.println();
			printDisplay("\t", "Unlocked Stages:", SaveData.getUnlockedStages(root));
			System.out.println();
			printDisplay("\t", "Gatcha Ranks:", SaveData.getGatchaRanks(root));
			System.out.println();
			printDisplay("\t", "Fandom Experiences:", SaveData.getFandomExperiences(root));
			System.out.println();
			printDisplay("\t", "Tears:", SaveData.getTears(root));
			System.out.println();
			printDisplay("\t", "Unlocked Outfits:", SaveData.getUnlockedOutfits(root));
			System.out.println();
			printDisplay("\t", "Unlocked Weapons:", SaveData.getUnlockedWeapons(root));
			System.out.println();
			printDisplay("\t", "Unlocked Items:", SaveData.getUnlockedItems(root));
			System.out.println();
			printDisplay("\t", "Seen Collaborations:", SaveData.getSeenCollaborations(root));
			System.out.println();
			printDisplay("\t", "Fan Letters:", SaveData.getFanLetters(root));

			System.out.println();
			System.out.println("\tUpgrades:");
			System.out.println("\t\tAbilities:");
			printDisplay("\t\t\t", "Special Attack", SaveData.getSpecialAttack(root));
			printDisplay("\t\t\t", "Growth", SaveData.getGrowth(root));
			printDisplay("\t\t\t", "Reroll", SaveData.getReroll(root));
			printDisplay("\t\t\t", "Eliminate", SaveData.getEliminate(root));
			printDisplay("\t\t\t", "Hold Find", SaveData.getHoldFind(root));
			printDisplay("\t\t\t", "Customize", SaveData.getCustomize(root));
			printDisplay("\t\t\t", "Supports", SaveData.getSupports(root));
			printDisplay("\t\t\t", "Material Find", SaveData.getMaterialFind(root));
			printDisplay("\t\t\t", "Stamps", SaveData.getStamps(root));
			printDisplay("\t\t\t", "Enchantments", SaveData.getEnchantments(root));
			printDisplay("\t\t\t", "Fandom", SaveData.getFandom(root));
			printDisplay("\t\t\t", "Fan Letters Unlocked", SaveData.getFanLettersUnlocked(root));

			System.out.println();
			System.out.println("\t\tStats:");
			printDisplay("\t\t\t", "Max HP Up", SaveData.getMaxHpUp(root));
			printDisplay("\t\t\t", "ATK Up", SaveData.getAtkUp(root));
			printDisplay("\t\t\t", "SPD Up", SaveData.getSpdUp(root));
			printDisplay("\t\t\t", "Crit Up", SaveData.getCritUp(root));
			printDisplay("\t\t\t", "Pick Up Range", SaveData.getPickUpRange(root));
			printDisplay("\t\t\t", "Haste Up", SaveData.getHasteUp(root));
			printDisplay("\t\t\t", "Regeneration", SaveData.getRegeneration(root));
			printDisplay("\t\t\t", "Defense Up", SaveData.getDefenseUp(root));
			printDisplay("\t\t\t", "Special Cooldown Reduction", SaveData.getSpecialCooldownReduction(root));
			printDisplay("\t\t\t", "Skill Up", SaveData.getSkillUp(root));
			printDisplay("\t\t\t", "EXP Gain Up", SaveData.getExpGainUp(root));
			printDisplay("\t\t\t", "Food Drops Up", SaveData.getFoodDropsUp(root));
			printDisplay("\t\t\t", "Money Gain Up", SaveData.getMoneyGainUp(root));
			printDisplay("\t\t\t", "Enhancement Rate Up", SaveData.getEnhancementRateUp(root));

			System.out.println();
			System.out.println("\t\tOther:");
			printDisplay("\t\t\t", "Marketing", SaveData.getMarketing(root));
			printDisplay("\t\t\t", "Weapon Limit", SaveData.getWeaponLimit(root));
			printDisplay("\t\t\t", "Item Limit", SaveData.getItemLimit(root));
			printDisplay("\t\t\t", "Collab Ban", SaveData.getCollabBan(root));
			printDisplay("\t\t\t", "Supers Ban", SaveData.getSupersBan(root));
			printDisplay("\t\t\t", "G-Rank Off", SaveData.getGRankOff(root));
			printDisplay("\t\t\t", "Hardcore", SaveData.getHardcore(root));
			printDisplay("\t\t\t", "Refund All", SaveData.getRefundAll(root));

			System.out.println();
			System.out.println("HoloHouse:");
			printDisplay("\t", "Unlocked Furniture:", SaveData.getUnlockedFurnitures(root));
			System.out.println();
			System.out.println("\tFishing Pond:");
			printDisplay("\t\t", "Sand", SaveData.getSand(root));
			printDisplay("\t\t", "Unlocked Fish Rods:", SaveData.getUnlockedFishRods(root));
			printDisplay("\t\t", "Active Fish Rod", SaveData.getActiveFishRod(root));

			System.out.println();

			if (SaveData.getCookingActive(root) == Boolean.TRUE) {
				printDisplay("\t", "Cooked Foods:", SaveData.getCookedFoods(root));
			} else {
				System.out.println("\tCooking is NOT active.");
			}

			System.out.println();
			System.out.println("\tManagement:");
			printDisplay("\t\t", "Level", SaveData.getManagementLevel(root));
			printDisplay("\t\t", "Exp", SaveData.getManagementExp(root));
			System.out.println();

			System.out.println("\tCkia's Forge:");
			printDisplay("\t\t", "Mine Level", SaveData.getMineLevel(root));
			printDisplay("\t\t", "Mine Exp", SaveData.getMineExp(root));
			printDisplay("\t\t", "Woodcutting Level", SaveData.getWoodcuttingLevel(root));
			printDisplay("\t\t", "Woodcutting Exp", SaveData.getWoodcuttingExp(root));
			System.out.println();
			printDisplay("\t\t", "Unlocked Pickaxes:", SaveData.getUnlockedPickaxes(root));
			printDisplay("\t\t", "Active Pickaxe", SaveData.getActivePickaxe(root));
			System.out.println();
			printDisplay("\t\t", "Unlocked Axes:", SaveData.getUnlockedAxes(root));
			printDisplay("\t\t", "Active Axe", SaveData.getActiveAxe(root));
			System.out.println();
			printDisplay("\t\t", "Unlocked Prisms:", SaveData.getUnlockedPrisms(root));
			printDisplay("\t\t", "Active Prism", SaveData.getActivePrism(root));
			System.out.println();

			System.out.println("\tUsada Casino:");
			printDisplay("\t\t", "UsaChips", SaveData.getUsaChips(root));
			printDisplay("\t\t", "Active Pet", SaveData.getActivePet(root));
			printDisplay("\t\t", "Active Trail", SaveData.getActiveTrail(root));
			printDisplay("\t\t", "Usada Drinks", SaveData.getUsadaDrinks(root));
			System.out.println();
			printDisplay("\t\t", "Active Scams:", SaveData.getActiveScams(root));

			System.out.println();

			if (SaveData.getTowerSaveActive(root) == Boolean.TRUE) {
				System.out.println("\tTower of Suffering Save:");
				printDisplay("\t\t", "Flags", SaveData.getTowerSaveFlags(root));
				printDisplay("\t\t", "Time?", getDisplay(SaveData.getTowerSaveTime(root)));
				printDisplay("\t\t", "Position", getDisplayPosition(SaveData.getTowerSavePosition(root)));
				printDisplay("\t\t", "Checkpoint Position",
						getDisplayPosition(SaveData.getTowerSaveCheckpointPosition(root)));
				printDisplay("\t\t", "Number of Jumps", SaveData.getTowerSaveNumberOfJumps(root));
				printDisplay("\t\t", "Number of Falls", SaveData.getTowerSaveNumberOfFalls(root));
				printDisplay("\t\t", "Coins?", getDisplay(SaveData.getTowerSaveCoins(root)));
			} else {
				System.out.println("\tTower of Suffering Save is NOT active.");
			}

			System.out.println();
			printDisplay("\t", "Inventory:", SaveData.getInventory(root));

			System.out.println();
			printDisplay("\t", "Misc. Unlocks:", SaveData.getMiscUnlocks(root));

			System.out.println();
			printDisplay("\t", "Achievements:", SaveData.getAchievements(root));
		}

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

	private static void printDisplay(String tab, String header, String value) {
		System.out.println(tab + String.format("%s: %s", header, value));
	}

	private static void printDisplay(String tab, String header, Boolean value) {
		System.out.println(tab + String.format("%s: %b", header, value));
	}

	private static void printDisplay(String tab, String header, Double value) {
		System.out.println(tab + String.format("%s: %,.1f", header, value));
	}

	private static void printDisplay(String tab, String header, Displayable value) {
		System.out.println(tab + String.format("%s: %s", header, value == null ? "null" : value.getDisplay()));
	}

	private static <T extends Displayable> void printDisplay(String tab, String header, List<T> values) {
		System.out.println(tab + header + " (" + values.size() + ")");

		if (values.size() == 0) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final Displayable value : values) {
				System.out.println(tab + String.format("\t%s", value.getDisplay()));
			}
		}
	}

	private static void printDisplay(String tab, String header, Displayable[] values) {
		System.out.println(tab + header + " (" + (values == null ? 0 : values.length) + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final Displayable value : values) {
				System.out.println(tab + String.format("\t%s", value.getDisplay()));
			}
		}
	}

	private static void printDisplay(String tab, String header, GatchaRank[] values) {
		System.out.println(tab + header + " (" + (values == null ? 0 : values.length) + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final GatchaRank value : values) {
				System.out.println(tab + String.format("\t%s - %,.1f", value.getIdol().getDisplay(), value.getRank()));
			}
		}
	}

	private static void printDisplay(String tab, String header, FandomExperience[] values) {
		System.out.println(tab + header + " (" + (values == null ? 0 : values.length) + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final FandomExperience value : values) {
				System.out.println(
						tab + String.format("\t%s - %,.1f", value.getIdol().getDisplay(), value.getExperience()));
			}
		}
	}

	private static void printDisplay(String tab, String header, Tears[] values) {
		System.out.println(tab + header + " (" + (values == null ? 0 : values.length) + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final Tears value : values) {
				System.out.println(
						tab + String.format("\t%s - %,.1f", value.getGeneration().getDisplay(), value.getCount()));
			}
		}
	}

	private static void printDisplay(String tab, String header, CookedFood[] values) {
		System.out.println(tab + header + " (" + (values == null ? 0 : values.length) + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final CookedFood value : values) {
				System.out.println(
						tab + String.format("\t%s - %,.1f", value.getFoodItem().getDisplay(), value.getCount()));
			}
		}
	}

	private static void printDisplay(String tab, String header, Inventory[] values) {
		System.out.println(tab + header + " (" + (values == null ? 0 : values.length) + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final Inventory value : values) {
				System.out.println(tab + String.format("\t%s - %,.1f (Total: %,.1f)", value.getItem().getDisplay(),
						value.getCount(), value.getTotal()));
			}
		}
	}

	private static void printDisplay(String tab, String header, Achievements[] values) {
		int count = 0;

		if (values != null) {
			for (final Achievements value : values) {
				if (!value.isUnlocked()) {
					continue;
				}

				count++;
			}
		}

		System.out.println(tab + header + " (" + count + ")");

		if ((values == null) || (values.length == 0)) {
			System.out.println(tab + "\t<None>");
		} else {
			for (final Achievements value : values) {
				if (!value.isUnlocked()) {
					continue;
				}

				System.out.println(tab + String.format("\t%s", value.getAchievementName().getDisplay()));
			}
		}
	}

	private static String getDisplay(Double[] values) {
		if ((values == null) || (values.length == 0)) {
			return "[]";
		}

		return "[" + //
				Arrays.stream(values).map(n -> String.format("%,.1f", n)).collect(Collectors.joining(", ")) //
				+ "]";
	}

	private static String getDisplayPosition(Double[] position) {
		if ((position == null) || (position.length == 0)) {
			return "";
		}
		if (position.length != 2) {
			return "<ERROR>";
		}

		return String.format("( X: %,.1f , Y: %,.1f )", position[0], position[1]);
	}

	private static void printMissingDisplay(String tab, String header, Double value, int max) {
		if ((value == null) || (value < max)) {
			System.out.println(tab + String.format("%s - %,.1f (max is %,d)", header, value, max));
		}
	}

	private static void printMissingDisplay(String tab, String header, Displayable[] values, Displayable[] allValues) {
		final List<Displayable> missing = new ArrayList<>();

		for (final Displayable displayable : allValues) {
			boolean found = false;

			if (values != null) {
				for (final Displayable value : values) {
					if (value == displayable) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(displayable);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

	private static void printMissingDisplay(String tab, String header, GatchaRank[] values) {
		final List<Idol> missing = new ArrayList<>();

		for (final Idol idol : Idol.values()) {
			boolean found = false;

			if (values != null) {
				for (final GatchaRank value : values) {
					if (value.getIdol() == idol) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(idol);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

	private static void printMissingDisplay(String tab, String header, FandomExperience[] values) {
		final List<Idol> missing = new ArrayList<>();

		for (final Idol idol : Idol.values()) {
			// doesn't apply here
			if ((idol == Idol.EMPTY) || (idol == Idol.RANDOM)) {
				continue;
			}

			boolean found = false;

			if (values != null) {
				for (final FandomExperience value : values) {
					if (value.getIdol() == idol) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(idol);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

	private static void printMissingDisplay(String tab, String header, Tears[] values) {
		final List<Generation> missing = new ArrayList<>();

		for (final Generation generation : Generation.values()) {
			boolean found = false;

			if (values != null) {
				for (final Tears value : values) {
					if (value.getGeneration() == generation) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(generation);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

	private static void printMissingDisplay(String tab, String header, CookedFood[] values) {
		final List<CookedFoodItem> missing = new ArrayList<>();

		for (final CookedFoodItem cookedFood : CookedFoodItem.values()) {
			boolean found = false;

			if (values != null) {
				for (final CookedFood value : values) {
					if (value.getFoodItem() == cookedFood) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(cookedFood);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

	private static void printMissingDisplay(String tab, String header, Inventory[] values) {
		final List<InventoryItem> missing = new ArrayList<>();

		for (final InventoryItem inventoryItem : InventoryItem.values()) {
			boolean found = false;

			if (values != null) {
				for (final Inventory value : values) {
					if (value.getItem() == inventoryItem) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(inventoryItem);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

	private static void printMissingDisplay(String tab, String header, Achievements[] values) {
		final List<AchievementName> missing = new ArrayList<>();

		for (final AchievementName achievementName : AchievementName.values()) {
			boolean found = false;

			if (values != null) {
				for (final Achievements value : values) {
					if (value.isUnlocked() && (value.getAchievementName() == achievementName)) {
						found = true;
						break;
					}
				}
			}

			if (!found) {
				missing.add(achievementName);
			}
		}

		if (missing.size() > 0) {
			System.out.println();

			printDisplay(tab, header, missing);
		}
	}

}
