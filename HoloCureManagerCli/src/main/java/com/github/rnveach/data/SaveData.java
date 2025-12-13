package com.github.rnveach.data;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

public final class SaveData {

	public static final String MAJOR_GAME_VERSION = "GameVersionNumberMajor";

	public static final String MINOR_GAME_VERSION = "GameVersionNumberMinor";

	public static final String GAME_TIME = "trackedTime";

	public static final String HOLO_COINS = "holoCoins";

	public static final String RANDOM_MONEY_KEY = "randomMoneyKey";

	public static final String TIME_MODE_UNLOCKED = "timeModeUnlocked";

	public static final String UNLOCKED_STAGES = "unlockedStages";

	public static final String GATCHA_RANKS = "characters";

	public static final String FANDOM_EXPERIENCES = "fandomEXP";

	public static final String TEARS = "tears";

	public static final String UNLOCKED_OUTFITS = "unlockedOutfits";

	public static final String UNLOCKED_WEAPONS = "unlockedWeapons";

	public static final String UNLOCKED_ITEMS = "unlockedItems";

	public static final String SEEN_COLLABORATIONS = "seenCollabs";

	public static final String FAN_LETTERS = "fanletters";

	public static final int SPECIAL_ATTACK_MAX = 1;
	public static final String SPECIAL_ATTACK = "specUnlock";

	public static final int GROWTH_MAX = 3;
	public static final String GROWTH = "growth";

	public static final int REROLL_MAX = 10;
	public static final String REROLL = "reroll";

	public static final int ELIMINATE_MAX = 5;
	public static final String ELIMINATE = "eliminate";

	public static final int HOLD_FIND_MAX = 5;
	public static final String HOLD_FIND = "holdOption";

	public static final int CUSTOMIZE_MAX = 1;
	public static final String CUSTOMIZE = "canDisable";

	public static final int SUPPORTS_MAX = 1;
	public static final String SUPPORTS = "supports";

	public static final int MATERIAL_FIND_MAX = 1;
	public static final String MATERIAL_FIND = "materialDrops";

	public static final int STAMPS_MAX = 1;
	public static final String STAMPS = "stamps";

	public static final int ENCHANTMENTS_MAX = 1;
	public static final String ENCHANTMENTS = "enchantments";

	public static final int FANDOM_MAX = 1;
	public static final String FANDOM = "fandom";

	public static final int FAN_LETTERS_UNLOCKED_MAX = 1;
	public static final String FAN_LETTERS_UNLOCKED = "fanLetterUnlock";

	public static final int MAX_HP_UP_MAX = 10;
	public static final String MAX_HP_UP = "HP";

	public static final int ATK_UP_MAX = 10;
	public static final String ATK_UP = "ATK";

	public static final int SPD_UP_MAX = 10;
	public static final String SPD_UP = "SPD";

	public static final int CRIT_UP_MAX = 5;
	public static final String CRIT_UP = "crit";

	public static final int PICK_UP_RANGE_MAX = 10;
	public static final String PICK_UP_RANGE = "pickupRange";

	public static final int HASTE_UP_MAX = 5;
	public static final String HASTE_UP = "haste";

	public static final int REGENERATION_MAX = 5;
	public static final String REGENERATION = "regen";

	public static final int DEFENSE_UP_MAX = 5;
	public static final String DEFENSE_UP = "DR";

	public static final int SPECIAL_COOLDOWN_REDUCTION_MAX = 5;
	public static final String SPECIAL_COOLDOWN_REDUCTION = "specCDR";

	public static final int SKILL_UP_MAX = 10;
	public static final String SKILL_UP = "skillDamage";

	public static final int EXP_GAIN_UP_MAX = 5;
	public static final String EXP_GAIN_UP = "EXP";

	public static final int FOOD_DROPS_UP_MAX = 5;
	public static final String FOOD_DROPS_UP = "food";

	public static final int MONEY_GAIN_UP_MAX = 10;
	public static final String MONEY_GAIN_UP = "moneyGain";

	public static final int ENHANCEMENT_RATE_UP_MAX = 5;
	public static final String ENHANCEMENT_RATE_UP = "enhanceUp";

	public static final int MARKETING_MAX = 5;
	public static final String MARKETING = "mobUp";

	public static final int WEAPON_LIMIT_MAX = 5;
	public static final String WEAPON_LIMIT = "weaponLimit";

	public static final int ITEM_LIMIT_MAX = 6;
	public static final String ITEM_LIMIT = "itemLimit";

	public static final int COLLAB_BAN_MAX = 1;
	public static final String COLLAB_BAN = "noCollabs";

	public static final int SUPERS_BAN_MAX = 1;
	public static final String SUPERS_BAN = "noSupers";

	public static final int G_RANK_OFF_MAX = 1;
	public static final String G_RANK_OFF = "GROff";

	public static final int HARDCORE_MAX = 1;
	public static final String HARDCORE = "challenge";

	public static final int REFUND_ALL_MAX = 1;
	public static final String REFUND_ALL = "refund";

	public static final String UNLOCKED_FURNITURES = "unlockedFurniture";

