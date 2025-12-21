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
			// TODO: missing max level

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

			// TODO: upgrades

			System.out.println();
			System.out.println("HoloHouse:");

			printMissingDisplay("\t", "Missing Furniture:", SaveData.getUnlockedFurnitures(root), Furniture.values());

			System.out.println();
			System.out.println("\tFishing Pond:");

			printMissingDisplay("\t\t", "Missing Fish Rods:", SaveData.getUnlockedFishRods(root), FishRod.values());

			// TODO: cooking

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
			System.out.println(String.format("\tMajor Game Version: %,.1f", SaveData.getMajorGameVersion(root)));
			System.out.println(String.format("\tMinor Game Version: %,.1f", SaveData.getMinorGameVersion(root)));

			System.out.println();
			System.out.println("Main:");
			System.out.println(String.format("\tHoloCoins: %,.1f", SaveData.getHoloCoins(root)));
			System.out.println(String.format("\tRandom Money Key?: %,.1f", SaveData.getRandomMoneyKey(root)));
			System.out.println(String.format("\tTime Mode Unlocked: %b", SaveData.getTimeModeUnlocked(root)));
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
			System.out.println(String.format("\t\t\tSpecial Attack: %,.1f", SaveData.getSpecialAttack(root)));
			System.out.println(String.format("\t\t\tGrowth: %,.1f", SaveData.getGrowth(root)));
			System.out.println(String.format("\t\t\tReroll: %,.1f", SaveData.getReroll(root)));
			System.out.println(String.format("\t\t\tEliminate: %,.1f", SaveData.getEliminate(root)));
			System.out.println(String.format("\t\t\tHold Find: %,.1f", SaveData.getHoldFind(root)));
			System.out.println(String.format("\t\t\tCustomize: %,.1f", SaveData.getCustomize(root)));
			System.out.println(String.format("\t\t\tSupports: %,.1f", SaveData.getSupports(root)));
			System.out.println(String.format("\t\t\tMaterial Find: %,.1f", SaveData.getMaterialFind(root)));
			System.out.println(String.format("\t\t\tStamps: %,.1f", SaveData.getStamps(root)));
			System.out.println(String.format("\t\t\tEnchantments: %,.1f", SaveData.getEnchantments(root)));
			System.out.println(String.format("\t\t\tFandom: %,.1f", SaveData.getFandom(root)));
			System.out
					.println(String.format("\t\t\tFan Letters Unlocked: %,.1f", SaveData.getFanLettersUnlocked(root)));

			System.out.println();
			System.out.println("\t\tStats:");
			System.out.println(String.format("\t\t\tMax HP Up: %,.1f", SaveData.getMaxHpUp(root)));
			System.out.println(String.format("\t\t\tATK Up: %,.1f", SaveData.getAtkUp(root)));
			System.out.println(String.format("\t\t\tSPD Up: %,.1f", SaveData.getSpdUp(root)));
			System.out.println(String.format("\t\t\tCrit Up: %,.1f", SaveData.getCritUp(root)));
			System.out.println(String.format("\t\t\tPick Up Range: %,.1f", SaveData.getPickUpRange(root)));
			System.out.println(String.format("\t\t\tHaste Up: %,.1f", SaveData.getHasteUp(root)));
			System.out.println(String.format("\t\t\tRegeneration: %,.1f", SaveData.getRegeneration(root)));
			System.out.println(String.format("\t\t\tDefense Up: %,.1f", SaveData.getDefenseUp(root)));
			System.out.println(String.format("\t\t\tSpecial Cooldown Reduction: %,.1f",
					SaveData.getSpecialCooldownReduction(root)));
			System.out.println(String.format("\t\t\tSkill Up: %,.1f", SaveData.getSkillUp(root)));
			System.out.println(String.format("\t\t\tEXP Gain Up: %,.1f", SaveData.getExpGainUp(root)));
			System.out.println(String.format("\t\t\tFood Drops Up: %,.1f", SaveData.getFoodDropsUp(root)));
			System.out.println(String.format("\t\t\tMoney Gain Up: %,.1f", SaveData.getMoneyGainUp(root)));
			System.out.println(String.format("\t\t\tEnhancement Rate Up: %,.1f", SaveData.getEnhancementRateUp(root)));

			System.out.println();
			System.out.println("\t\tOther:");
			System.out.println(String.format("\t\t\tMarketing: %,.1f", SaveData.getMarketing(root)));
			System.out.println(String.format("\t\t\tWeapon Limit: %,.1f", SaveData.getWeaponLimit(root)));
			System.out.println(String.format("\t\t\tItem Limit: %,.1f", SaveData.getItemLimit(root)));
			System.out.println(String.format("\t\t\tCollab Ban: %,.1f", SaveData.getCollabBan(root)));
			System.out.println(String.format("\t\t\tSupers Ban: %,.1f", SaveData.getSupersBan(root)));
			System.out.println(String.format("\t\t\tG-Rank Off: %,.1f", SaveData.getGRankOff(root)));
			System.out.println(String.format("\t\t\tHardcore: %,.1f", SaveData.getHardcore(root)));
			System.out.println(String.format("\t\t\tRefund All: %,.1f", SaveData.getRefundAll(root)));

			System.out.println();
			System.out.println("HoloHouse:");
			printDisplay("\t", "Unlocked Furniture:", SaveData.getUnlockedFurnitures(root));
			System.out.println();
			System.out.println("\tFishing Pond:");
			System.out.println(String.format("\t\tSand: %,.1f", SaveData.getSand(root)));
			printDisplay("\t\t", "Unlocked Fish Rods:", SaveData.getUnlockedFishRods(root));
			System.out.println(String.format("\t\tActive Fish Rod: %s", getDisplay(SaveData.getActiveFishRod(root))));

			System.out.println();

			if (SaveData.getCookingActive(root) == Boolean.TRUE) {
				printDisplay("\t", "Cooked Foods:", SaveData.getCookedFoods(root));
			} else {
				System.out.println("\tCooking is NOT active.");
			}

			System.out.println();
			System.out.println("\tManagement:");
			System.out.println(String.format("\t\tLevel: %,.1f", SaveData.getManagementLevel(root)));
			System.out.println(String.format("\t\tExp: %,.1f", SaveData.getManagementExp(root)));
			System.out.println();

			System.out.println("\tCkia's Forge:");
			System.out.println(String.format("\t\tMine Level: %,.1f", SaveData.getMineLevel(root)));
			System.out.println(String.format("\t\tMine Exp: %,.1f", SaveData.getMineExp(root)));
			System.out.println(String.format("\t\tWoodcutting Level: %,.1f", SaveData.getWoodcuttingLevel(root)));
			System.out.println(String.format("\t\tWoodcutting Exp: %,.1f", SaveData.getWoodcuttingExp(root)));
			System.out.println();
			printDisplay("\t\t", "Unlocked Pickaxes:", SaveData.getUnlockedPickaxes(root));
			System.out.println(String.format("\t\tActive Pickaxe: %s", getDisplay(SaveData.getActivePickaxe(root))));
			System.out.println();
			printDisplay("\t\t", "Unlocked Axes:", SaveData.getUnlockedAxes(root));
			System.out.println(String.format("\t\tActive Axe: %s", getDisplay(SaveData.getActiveAxe(root))));
			System.out.println();
			printDisplay("\t\t", "Unlocked Prisms:", SaveData.getUnlockedPrisms(root));
			System.out.println(String.format("\t\tActive Prism: %s", getDisplay(SaveData.getActivePrism(root))));
			System.out.println();

			System.out.println("\tUsada Casino:");
			System.out.println(String.format("\t\tUsaChips: %,.1f", SaveData.getUsaChips(root)));
			System.out.println(String.format("\t\tActive Pet: %s", getDisplay(SaveData.getActivePet(root))));
			System.out.println(String.format("\t\tActive Trail: %s", getDisplay(SaveData.getActiveTrail(root))));
			System.out.println(String.format("\t\tUsada Drinks: %,.1f", SaveData.getUsadaDrinks(root)));
			System.out.println();
			printDisplay("\t\t", "Active Scams:", SaveData.getActiveScams(root));

			System.out.println();

			if (SaveData.getTowerSaveActive(root) == Boolean.TRUE) {
				System.out.println("\tTower of Suffering Save:");
				System.out.println(String.format("\t\tFlags: %,.1f", SaveData.getTowerSaveFlags(root)));
				System.out.println(String.format("\t\tTime?: %s", getDisplay(SaveData.getTowerSaveTime(root))));
				System.out.println(
						String.format("\t\tPosition: %s", getDisplayPosition(SaveData.getTowerSavePosition(root))));
				System.out.println(String.format("\t\tCheckpoint Position: %s",
						getDisplayPosition(SaveData.getTowerSaveCheckpointPosition(root))));
				System.out
						.println(String.format("\t\tNumber of Jumps: %,.1f", SaveData.getTowerSaveNumberOfJumps(root)));
				System.out
						.println(String.format("\t\tNumber of Falls: %,.1f", SaveData.getTowerSaveNumberOfFalls(root)));
				System.out.println(String.format("\t\tCoins?: %s", getDisplay(SaveData.getTowerSaveCoins(root))));
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

	private static String getDisplay(Displayable value) {
		if (value == null) {
			return "null";
		}

		return value.getDisplay();
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
