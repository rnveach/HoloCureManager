package com.github.rnveach.commands;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;
import com.github.rnveach.data.Axe;
import com.github.rnveach.data.Collaboration;
import com.github.rnveach.data.FanLetter;
import com.github.rnveach.data.FishRod;
import com.github.rnveach.data.Furniture;
import com.github.rnveach.data.Item;
import com.github.rnveach.data.MiscUnlock;
import com.github.rnveach.data.Outfit;
import com.github.rnveach.data.Pet;
import com.github.rnveach.data.Pickaxe;
import com.github.rnveach.data.SaveData;
import com.github.rnveach.data.Scam;
import com.github.rnveach.data.Stage;
import com.github.rnveach.data.Trail;
import com.github.rnveach.data.Weapon;
import com.google.gson.JsonElement;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.ParameterException;
import picocli.CommandLine.ParentCommand;

@Command(name = "update", aliases = { "--update", "-u" }, description = "Update only portions of a save file.", //
		subcommands = { UpdateRawCommand.class })
public class UpdateCommand implements Callable<Integer> {

	@ParentCommand
	private HoloCureManagerCli parent;

	@Option(names = { "-h", "--help" }, usageHelp = true)
	private boolean help;

	@Option(names = { "--holoCoins" }, description = "Update HoloCoins.")
	private Double holoCoins;

	@Option(names = { "--timeModeUnlocked" }, description = "Update if Time Mode is Unlocked.")
	private Boolean timeModeUnlocked;

	@Option(names = { "--removeAllUnlockStages" }, description = "Remove all Unlock Stages.")
	private Boolean removeAllUnlockStages;

	@Option(names = { "--unlockAllStages" }, description = "Unlock all known Stages.")
	private Boolean unlockAllStages;