	public static final String SAND = "fishSand";

	public static final String UNLOCKED_FISH_RODS = "rodUnlock";

	public static final String ACTIVE_FISH_ROD = "fishRod";

	public static final String MANAGEMENT_LEVEL = "manageLevel";

	public static final String MANAGEMENT_EXP = "manageEXP";

	public static final String MINE_LEVEL = "mineLevel";

	public static final String MINE_EXP = "mineEXP";

	public static final String WOODCUTTING_LEVEL = "woodLevel";

	public static final String WOODCUTTING_EXP = "woodEXP";

	public static final String UNLOCKED_PICKAXES = "pickUnlock";

	public static final String ACTIVE_PICKAXE = "usingPick";

	public static final String UNLOCKED_AXES = "axeUnlock";

	public static final String ACTIVE_AXE = "usingAxe";

	public static final String USA_CHIPS = "holoChips";

	public static final String ACTIVE_PET = "activePet";

	public static final String ACTIVE_TRAIL = "activeTrail";

	public static final String USADA_DRINKS = "usadaDrinks";

	public static final String ACTIVE_SCAMS = "activeScams";

	public static final String TOWER_SAVE_ACTIVE = "towerSave";

	public static final String TOWER_SAVE_FLAGS = "towerFlags";

	public static final String TOWER_SAVE_TIME = "towerTime";

	public static final String TOWER_SAVE_POSITION = "towerlastPos";

	public static final String TOWER_SAVE_CHECKPOINT_POSITION = "towerCheckPoint";

	public static final String TOWER_SAVE_NUMBER_OF_JUMPS = "towerJumps";

	public static final String TOWER_SAVE_NUMBER_OF_FALLS = "towerFalls";

	public static final String TOWER_SAVE_COINS = "towerCoins";

	public static final String INVENTORY = "inventory";

	public static final String MISC_UNLOCKS = "miscUnlocks";

	public static Double getMajorGameVersion(JsonElement element) {
		return getDouble(element, MAJOR_GAME_VERSION);
	}

	public static Double getMinorGameVersion(JsonElement element) {
		return getDouble(element, MINOR_GAME_VERSION);
	}

	public static Double getHoloCoins(JsonElement element) {
		return getDouble(element, HOLO_COINS);
	}

	public static void setHoloCoins(JsonElement element, Double value) {
		setDouble(element, HOLO_COINS, value);
	}

	public static Double getRandomMoneyKey(JsonElement element) {
		return getDouble(element, RANDOM_MONEY_KEY);
	}

	public static Boolean getTimeModeUnlocked(JsonElement element) {
		return getBoolean(element, TIME_MODE_UNLOCKED);
	}

	public static void setTimeModeUnlocked(JsonElement element, Boolean value) {
		setBoolean(element, TIME_MODE_UNLOCKED, value);
	}

	public static Stage[] getUnlockedStages(JsonElement element) {
		return Stage.get(getArrayString(element, UNLOCKED_STAGES));
	}

	public static void setUnlockedStages(JsonElement element, Stage[] values) {
		setArrayString(element, UNLOCKED_STAGES, Stage.convert(values));
	}

	public static GatchaRank[] getGatchaRanks(JsonElement element) {
		return GatchaRank.get(getJsonArray(element, GATCHA_RANKS));
	}

	public static void setGatchaRanks(JsonElement element, GatchaRank[] values) {
		setJsonArray(element, GATCHA_RANKS, GatchaRank.convert(values));
	}

	public static FandomExperience[] getFandomExperiences(JsonElement element) {
		return FandomExperience.get(getJsonArray(element, FANDOM_EXPERIENCES));
	}

	public static void setFandomExperiences(JsonElement element, FandomExperience[] values) {
		setJsonArray(element, FANDOM_EXPERIENCES, FandomExperience.convert(values));
	}

	public static Tears[] getTears(JsonElement element) {
		return Tears.get(getJsonArray(element, TEARS));
	}

	public static void setTears(JsonElement element, Tears[] values) {
		setJsonArray(element, TEARS, Tears.convert(values));
	}

	public static Outfit[] getUnlockedOutfits(JsonElement element) {
		return Outfit.get(getArrayString(element, UNLOCKED_OUTFITS));
	}

	public static void setUnlockedOutfits(JsonElement element, Outfit[] values) {
		setArrayString(element, UNLOCKED_OUTFITS, Outfit.convert(values));
	}

	public static Weapon[] getUnlockedWeapons(JsonElement element) {
		return Weapon.get(getArrayString(element, UNLOCKED_WEAPONS));
	}

	public static void setUnlockedWeapons(JsonElement element, Weapon[] values) {
		setArrayString(element, UNLOCKED_WEAPONS, Weapon.convert(values));
	}

	public static Item[] getUnlockedItems(JsonElement element) {
		return Item.get(getArrayString(element, UNLOCKED_ITEMS));
	}

	public static void setUnlockedItems(JsonElement element, Item[] values) {
		setArrayString(element, UNLOCKED_ITEMS, Item.convert(values));
	}

