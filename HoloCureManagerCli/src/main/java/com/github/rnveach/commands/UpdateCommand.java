package com.github.rnveach.commands;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

import com.github.rnveach.HoloCureManagerCli;
import com.github.rnveach.data.Axe;
import com.github.rnveach.data.FishRod;
import com.github.rnveach.data.Pet;
import com.github.rnveach.data.Pickaxe;
import com.github.rnveach.data.SaveData;
import com.github.rnveach.data.Stage;
import com.github.rnveach.data.Trail;
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

	@Option(names = { "--unlockAllStages" }, description = "Unlock all known Stages.")
	private Boolean unlockAllStages;

	@Option(names = {
			"--addUnlockedStage" }, description = "Unlocked Stage(s) to add. Does nothing if stage is already unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Stage[] unlockStagesToAdd;

	@Option(names = {
			"--removeUnlockedStage" }, description = "Unlocked Stage(s) to remove. Does nothing if stage isn't unlocked. Valid values are: ${COMPLETION-CANDIDATES}.", arity = "0..*")
	private Stage[] unlockStagesToRemove;

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

	@Option(names = { "--fanLetters" }, description = "Update Fan Letters.")
	private Double fanLetters;

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

	public void validateOptions() {
		if ((this.holoCoins == null) && (this.timeModeUnlocked == null) && (this.unlockAllStages == null)
				&& (this.unlockStagesToAdd == null) && (this.unlockStagesToRemove == null)
				&& (this.specialAttack == null) && (this.growth == null) && (this.reroll == null)
				&& (this.eliminate == null) && (this.holdFind == null) && (this.customize == null)
				&& (this.supports == null) && (this.materialFind == null) && (this.stamps == null)
				&& (this.enchantments == null) && (this.fandom == null) && (this.fanLetters == null)
				&& (this.maxHpUp == null) && (this.atkUp == null) && (this.spdUp == null) && (this.critUp == null)
				&& (this.pickUpRange == null) && (this.hasteUp == null) && (this.regeneration == null)
				&& (this.defenseUp == null) && (this.specialCooldownReduction == null) && (this.skillUp == null)
				&& (this.expGainUp == null) && (this.foodDropsUp == null) && (this.moneyGainUp == null)
				&& (this.enhancementRateUp == null) && (this.marketing == null) && (this.weaponLimit == null)
				&& (this.itemLimit == null) && (this.collabBan == null) && (this.supersBan == null)
				&& (this.gRankOff == null) && (this.hardcore == null) && (this.refundAll == null) && (this.sand == null)
				&& (this.activeFishRod == null) && (this.managementLevel == null) && (this.managementExp == null)
				&& (this.mineLevel == null) && (this.mineExp == null) && (this.woodcuttingLevel == null)
				&& (this.woodcuttingExp == null) && (this.activePickaxe == null) && (this.activeAxe == null)
				&& (this.usaChips == null) && (this.activePet == null) && (this.activeTrail == null)) {
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
		if ((this.unlockAllStages != null) && this.unlockAllStages) {
			SaveData.setUnlockedStages(root, Stage.values());
		}
		if ((this.unlockStagesToAdd != null) && (this.unlockStagesToRemove != null)) {
			SaveData.setUnlockedStages(root,
					doAddRemove(SaveData.getUnlockedStages(root), this.unlockStagesToAdd, this.unlockStagesToRemove));
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
		if (this.fanLetters != null) {
			SaveData.setFanLetters(root, this.fanLetters);
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

		this.parent.writeToInputFile(root.toString());

		return 0;
	}

	private static <T> T[] doAddRemove(T[] original, T[] adds, T[] removes) {
		final Set<T> newList = new HashSet<>(Arrays.asList(original));

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
		final T[] result = (T[]) Array.newInstance(original.getClass().getComponentType(), newList.size());

		return newList.toArray(result);
	}

	public HoloCureManagerCli getParent() {
		return this.parent;
	}

}
