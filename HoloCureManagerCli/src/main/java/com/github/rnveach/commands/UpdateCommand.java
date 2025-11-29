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

	@Option(names = { "--timeModeUnlocked" }, description = "Update if Time Mode is Unlocked.")
	private Boolean timeModeUnlocked;

	@Option(names = { "--growth" }, description = "Update Growth.")
	private Double growth;

	@Option(names = { "--reroll" }, description = "Update Reroll.")
	private Double reroll;

	@Option(names = { "--eliminate" }, description = "Update Eliminate.")
	private Double eliminate;

	@Option(names = { "--holdFind" }, description = "Update Hold Find.")
	private Double holdFind;

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

	@Option(names = { "--usaChips" }, description = "Update UsaChips.")
	private Double usaChips;

	// TODO: raw support

	private void validateOptions() {
		if ((this.holoCoins == null) && (this.timeModeUnlocked == null) && (this.growth == null)
				&& (this.reroll == null) && (this.eliminate == null) && (this.holdFind == null)
				&& (this.supports == null) && (this.materialFind == null) && (this.stamps == null)
				&& (this.enchantments == null) && (this.fandom == null) && (this.fanLetters == null)
				&& (this.maxHpUp == null) && (this.atkUp == null) && (this.spdUp == null) && (this.critUp == null)
				&& (this.pickUpRange == null) && (this.hasteUp == null) && (this.regeneration == null)
				&& (this.specialCooldownReduction == null) && (this.skillUp == null) && (this.expGainUp == null)
				&& (this.foodDropsUp == null) && (this.moneyGainUp == null) && (this.enhancementRateUp == null)
				&& (this.weaponLimit == null) && (this.itemLimit == null) && (this.collabBan == null)
				&& (this.supersBan == null) && (this.gRankOff == null) && (this.hardcore == null)
				&& (this.refundAll == null) && (this.sand == null) && (this.usaChips == null)) {
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
		if (this.timeModeUnlocked != null) {
			SaveData.setTimeModeUnlocked(root, this.timeModeUnlocked);
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
		if (this.usaChips != null) {
			SaveData.setUsaChips(root, this.usaChips);
		}

		this.parent.writeToInputFile(root.toString());

		return 0;
	}

}