	public static Collaboration[] getSeenCollaborations(JsonElement element) {
		return Collaboration.get(getArrayString(element, SEEN_COLLABORATIONS));
	}

	public static void setSeenCollaborations(JsonElement element, Collaboration[] values) {
		setArrayString(element, SEEN_COLLABORATIONS, Collaboration.convert(values));
	}

	public static FanLetter[] getFanLetters(JsonElement element) {
		return FanLetter.get(getArrayString(element, FAN_LETTERS));
	}

	public static void setFanLetters(JsonElement element, FanLetter[] values) {
		setArrayString(element, FAN_LETTERS, FanLetter.convert(values));
	}

	public static Double getSpecialAttack(JsonElement element) {
		return getDouble(element, SPECIAL_ATTACK);
	}

	public static void setSpecialAttack(JsonElement element, Double value) {
		if ((value != null) && (value > SPECIAL_ATTACK_MAX)) {
			value = (double) SPECIAL_ATTACK_MAX;
		}

		setDouble(element, SPECIAL_ATTACK, value);
	}

	public static Double getGrowth(JsonElement element) {
		return getDouble(element, GROWTH);
	}

	public static void setGrowth(JsonElement element, Double value) {
		if ((value != null) && (value > GROWTH_MAX)) {
			value = (double) GROWTH_MAX;
		}

		setDouble(element, GROWTH, value);
	}

	public static Double getReroll(JsonElement element) {
		return getDouble(element, REROLL);
	}

	public static void setReroll(JsonElement element, Double value) {
		if ((value != null) && (value > REROLL_MAX)) {
			value = (double) REROLL_MAX;
		}

		setDouble(element, REROLL, value);
	}

	public static Double getEliminate(JsonElement element) {
		return getDouble(element, ELIMINATE);
	}

	public static void setEliminate(JsonElement element, Double value) {
		if ((value != null) && (value > ELIMINATE_MAX)) {
			value = (double) ELIMINATE_MAX;
		}

		setDouble(element, ELIMINATE, value);
	}

	public static Double getHoldFind(JsonElement element) {
		return getDouble(element, HOLD_FIND);
	}

	public static void setHoldFind(JsonElement element, Double value) {
		if ((value != null) && (value > HOLD_FIND_MAX)) {
			value = (double) HOLD_FIND_MAX;
		}

		setDouble(element, HOLD_FIND, value);
	}

	public static Double getCustomize(JsonElement element) {
		return getDouble(element, CUSTOMIZE);
	}

	public static void setCustomize(JsonElement element, Double value) {
		if ((value != null) && (value > CUSTOMIZE_MAX)) {
			value = (double) CUSTOMIZE_MAX;
		}

		setDouble(element, CUSTOMIZE, value);
	}

	public static Double getSupports(JsonElement element) {
		return getDouble(element, SUPPORTS);
	}

	public static void setSupports(JsonElement element, Double value) {
		if ((value != null) && (value > SUPPORTS_MAX)) {
			value = (double) SUPPORTS_MAX;
		}

		setDouble(element, SUPPORTS, value);
	}

	public static Double getMaterialFind(JsonElement element) {
		return getDouble(element, MATERIAL_FIND);
	}

	public static void setMaterialFind(JsonElement element, Double value) {
		if ((value != null) && (value > MATERIAL_FIND_MAX)) {
			value = (double) MATERIAL_FIND_MAX;
		}

		setDouble(element, MATERIAL_FIND, value);
	}

	public static Double getStamps(JsonElement element) {
		return getDouble(element, STAMPS);
	}

	public static void setStamps(JsonElement element, Double value) {
		if ((value != null) && (value > STAMPS_MAX)) {
			value = (double) STAMPS_MAX;
		}

		setDouble(element, STAMPS, value);
	}

	public static Double getEnchantments(JsonElement element) {
		return getDouble(element, ENCHANTMENTS);
	}

	public static void setEnchantments(JsonElement element, Double value) {
		if ((value != null) && (value > ENCHANTMENTS_MAX)) {
			value = (double) ENCHANTMENTS_MAX;
		}

		setDouble(element, ENCHANTMENTS, value);
	}

	public static Double getFandom(JsonElement element) {
		return getDouble(element, FANDOM);
	}

	public static void setFandom(JsonElement element, Double value) {
		if ((value != null) && (value > FANDOM_MAX)) {
			value = (double) FANDOM_MAX;
		}

		setDouble(element, FANDOM, value);
	}

	public static Double getFanLettersUnlocked(JsonElement element) {
		return getDouble(element, FAN_LETTERS_UNLOCKED);
	}

	public static void setFanLettersUnlocked(JsonElement element, Double value) {
		if ((value != null) && (value > FAN_LETTERS_UNLOCKED_MAX)) {
			value = (double) FAN_LETTERS_UNLOCKED_MAX;
		}

		setDouble(element, FAN_LETTERS_UNLOCKED, value);
	}

	public static Double getMaxHpUp(JsonElement element) {
		return getDouble(element, MAX_HP_UP);
	}