	@Option(names = {
			"--addUnlockedStage" }, description = "Unlocked Stage(s) to add. Does nothing if stage is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Stage[] unlockStagesToAdd;

	@Option(names = {
			"--removeUnlockedStage" }, description = "Unlocked Stage(s) to remove. Does nothing if stage isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Stage[] unlockStagesToRemove;

	@Option(names = { "--removeAllUnlockOutfits" }, description = "Remove all Unlock Outfits.")
	private Boolean removeAllUnlockOutfits;

	@Option(names = { "--unlockAllOutfits" }, description = "Unlock all known Outfits.")
	private Boolean unlockAllOutfits;

	@Option(names = {
			"--addUnlockedOutfit" }, description = "Unlocked Outfit(s) to add. Does nothing if outfit is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Outfit[] unlockOutfitsToAdd;

	@Option(names = {
			"--removeUnlockedOutfit" }, description = "Unlocked Outfit(s) to remove. Does nothing if outfit isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Outfit[] unlockOutfitsToRemove;

	@Option(names = { "--removeAllUnlockWeapons" }, description = "Remove all Unlock Weapons.")
	private Boolean removeAllUnlockWeapons;

	@Option(names = { "--unlockAllWeapons" }, description = "Unlock all known Weapons.")
	private Boolean unlockAllWeapons;

	@Option(names = {
			"--addUnlockedWeapon" }, description = "Unlocked Weapon(s) to add. Does nothing if weapon is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Weapon[] unlockWeaponsToAdd;

	@Option(names = {
			"--removeUnlockedWeapon" }, description = "Unlocked Weapon(s) to remove. Does nothing if weapon isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Weapon[] unlockWeaponsToRemove;

	@Option(names = { "--removeAllUnlockItems" }, description = "Remove all Unlock Items.")
	private Boolean removeAllUnlockItems;

	@Option(names = { "--unlockAllItems" }, description = "Unlock all known Items.")
	private Boolean unlockAllItems;

	@Option(names = {
			"--addUnlockedItem" }, description = "Unlocked Item(s) to add. Does nothing if item is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Item[] unlockItemsToAdd;

	@Option(names = {
			"--removeUnlockedItem" }, description = "Unlocked Item(s) to remove. Does nothing if item isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Item[] unlockItemsToRemove;

	@Option(names = { "--removeAllSeenCollaborations" }, description = "Remove all Seen Collaborations.")
	private Boolean removeAllSeenCollaborations;

	@Option(names = { "--unlockAllSeenCollaborations" }, description = "Unlock all known Seen Collaborations.")
	private Boolean unlockAllSeenCollaborations;

	@Option(names = {
			"--addSeenCollaboration" }, description = "Seen Collaboration(s) to add. Does nothing if collaboration is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Collaboration[] seenCollaborationToAdd;

	@Option(names = {
			"--removeSeenCollaboration" }, description = "Seen Collaboration(s) to remove. Does nothing if collaboration isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Collaboration[] seenCollaborationToRemove;

	@Option(names = { "--removeAllFanLetters" }, description = "Remove all Fan Letters.")
	private Boolean removeAllFanLetters;

	@Option(names = { "--unlockAllFanLetters" }, description = "Unlock all known Fan Letters.")
	private Boolean unlockAllFanLetters;

	@Option(names = {
			"--addUnlockedFanLetter" }, description = "Fan Letter(s) to add. Does nothing if fan letter is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private FanLetter[] fanLettersToAdd;

	@Option(names = {
			"--removeUnlockedFanLetter" }, description = "Fan Letter(s) to remove. Does nothing if fan letter isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private FanLetter[] fanLettersToRemove;

	@Option(names = { "--specialAttack" }, description = "Update Special Attack.")
	private Double specialAttack;

	@Option(names = { "--growth" }, description = "Update Growth.")
	private Double growth;

	@Option(names = { "--reroll" }, description = "Update Reroll.")
	private Double reroll;

	@Option(names = { "--eliminate" }, description = "Update Eliminate.")
	private Double eliminate;

	@Option(names = { "--holdFind" }, description = "Update Hold Find.")
	private Double holdFind;

	@Option(names = { "--customize" }, description = "Update Customize.")
	private Double customize;

	@Option(names = { "--supports" }, description = "Update Supports.")
	private Double supports;

	@Option(names = { "--materialFind" }, description = "Update Material Find.")
	private Double materialFind;

	@Option(names = { "--stamps" }, description = "Update Stamps.")
	private Double stamps;

	@Option(names = { "--enchantments" }, description = "Update Enchantments.")
	private Double enchantments;

	@Option(names = { "--fandom" }, description = "Update Fandom.")
	private Double fandom;

	@Option(names = { "--fanLettersUnlocked" }, description = "Update Fan Letters Unlocked.")
	private Double fanLettersUnlocked;

	@Option(names = { "--maxHpUp" }, description = "Update Max HP Up.")
	private Double maxHpUp;

	@Option(names = { "--atkUp" }, description = "Update ATK Up.")
	private Double atkUp;

	@Option(names = { "--spdUp" }, description = "Update SPD Up.")
	private Double spdUp;

	@Option(names = { "--critUp" }, description = "Update Crit Up.")
	private Double critUp;

	@Option(names = { "--pickUpRange" }, description = "Update Pick Up Range.")
	private Double pickUpRange;

	@Option(names = { "--hasteUp" }, description = "Update Haste Up.")
	private Double hasteUp;

	@Option(names = { "--regeneration" }, description = "Update Regeneration.")
	private Double regeneration;

	@Option(names = { "--defenseUp" }, description = "Update Defense Up.")
	private Double defenseUp;

	@Option(names = { "--specialCooldownReduction" }, description = "Update Special Cooldown Reduction.")
	private Double specialCooldownReduction;

	@Option(names = { "--skillUp" }, description = "Update Skill Up.")
	private Double skillUp;

	@Option(names = { "--expGainUp" }, description = "Update EXP Gain Up.")
	private Double expGainUp;

	@Option(names = { "--foodDropsUp" }, description = "Update Food Drops Up.")
	private Double foodDropsUp;

	@Option(names = { "--moneyGainUp" }, description = "Update Money Gain Up.")
	private Double moneyGainUp;

	@Option(names = { "--enhancementRateUp" }, description = "Update Enhancement Rate Up.")
	private Double enhancementRateUp;

	@Option(names = { "--marketing" }, description = "Update Marketing.")
	private Double marketing;

	@Option(names = { "--weaponLimit" }, description = "Update Weapon Limit.")
	private Double weaponLimit;

	@Option(names = { "--itemLimit" }, description = "Update Item Limit.")
	private Double itemLimit;

	@Option(names = { "--collabBan" }, description = "Update Collab Ban.")
	private Double collabBan;

	@Option(names = { "--supersBan" }, description = "Update Supers Ban.")
	private Double supersBan;

	@Option(names = { "--gRankOff" }, description = "Update G Rank Off.")
	private Double gRankOff;

	@Option(names = { "--hardcore" }, description = "Update Hardcore.")
	private Double hardcore;

	@Option(names = { "--refundAll" }, description = "Update Refund All.")
	private Double refundAll;

	@Option(names = { "--removeAllUnlockFurnitures" }, description = "Remove all Unlock Furnitures.")
	private Boolean removeAllUnlockFurnitures;

	@Option(names = { "--unlockAllFurnitures" }, description = "Unlock all known Furnitures.")
	private Boolean unlockAllFurnitures;

	@Option(names = {
			"--addUnlockedFurniture" }, description = "Unlocked Furniture(s) to add. Does nothing if furniture is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Furniture[] unlockFurnituresToAdd;

	@Option(names = {
			"--removeUnlockedFurniture" }, description = "Unlocked Furniture(s) to remove. Does nothing if furniture isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Furniture[] unlockFurnituresToRemove;

	@Option(names = { "--sand" }, description = "Update Sand.")
	private Double sand;

	@Option(names = {
			"--activeFishRod" }, description = "Update Active Fish Rod. Valid values are: ${COMPLETION-CANDIDATES}.")
	private FishRod activeFishRod;

	@Option(names = { "--managementLevel" }, description = "Update Management Level.")
	private Double managementLevel;

	@Option(names = { "--managementExp" }, description = "Update Management Exp.")
	private Double managementExp;

	@Option(names = { "--mineLevel" }, description = "Update Mine Level.")
	private Double mineLevel;

	@Option(names = { "--mineExp" }, description = "Update Mine Exp.")
	private Double mineExp;

	@Option(names = { "--woodcuttingLevel" }, description = "Update Woodcutting Level.")
	private Double woodcuttingLevel;

	@Option(names = { "--woodcuttingExp" }, description = "Update Woodcutting Exp.")
	private Double woodcuttingExp;

	@Option(names = {
			"--activePickaxe" }, description = "Update Active Pickaxe. Valid values are: ${COMPLETION-CANDIDATES}.")
	private Pickaxe activePickaxe;

	@Option(names = { "--activeAxe" }, description = "Update Active Axe. Valid values are: ${COMPLETION-CANDIDATES}.")
	private Axe activeAxe;

	@Option(names = { "--usaChips" }, description = "Update UsaChips.")
	private Double usaChips;

	@Option(names = { "--activePet" }, description = "Update Active Pet. Valid values are: ${COMPLETION-CANDIDATES}.")
	private Pet activePet;

	@Option(names = {
			"--activeTrail" }, description = "Update Active Trail. Valid values are: ${COMPLETION-CANDIDATES}.")
	private Trail activeTrail;

	@Option(names = { "--usadaDrinks" }, description = "Update Usada Drinks.")
	private Double usadaDrinks;

	@Option(names = { "--removeAllActiveScams" }, description = "Remove all Active Scams.")
	private Boolean removeAllActiveScams;

	@Option(names = { "--unlockAllScams" }, description = "Unlock all known Scams.")
	private Boolean unlockAllScams;

	@Option(names = {
			"--addActiveScam" }, description = "Active Scam(s) to add. Does nothing if scam is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Scam[] activeScamToAdd;

	@Option(names = {
			"--removeActiveScam" }, description = "Active Scam(s) to remove. Does nothing if scam isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Scam[] activeScamToRemove;

	@Option(names = { "--removeAllActiveMiscUnlocks" }, description = "Remove all Active Misc. Unlocks.")
	private Boolean removeAllActiveMiscUnlocks;

	@Option(names = { "--unlockAllMiscUnlocks" }, description = "Unlock all known Misc. Unlocks.")
	private Boolean unlockAllMiscUnlocks;

	@Option(names = {
			"--addMiscUnlock" }, description = "Misc. Unlock(s) to add. Does nothing if item is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private MiscUnlock[] miscUnlockToAdd;

	@Option(names = {
			"--removeMiscUnlock" }, description = "Misc. Unlock(s) to remove. Does nothing if item isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private MiscUnlock[] miscUnlockToRemove;

	// TODO: unlocked pickaxes, axes, rods
	// TODO: tower of suffering

	public void validateOptions() {
		if ((this.holoCoins == null) && (this.timeModeUnlocked == null) && (this.removeAllUnlockStages == null)
				&& (this.unlockAllStages == null) && (this.unlockStagesToAdd == null)
				&& (this.unlockStagesToRemove == null) && (this.removeAllUnlockOutfits == null)
				&& (this.unlockAllOutfits == null) && (this.unlockOutfitsToAdd == null)
				&& (this.unlockOutfitsToRemove == null) && (this.removeAllUnlockItems == null)
				&& (this.unlockAllItems == null) && (this.unlockItemsToAdd == null)
				&& (this.unlockItemsToRemove == null) && (this.removeAllSeenCollaborations == null)
				&& (this.unlockAllSeenCollaborations == null) && (this.seenCollaborationToAdd == null)
				&& (this.seenCollaborationToRemove == null) && (this.removeAllUnlockWeapons == null)
				&& (this.unlockAllWeapons == null) && (this.unlockWeaponsToAdd == null)
				&& (this.unlockWeaponsToRemove == null) && (this.removeAllFanLetters == null)
				&& (this.unlockAllFanLetters == null) && (this.fanLettersToAdd == null)
				&& (this.fanLettersToRemove == null) && (this.specialAttack == null) && (this.growth == null)
				&& (this.reroll == null) && (this.eliminate == null) && (this.holdFind == null)
				&& (this.customize == null) && (this.supports == null) && (this.materialFind == null)
				&& (this.stamps == null) && (this.enchantments == null) && (this.fandom == null)
				&& (this.fanLettersUnlocked == null) && (this.maxHpUp == null) && (this.atkUp == null)
				&& (this.spdUp == null) && (this.critUp == null) && (this.pickUpRange == null) && (this.hasteUp == null)
				&& (this.regeneration == null) && (this.defenseUp == null) && (this.specialCooldownReduction == null)
				&& (this.skillUp == null) && (this.expGainUp == null) && (this.foodDropsUp == null)
				&& (this.moneyGainUp == null) && (this.enhancementRateUp == null) && (this.marketing == null)
				&& (this.weaponLimit == null) && (this.itemLimit == null) && (this.collabBan == null)
				&& (this.supersBan == null) && (this.gRankOff == null) && (this.hardcore == null)
				&& (this.refundAll == null) && (this.removeAllUnlockFurnitures == null)
				&& (this.unlockAllFurnitures == null) && (this.unlockFurnituresToAdd == null)
				&& (this.unlockFurnituresToRemove == null) && (this.sand == null) && (this.activeFishRod == null)
				&& (this.managementLevel == null) && (this.managementExp == null) && (this.mineLevel == null)
				&& (this.mineExp == null) && (this.woodcuttingLevel == null) && (this.woodcuttingExp == null)
				&& (this.activePickaxe == null) && (this.activeAxe == null) && (this.usaChips == null)
				&& (this.activePet == null) && (this.activeTrail == null) && (this.usadaDrinks == null)
				&& (this.removeAllActiveScams == null) && (this.unlockAllScams == null)
				&& (this.activeScamToAdd == null) && (this.activeScamToRemove == null)
				&& (this.removeAllActiveMiscUnlocks == null) && (this.unlockAllMiscUnlocks == null)
				&& (this.miscUnlockToAdd == null) && (this.miscUnlockToRemove == null)) {
			throw new ParameterException(this.parent.getSpec().commandLine(),
					"Error: Nothing was specified to be updated.");
		}

		this.parent.validateOptions();
	}

	@Override
	public Integer call() throws Exception {
		validateOptions();

		final JsonElement root = this.parent.getInputFileJson();

		if (this.holoCoins != null) {
			SaveData.setHoloCoins(root, this.holoCoins);
		}
		if (this.timeModeUnlocked != null) {
			SaveData.setTimeModeUnlocked(root, this.timeModeUnlocked);
		}
		if ((this.removeAllUnlockStages != null) && this.removeAllUnlockStages) {
			SaveData.setUnlockedStages(root, null);
		}
		if ((this.unlockAllStages != null) && this.unlockAllStages) {
			SaveData.setUnlockedStages(root, Stage.values());
		}
		if ((this.unlockStagesToAdd != null) || (this.unlockStagesToRemove != null)) {
			SaveData.setUnlockedStages(root,
					doAddRemove(SaveData.getUnlockedStages(root), this.unlockStagesToAdd, this.unlockStagesToRemove));
		}
		if ((this.removeAllUnlockOutfits != null) && this.removeAllUnlockOutfits) {
			SaveData.setUnlockedOutfits(root, null);
		}
		if ((this.unlockAllOutfits != null) && this.unlockAllOutfits) {
			SaveData.setUnlockedOutfits(root, Outfit.values());
		}
		if ((this.unlockOutfitsToAdd != null) || (this.unlockOutfitsToRemove != null)) {
			SaveData.setUnlockedOutfits(root, doAddRemove(SaveData.getUnlockedOutfits(root), this.unlockOutfitsToAdd,
					this.unlockOutfitsToRemove));
		}
		if ((this.removeAllUnlockWeapons != null) && this.removeAllUnlockWeapons) {
			SaveData.setUnlockedWeapons(root, null);
		}
		if ((this.unlockAllWeapons != null) && this.unlockAllWeapons) {
			SaveData.setUnlockedWeapons(root, Weapon.values());
		}
		if ((this.unlockWeaponsToAdd != null) || (this.unlockWeaponsToRemove != null)) {
			SaveData.setUnlockedWeapons(root, doAddRemove(SaveData.getUnlockedWeapons(root), this.unlockWeaponsToAdd,
					this.unlockWeaponsToRemove));
		}
		if ((this.removeAllUnlockItems != null) && this.removeAllUnlockItems) {
			SaveData.setUnlockedItems(root, null);
		}
		if ((this.unlockAllItems != null) && this.unlockAllItems) {
			SaveData.setUnlockedItems(root, Item.values());
		}
		if ((this.unlockItemsToAdd != null) || (this.unlockItemsToRemove != null)) {
			SaveData.setUnlockedItems(root,
					doAddRemove(SaveData.getUnlockedItems(root), this.unlockItemsToAdd, this.unlockItemsToRemove));
		}
		if ((this.removeAllSeenCollaborations != null) && this.removeAllSeenCollaborations) {
			SaveData.setSeenCollaborations(root, null);
		}
		if ((this.unlockAllSeenCollaborations != null) && this.unlockAllSeenCollaborations) {
			SaveData.setSeenCollaborations(root, Collaboration.values());
		}
		if ((this.seenCollaborationToAdd != null) || (this.seenCollaborationToRemove != null)) {
			SaveData.setSeenCollaborations(root, doAddRemove(SaveData.getSeenCollaborations(root),
					this.seenCollaborationToAdd, this.seenCollaborationToRemove));
		}
		if ((this.removeAllFanLetters != null) && this.removeAllFanLetters) {
			SaveData.setFanLetters(root, null);
		}
		if ((this.unlockAllFanLetters != null) && this.unlockAllFanLetters) {
			SaveData.setFanLetters(root, FanLetter.values());
		}
		if ((this.fanLettersToAdd != null) || (this.fanLettersToRemove != null)) {
			SaveData.setFanLetters(root,
					doAddRemove(SaveData.getFanLetters(root), this.fanLettersToAdd, this.fanLettersToRemove));
		}
		if (this.specialAttack != null) {
			SaveData.setSpecialAttack(root, this.specialAttack);
		}
		if (this.growth != null) {
			SaveData.setGrowth(root, this.growth);
		}
		if (this.reroll != null) {
			SaveData.setReroll(root, this.reroll);
		}
		if (this.eliminate != null) {
			SaveData.setEliminate(root, this.eliminate);
		}
		if (this.holdFind != null) {
			SaveData.setHoldFind(root, this.holdFind);
		}
		if (this.customize != null) {
			SaveData.setCustomize(root, this.customize);
		}
		if (this.supports != null) {
			SaveData.setSupports(root, this.supports);
		}
		if (this.materialFind != null) {
			SaveData.setMaterialFind(root, this.materialFind);
		}
		if (this.stamps != null) {
			SaveData.setStamps(root, this.stamps);
		}
		if (this.enchantments != null) {
			SaveData.setEnchantments(root, this.enchantments);
		}
		if (this.fandom != null) {
			SaveData.setFandom(root, this.fandom);
		}
		if (this.fanLettersUnlocked != null) {
			SaveData.setFanLettersUnlocked(root, this.fanLettersUnlocked);
		}
		if (this.maxHpUp != null) {
			SaveData.setMaxHpUp(root, this.maxHpUp);
		}
		if (this.atkUp != null) {
			SaveData.setAtkUp(root, this.atkUp);
		}
		if (this.spdUp != null) {
			SaveData.setSpdUp(root, this.spdUp);
		}
		if (this.critUp != null) {
			SaveData.setCritUp(root, this.critUp);
		}
		if (this.pickUpRange != null) {
			SaveData.setPickUpRange(root, this.pickUpRange);
		}
		if (this.hasteUp != null) {
			SaveData.setHasteUp(root, this.hasteUp);
		}
		if (this.regeneration != null) {
			SaveData.setRegeneration(root, this.regeneration);
		}
		if (this.defenseUp != null) {
			SaveData.setDefenseUp(root, this.defenseUp);
		}
		if (this.specialCooldownReduction != null) {
			SaveData.setSpecialCooldownReduction(root, this.specialCooldownReduction);
		}
		if (this.skillUp != null) {
			SaveData.setSkillUp(root, this.skillUp);
		}
		if (this.expGainUp != null) {
			SaveData.setExpGainUp(root, this.expGainUp);
		}
		if (this.foodDropsUp != null) {
			SaveData.setFoodDropsUp(root, this.foodDropsUp);
		}
		if (this.moneyGainUp != null) {
			SaveData.setMoneyGainUp(root, this.moneyGainUp);
		}
		if (this.enhancementRateUp != null) {
			SaveData.setEnhancementRateUp(root, this.enhancementRateUp);
		}
		if (this.marketing != null) {
			SaveData.setMarketing(root, this.marketing);
		}
		if (this.weaponLimit != null) {
			SaveData.setWeaponLimit(root, this.weaponLimit);
		}
		if (this.itemLimit != null) {
			SaveData.setItemLimit(root, this.itemLimit);
		}
		if (this.collabBan != null) {
			SaveData.setCollabBan(root, this.collabBan);
		}
		if (this.supersBan != null) {
			SaveData.setSupersBan(root, this.supersBan);
		}
		if (this.gRankOff != null) {
			SaveData.setGRankOff(root, this.gRankOff);
		}
		if (this.hardcore != null) {
			SaveData.setHardcore(root, this.hardcore);
		}
		if (this.refundAll != null) {
			SaveData.setRefundAll(root, this.refundAll);
		}
		if ((this.removeAllUnlockFurnitures != null) && this.removeAllUnlockFurnitures) {
			SaveData.setUnlockedFurnitures(root, null);
		}
		if ((this.unlockAllFurnitures != null) && this.unlockAllFurnitures) {
			SaveData.setUnlockedFurnitures(root, Furniture.values());
		}
		if ((this.unlockFurnituresToAdd != null) || (this.unlockFurnituresToRemove != null)) {
			SaveData.setUnlockedFurnitures(root, doAddRemove(SaveData.getUnlockedFurnitures(root),
					this.unlockFurnituresToAdd, this.unlockFurnituresToRemove));
		}
		if (this.sand != null) {
			SaveData.setSand(root, this.sand);
		}
		if (this.activeFishRod != null) {
			SaveData.setActiveFishRod(root, this.activeFishRod);
		}
		if (this.managementLevel != null) {
			SaveData.setManagementLevel(root, this.managementLevel);
		}
		if (this.managementExp != null) {
			SaveData.setManagementExp(root, this.managementExp);
		}
		if (this.mineLevel != null) {
			SaveData.setMineLevel(root, this.mineLevel);
		}
		if (this.mineExp != null) {
			SaveData.setMineExp(root, this.mineExp);
		}
		if (this.woodcuttingLevel != null) {
			SaveData.setWoodcuttingLevel(root, this.woodcuttingLevel);
		}
		if (this.woodcuttingExp != null) {
			SaveData.setWoodcuttingExp(root, this.woodcuttingExp);
		}
		if (this.activePickaxe != null) {
			SaveData.setActivePickaxe(root, this.activePickaxe);
		}
		if (this.activeAxe != null) {
			SaveData.setActiveAxe(root, this.activeAxe);
		}
		if (this.usaChips != null) {
			SaveData.setUsaChips(root, this.usaChips);
		}
		if (this.activePet != null) {
			SaveData.setActivePet(root, this.activePet);
		}
		if (this.activeTrail != null) {
			SaveData.setActiveTrail(root, this.activeTrail);
		}
		if (this.usadaDrinks != null) {
			SaveData.setUsadaDrinks(root, this.usadaDrinks);
		}
		if ((this.removeAllActiveScams != null) && this.removeAllActiveScams) {
			SaveData.setActiveScams(root, null);
		}
		if ((this.unlockAllScams != null) && this.unlockAllScams) {
			SaveData.setActiveScams(root, Scam.values());
		}
		if ((this.activeScamToAdd != null) || (this.activeScamToRemove != null)) {
			SaveData.setActiveScams(root,
					doAddRemove(SaveData.getActiveScams(root), this.activeScamToAdd, this.activeScamToRemove));
		}
		if ((this.removeAllActiveMiscUnlocks != null) && this.removeAllActiveMiscUnlocks) {
			SaveData.setMiscUnlocks(root, null);
		}
		if ((this.unlockAllMiscUnlocks != null) && this.unlockAllMiscUnlocks) {
			SaveData.setMiscUnlocks(root, MiscUnlock.values());
		}
		if ((this.miscUnlockToAdd != null) || (this.miscUnlockToRemove != null)) {
			SaveData.setMiscUnlocks(root,
					doAddRemove(SaveData.getMiscUnlocks(root), this.miscUnlockToAdd, this.miscUnlockToRemove));
		}

		this.parent.writeToInputFile(root.toString());

		return 0;
	}

	private static <T> T[] doAddRemove(T[] original, T[] adds, T[] removes) {
		final Set<T> newList = new HashSet<>(asList(original));

		if (adds != null) {
			for (final T add : adds) {
				newList.add(add);
			}
		}
		if (removes != null) {
			for (final T remove : removes) {
				newList.remove(remove);
			}
		}

		@SuppressWarnings("unchecked")
		final T[] result = (T[]) Array.newInstance(
				original == null ? newList.iterator().next().getClass() : original.getClass().getComponentType(),
				newList.size());

		return newList.toArray(result);
	}

	private static <T> List<T> asList(T[] array) {
		if (array == null) {
			return new ArrayList<>();
		}

		return Arrays.asList(array);
	}

	public HoloCureManagerCli getParent() {
		return this.parent;
	}

}