	public static void setMaxHpUp(JsonElement element, Double value) {
		if ((value != null) && (value > MAX_HP_UP_MAX)) {
			value = (double) MAX_HP_UP_MAX;
		}

		setDouble(element, MAX_HP_UP, value);
	}

	public static Double getAtkUp(JsonElement element) {
		return getDouble(element, ATK_UP);
	}

	public static void setAtkUp(JsonElement element, Double value) {
		if ((value != null) && (value > ATK_UP_MAX)) {
			value = (double) ATK_UP_MAX;
		}

		setDouble(element, ATK_UP, value);
	}

	public static Double getSpdUp(JsonElement element) {
		return getDouble(element, SPD_UP);
	}

	public static void setSpdUp(JsonElement element, Double value) {
		if ((value != null) && (value > SPD_UP_MAX)) {
			value = (double) SPD_UP_MAX;
		}

		setDouble(element, SPD_UP, value);
	}

	public static Double getCritUp(JsonElement element) {
		return getDouble(element, CRIT_UP);
	}

	public static void setCritUp(JsonElement element, Double value) {
		if ((value != null) && (value > CRIT_UP_MAX)) {
			value = (double) CRIT_UP_MAX;
		}

		setDouble(element, CRIT_UP, value);
	}

	public static Double getPickUpRange(JsonElement element) {
		return getDouble(element, PICK_UP_RANGE);
	}

	public static void setPickUpRange(JsonElement element, Double value) {
		if ((value != null) && (value > PICK_UP_RANGE_MAX)) {
			value = (double) PICK_UP_RANGE_MAX;
		}

		setDouble(element, PICK_UP_RANGE, value);
	}

	public static Double getHasteUp(JsonElement element) {
		return getDouble(element, HASTE_UP);
	}

	public static void setHasteUp(JsonElement element, Double value) {
		if ((value != null) && (value > HASTE_UP_MAX)) {
			value = (double) HASTE_UP_MAX;
		}

		setDouble(element, HASTE_UP, value);
	}

	public static Double getRegeneration(JsonElement element) {
		return getDouble(element, REGENERATION);
	}

	public static void setRegeneration(JsonElement element, Double value) {
		if ((value != null) && (value > REGENERATION_MAX)) {
			value = (double) REGENERATION_MAX;
		}

		setDouble(element, REGENERATION, value);
	}

	public static Double getDefenseUp(JsonElement element) {
		return getDouble(element, DEFENSE_UP);
	}

	public static void setDefenseUp(JsonElement element, Double value) {
		if ((value != null) && (value > DEFENSE_UP_MAX)) {
			value = (double) DEFENSE_UP_MAX;
		}

		setDouble(element, DEFENSE_UP, value);
	}

	public static Double getSpecialCooldownReduction(JsonElement element) {
		return getDouble(element, SPECIAL_COOLDOWN_REDUCTION);
	}

	public static void setSpecialCooldownReduction(JsonElement element, Double value) {
		if ((value != null) && (value > SPECIAL_COOLDOWN_REDUCTION_MAX)) {
			value = (double) SPECIAL_COOLDOWN_REDUCTION_MAX;
		}

		setDouble(element, SPECIAL_COOLDOWN_REDUCTION, value);
	}

	public static Double getSkillUp(JsonElement element) {
		return getDouble(element, SKILL_UP);
	}

	public static void setSkillUp(JsonElement element, Double value) {
		if ((value != null) && (value > SKILL_UP_MAX)) {
			value = (double) SKILL_UP_MAX;
		}

		setDouble(element, SKILL_UP, value);
	}

	public static Double getExpGainUp(JsonElement element) {
		return getDouble(element, EXP_GAIN_UP);
	}

	public static void setExpGainUp(JsonElement element, Double value) {
		if ((value != null) && (value > EXP_GAIN_UP_MAX)) {
			value = (double) EXP_GAIN_UP_MAX;
		}

		setDouble(element, EXP_GAIN_UP, value);
	}

	public static Double getFoodDropsUp(JsonElement element) {
		return getDouble(element, FOOD_DROPS_UP);
	}

	public static void setFoodDropsUp(JsonElement element, Double value) {
		if ((value != null) && (value > FOOD_DROPS_UP_MAX)) {
			value = (double) FOOD_DROPS_UP_MAX;
		}

		setDouble(element, FOOD_DROPS_UP, value);
	}

	public static Double getMoneyGainUp(JsonElement element) {
		return getDouble(element, MONEY_GAIN_UP);
	}

	public static void setMoneyGainUp(JsonElement element, Double value) {
		if ((value != null) && (value > MONEY_GAIN_UP_MAX)) {
			value = (double) MONEY_GAIN_UP_MAX;
		}

		setDouble(element, MONEY_GAIN_UP, value);
	}

	public static Double getEnhancementRateUp(JsonElement element) {
		return getDouble(element, ENHANCEMENT_RATE_UP);
	}

	public static void setEnhancementRateUp(JsonElement element, Double value) {
		if ((value != null) && (value > ENHANCEMENT_RATE_UP_MAX)) {
			value = (double) ENHANCEMENT_RATE_UP_MAX;
		}

		setDouble(element, ENHANCEMENT_RATE_UP, value);
	}

	public static Double getMarketing(JsonElement element) {
		return getDouble(element, MARKETING);
	}

	public static void setMarketing(JsonElement element, Double value) {
		if ((value != null) && (value > MARKETING_MAX)) {
			value = (double) MARKETING_MAX;
		}

		setDouble(element, MARKETING, value);
	}

	public static Double getWeaponLimit(JsonElement element) {
		return getDouble(element, WEAPON_LIMIT);
	}

	public static void setWeaponLimit(JsonElement element, Double value) {
		if ((value != null) && (value > WEAPON_LIMIT_MAX)) {
			value = (double) WEAPON_LIMIT_MAX;
		}

		setDouble(element, WEAPON_LIMIT, value);
	}

	public static Double getItemLimit(JsonElement element) {
		return getDouble(element, ITEM_LIMIT);
	}

	public static void setItemLimit(JsonElement element, Double value) {
		if ((value != null) && (value > ITEM_LIMIT_MAX)) {
			value = (double) ITEM_LIMIT_MAX;
		}

		setDouble(element, ITEM_LIMIT, value);
	}

	public static Double getCollabBan(JsonElement element) {
		return getDouble(element, COLLAB_BAN);
	}

	public static void setCollabBan(JsonElement element, Double value) {
		if ((value != null) && (value > COLLAB_BAN_MAX)) {
			value = (double) COLLAB_BAN_MAX;
		}

		setDouble(element, COLLAB_BAN, value);
	}

	public static Double getSupersBan(JsonElement element) {
		return getDouble(element, SUPERS_BAN);
	}

	public static void setSupersBan(JsonElement element, Double value) {
		if ((value != null) && (value > SUPERS_BAN_MAX)) {
			value = (double) SUPERS_BAN_MAX;
		}

		setDouble(element, SUPERS_BAN, value);
	}

	public static Double getGRankOff(JsonElement element) {
		return getDouble(element, G_RANK_OFF);
	}

	public static void setGRankOff(JsonElement element, Double value) {
		if ((value != null) && (value > G_RANK_OFF_MAX)) {
			value = (double) G_RANK_OFF_MAX;
		}

		setDouble(element, G_RANK_OFF, value);
	}

	public static Double getHardcore(JsonElement element) {
		return getDouble(element, HARDCORE);
	}

	public static void setHardcore(JsonElement element, Double value) {
		if ((value != null) && (value > HARDCORE_MAX)) {
			value = (double) HARDCORE_MAX;
		}

		setDouble(element, HARDCORE, value);
	}

	public static Double getRefundAll(JsonElement element) {
		return getDouble(element, REFUND_ALL);
	}

	public static void setRefundAll(JsonElement element, Double value) {
		if ((value != null) && (value > REFUND_ALL_MAX)) {
			value = (double) REFUND_ALL_MAX;
		}

		setDouble(element, REFUND_ALL, value);
	}

	public static Furniture[] getUnlockedFurnitures(JsonElement element) {
		return Furniture.get(getArrayString(element, UNLOCKED_FURNITURES));
	}

	public static void setUnlockedFurnitures(JsonElement element, Furniture[] values) {
		setArrayString(element, UNLOCKED_FURNITURES, Furniture.convert(values));
	}

	public static Double getSand(JsonElement element) {
		return getDouble(element, SAND);
	}

	public static void setSand(JsonElement element, Double value) {
		setDouble(element, SAND, value);
	}

	public static FishRod[] getUnlockedFishRods(JsonElement element) {
		return FishRod.get(getArrayDouble(element, UNLOCKED_FISH_RODS));
	}

	public static void setUnlockedFishRods(JsonElement element, FishRod[] values) {
		setArrayDouble(element, UNLOCKED_FISH_RODS, FishRod.convert(values));
	}

	public static FishRod getActiveFishRod(JsonElement element) {
		return FishRod.get(getDouble(element, ACTIVE_FISH_ROD));
	}

	public static void setActiveFishRod(JsonElement element, FishRod value) {
		setDouble(element, ACTIVE_FISH_ROD, value == null ? null : value.getCode());
	}

	public static Double getManagementLevel(JsonElement element) {
		return getDouble(element, MANAGEMENT_LEVEL);
	}

	public static void setManagementLevel(JsonElement element, Double value) {
		setDouble(element, MANAGEMENT_LEVEL, value);
	}

	public static Double getManagementExp(JsonElement element) {
		return getDouble(element, MANAGEMENT_EXP);
	}

	public static void setManagementExp(JsonElement element, Double value) {
		setDouble(element, MANAGEMENT_EXP, value);
	}

	public static Double getMineLevel(JsonElement element) {
		return getDouble(element, MINE_LEVEL);
	}

	public static void setMineLevel(JsonElement element, Double value) {
		setDouble(element, MINE_LEVEL, value);
	}

	public static Double getMineExp(JsonElement element) {
		return getDouble(element, MINE_EXP);
	}

	public static void setMineExp(JsonElement element, Double value) {
		setDouble(element, MINE_EXP, value);
	}

	public static Double getWoodcuttingLevel(JsonElement element) {
		return getDouble(element, WOODCUTTING_LEVEL);
	}

	public static void setWoodcuttingLevel(JsonElement element, Double value) {
		setDouble(element, WOODCUTTING_LEVEL, value);
	}

	public static Double getWoodcuttingExp(JsonElement element) {
		return getDouble(element, WOODCUTTING_EXP);
	}

	public static void setWoodcuttingExp(JsonElement element, Double value) {
		setDouble(element, WOODCUTTING_EXP, value);
	}

	public static Pickaxe[] getUnlockedPickaxes(JsonElement element) {
		return Pickaxe.get(getArrayDouble(element, UNLOCKED_PICKAXES));
	}

	public static void setUnlockedPickaxes(JsonElement element, Pickaxe[] values) {
		setArrayDouble(element, UNLOCKED_PICKAXES, Pickaxe.convert(values));
	}

	public static Pickaxe getActivePickaxe(JsonElement element) {
		return Pickaxe.get(getDouble(element, ACTIVE_PICKAXE));
	}

	public static void setActivePickaxe(JsonElement element, Pickaxe value) {
		setDouble(element, ACTIVE_PICKAXE, value == null ? null : value.getCode());
	}

	public static Axe[] getUnlockedAxes(JsonElement element) {
		return Axe.get(getArrayDouble(element, UNLOCKED_AXES));
	}

	public static void setUnlockedAxes(JsonElement element, Axe[] values) {
		setArrayDouble(element, UNLOCKED_AXES, Axe.convert(values));
	}

	public static Axe getActiveAxe(JsonElement element) {
		return Axe.get(getDouble(element, ACTIVE_AXE));
	}

	public static void setActiveAxe(JsonElement element, Axe value) {
		setDouble(element, ACTIVE_AXE, value == null ? null : value.getCode());
	}

	public static Double getUsaChips(JsonElement element) {
		return getDouble(element, USA_CHIPS);
	}

	public static void setUsaChips(JsonElement element, Double value) {
		setDouble(element, USA_CHIPS, value);
	}

	public static Pet getActivePet(JsonElement element) {
		return Pet.get(getString(element, ACTIVE_PET));
	}

	public static void setActivePet(JsonElement element, Pet value) {
		setString(element, ACTIVE_PET, value == null ? null : value.getCode());
	}

	public static Trail getActiveTrail(JsonElement element) {
		return Trail.get(getString(element, ACTIVE_TRAIL));
	}

	public static void setActiveTrail(JsonElement element, Trail value) {
		setString(element, ACTIVE_TRAIL, value == null ? null : value.getCode());
	}

	public static Double getUsadaDrinks(JsonElement element) {
		return getDouble(element, USADA_DRINKS);
	}

	public static void setUsadaDrinks(JsonElement element, Double value) {
		setDouble(element, USADA_DRINKS, value);
	}

	public static Scam[] getActiveScams(JsonElement element) {
		return Scam.get(getArrayString(element, ACTIVE_SCAMS));
	}

	public static void setActiveScams(JsonElement element, Scam[] values) {
		setArrayString(element, ACTIVE_SCAMS, Scam.convert(values));
	}

	public static Boolean getTowerSaveActive(JsonElement element) {
		return getBoolean(element, TOWER_SAVE_ACTIVE);
	}

	public static void setTowerSaveActive(JsonElement element, Boolean value) {
		setBoolean(element, TOWER_SAVE_ACTIVE, value);
	}

	public static Double getTowerSaveFlags(JsonElement element) {
		return getDouble(element, TOWER_SAVE_FLAGS);
	}

	public static void setTowerSaveFlags(JsonElement element, Double value) {
		setDouble(element, TOWER_SAVE_FLAGS, value);
	}

	public static Double[] getTowerSaveTime(JsonElement element) {
		return getArrayDouble(element, TOWER_SAVE_TIME);
	}

	public static void setTowerSaveTime(JsonElement element, Double[] values) {
		setArrayDouble(element, TOWER_SAVE_TIME, values);
	}

	public static Double[] getTowerSavePosition(JsonElement element) {
		return getArrayDouble(element, TOWER_SAVE_POSITION);
	}

	public static void setTowerSavePosition(JsonElement element, Double[] values) {
		setArrayDouble(element, TOWER_SAVE_POSITION, values);
	}

	public static Double[] getTowerSaveCheckpointPosition(JsonElement element) {
		return getArrayDouble(element, TOWER_SAVE_CHECKPOINT_POSITION);
	}

	public static void setTowerSaveCheckpointPosition(JsonElement element, Double[] values) {
		setArrayDouble(element, TOWER_SAVE_CHECKPOINT_POSITION, values);
	}

	public static Double getTowerSaveNumberOfJumps(JsonElement element) {
		return getDouble(element, TOWER_SAVE_NUMBER_OF_JUMPS);
	}

	public static void setTowerSaveNumberOfJumps(JsonElement element, Double value) {
		setDouble(element, TOWER_SAVE_NUMBER_OF_JUMPS, value);
	}

	public static Double getTowerSaveNumberOfFalls(JsonElement element) {
		return getDouble(element, TOWER_SAVE_NUMBER_OF_FALLS);
	}

	public static void setTowerSaveNumberOfFalls(JsonElement element, Double value) {
		setDouble(element, TOWER_SAVE_NUMBER_OF_FALLS, value);
	}

	public static Double[] getTowerSaveCoins(JsonElement element) {
		return getArrayDouble(element, TOWER_SAVE_COINS);
	}

	public static void setTowerSaveCoins(JsonElement element, Double[] values) {
		setArrayDouble(element, TOWER_SAVE_COINS, values);
	}

	public static Inventory[] getInventory(JsonElement element) {
		return Inventory.get(getJsonArray(element, INVENTORY));
	}

	public static void setInventory(JsonElement element, Inventory[] values) {
		setJsonArray(element, INVENTORY, Inventory.convert(values));
	}

	public static MiscUnlock[] getMiscUnlocks(JsonElement element) {
		return MiscUnlock.get(getArrayString(element, MISC_UNLOCKS));
	}

	public static void setMiscUnlocks(JsonElement element, MiscUnlock[] values) {
		setArrayString(element, MISC_UNLOCKS, MiscUnlock.convert(values));
	}

	public static Map<String, JsonElement> getUnknownFields(JsonElement element) {
		final Map<String, JsonElement> results = new TreeMap<>();

		for (final Entry<String, JsonElement> entry : element.getAsJsonObject().entrySet()) {
			results.put(entry.getKey(), entry.getValue());
		}

		results.remove(MAJOR_GAME_VERSION);
		results.remove(MINOR_GAME_VERSION);
		results.remove(GAME_TIME);
		results.remove(HOLO_COINS);
		results.remove(RANDOM_MONEY_KEY);
		results.remove(TIME_MODE_UNLOCKED);
		results.remove(UNLOCKED_STAGES);
		results.remove(GATCHA_RANKS);
		results.remove(FANDOM_EXPERIENCES);
		results.remove(TEARS);
		results.remove(UNLOCKED_OUTFITS);
		results.remove(UNLOCKED_WEAPONS);
		results.remove(UNLOCKED_ITEMS);
		results.remove(SEEN_COLLABORATIONS);
		results.remove(FAN_LETTERS);
		results.remove(SPECIAL_ATTACK);
		results.remove(GROWTH);
		results.remove(REROLL);
		results.remove(ELIMINATE);
		results.remove(HOLD_FIND);
		results.remove(CUSTOMIZE);
		results.remove(SUPPORTS);
		results.remove(MATERIAL_FIND);
		results.remove(STAMPS);
		results.remove(ENCHANTMENTS);
		results.remove(FANDOM);
		results.remove(FAN_LETTERS_UNLOCKED);
		results.remove(MAX_HP_UP);
		results.remove(ATK_UP);
		results.remove(SPD_UP);
		results.remove(CRIT_UP);
		results.remove(PICK_UP_RANGE);
		results.remove(HASTE_UP);
		results.remove(REGENERATION);
		results.remove(DEFENSE_UP);
		results.remove(SPECIAL_COOLDOWN_REDUCTION);
		results.remove(SKILL_UP);
		results.remove(EXP_GAIN_UP);
		results.remove(FOOD_DROPS_UP);
		results.remove(MONEY_GAIN_UP);
		results.remove(ENHANCEMENT_RATE_UP);
		results.remove(MARKETING);
		results.remove(WEAPON_LIMIT);
		results.remove(ITEM_LIMIT);
		results.remove(COLLAB_BAN);
		results.remove(SUPERS_BAN);
		results.remove(G_RANK_OFF);
		results.remove(HARDCORE);
		results.remove(REFUND_ALL);
		results.remove(UNLOCKED_FURNITURES);
		results.remove(SAND);
		results.remove(UNLOCKED_FISH_RODS);
		results.remove(ACTIVE_FISH_ROD);
		results.remove(MANAGEMENT_LEVEL);
		results.remove(MANAGEMENT_EXP);
		results.remove(MINE_LEVEL);
		results.remove(MINE_EXP);
		results.remove(WOODCUTTING_LEVEL);
		results.remove(WOODCUTTING_EXP);
		results.remove(UNLOCKED_PICKAXES);
		results.remove(ACTIVE_PICKAXE);
		results.remove(UNLOCKED_AXES);
		results.remove(ACTIVE_AXE);
		results.remove(USA_CHIPS);
		results.remove(ACTIVE_PET);
		results.remove(ACTIVE_TRAIL);
		results.remove(USADA_DRINKS);
		results.remove(ACTIVE_SCAMS);
		results.remove(TOWER_SAVE_ACTIVE);
		results.remove(TOWER_SAVE_FLAGS);
		results.remove(TOWER_SAVE_TIME);
		results.remove(TOWER_SAVE_POSITION);
		results.remove(TOWER_SAVE_CHECKPOINT_POSITION);
		results.remove(TOWER_SAVE_NUMBER_OF_JUMPS);
		results.remove(TOWER_SAVE_NUMBER_OF_FALLS);
		results.remove(TOWER_SAVE_COINS);
		results.remove(INVENTORY);
		results.remove(MISC_UNLOCKS);

		return results;
	}

	public static void setRaw(JsonElement element, String namedIndex, String value, String type) {
		switch (type) {
		case "boolean":
			if (value.isEmpty()) {
				setBoolean(element, namedIndex, null);
			} else {
				setBoolean(element, namedIndex, Boolean.parseBoolean(value));
			}
			break;
		case "double":
			if (value.isEmpty()) {
				setDouble(element, namedIndex, null);
			} else {
				setDouble(element, namedIndex, Double.parseDouble(value));
			}
			break;
		case "string":
			if (value.isEmpty()) {
				setString(element, namedIndex, null);
			} else {
				setString(element, namedIndex, value);
			}
			break;
		case "json":
			if (value.isEmpty()) {
				setArrayString(element, namedIndex, null);
			} else {
				set(element, namedIndex, JsonParser.parseString(value));
			}
			break;
		default:
			throw new IllegalStateException("Unknown type: " + type);
		}
	}

	private static Boolean getBoolean(JsonElement element, String namedIndex) {
		final JsonElement t = get(element, namedIndex);

		if (t == null) {
			return null;
		}

		return t.getAsBoolean();
	}

	private static Double getDouble(JsonElement element, String namedIndex) {
		final JsonElement t = get(element, namedIndex);

		if (t == null) {
			return null;
		}

		return t.getAsDouble();
	}

	private static String getString(JsonElement element, String namedIndex) {
		final JsonElement t = get(element, namedIndex);

		if (t == null) {
			return null;
		}

		final String result = t.getAsString();

		if (result.isEmpty()) {
			return null;
		}

		return result;
	}

	private static Double[] getArrayDouble(JsonElement element, String namedIndex) {
		final JsonArray a = getJsonArray(element, namedIndex);

		if (a == null) {
			return null;
		}

		final Double[] results = new Double[a.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonElement item = a.get(i);

			results[i] = item.getAsDouble();
		}

		return results;
	}

	private static String[] getArrayString(JsonElement element, String namedIndex) {
		final JsonArray a = getJsonArray(element, namedIndex);

		if (a == null) {
			return null;
		}

		final String[] results = new String[a.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonElement item = a.get(i);

			results[i] = item.getAsString();
		}

		return results;
	}

	private static void setBoolean(JsonElement element, String namedIndex, Boolean value) {
		final JsonObject t = element.getAsJsonObject();

		if (value == null) {
			t.remove(namedIndex);
		} else {
			t.addProperty(namedIndex, value);
		}
	}

	private static void setDouble(JsonElement element, String namedIndex, Double value) {
		final JsonObject t = element.getAsJsonObject();

		if (value == null) {
			t.remove(namedIndex);
		} else {
			t.addProperty(namedIndex, value);
		}
	}

	private static void setString(JsonElement element, String namedIndex, String value) {
		final JsonObject t = element.getAsJsonObject();

		if ((value == null) || value.isEmpty()) {
			t.remove(namedIndex);
		} else {
			t.addProperty(namedIndex, value);
		}
	}

	private static void setArrayDouble(JsonElement element, String namedIndex, Double[] values) {
		final JsonObject t = element.getAsJsonObject();

		if ((values == null) || (values.length == 0)) {
			t.remove(namedIndex);
		} else {
			final JsonArray array = new JsonArray();

			for (final Double value : values) {
				array.add(new JsonPrimitive(value));
			}

			t.add(namedIndex, array);
		}
	}

	private static void setArrayString(JsonElement element, String namedIndex, String[] values) {
		final JsonObject t = element.getAsJsonObject();

		if ((values == null) || (values.length == 0)) {
			t.remove(namedIndex);
		} else {
			final JsonArray array = new JsonArray();

			for (final String value : values) {
				array.add(new JsonPrimitive(value));
			}

			t.add(namedIndex, array);
		}
	}

	private static JsonElement get(JsonElement element, String namedIndex) {
		final JsonObject object = element.getAsJsonObject();

		if (checkFields(object, namedIndex)) {
			return object.get(namedIndex);
		}

		return null;
	}

	private static void set(JsonElement element, String namedIndex, JsonElement value) {
		final JsonObject t = element.getAsJsonObject();

		if (value == null) {
			t.remove(namedIndex);
		} else {
			t.add(namedIndex, value);
		}
	}

	private static JsonArray getJsonArray(JsonElement element, String namedIndex) {
		final JsonElement t = get(element, namedIndex);

		if (t == null) {
			return null;
		}

		return t.getAsJsonArray();
	}

	private static void setJsonArray(JsonElement element, String namedIndex, JsonArray value) {
		final JsonObject t = element.getAsJsonObject();

		if (value == null) {
			t.remove(namedIndex);
		} else {
			t.add(namedIndex, value);
		}
	}

	private static boolean checkFields(JsonObject object, String... fields) {
		for (final String field : fields) {
			if (!object.has(field)) {
				return false;
			}
		}

		return true;
	}

}
