package com.github.rnveach.data;

import java.util.Arrays;

public enum Item implements Displayable {
	BODY_PILLOW("BodyPillow"), //
	FULL_MEAL("FullMeal"), //
	PIKI_PIKI_PIMAN("PikiPikiPiman"), //
	NURSES_HORN("SuccubusHorn"), //
	HEADPHONES("Headphones"), //
	UBER_SHEEP("UberSheep"), //
	KNIGHTLY_MILK("HolyMilk"), //
	SAKE("Sake"), //
	FACE_MASK("FaceMask"), //
	CREDIT_CARD("CreditCard"), //
	SUPER_CHATTO_TIME("SuperChattoTime"), //
	IDOL_COSTUME("IdolCostume"), //
	BLACKSMITHS_GEAR("BlacksmithsGear"), //
	BREASTPLATE("Breastplate"), //
	STUDY_GLASSES("StudyGlasses"), //
	GORILLAS_PAW("GorillasPaw"), //
	HALU("Halu"), //
	INJECTION_TYPE_ASACOCO("InjectionAsacoco"), //
	MEMBERSHIP("Membership"), //
	STOLEN_PIGGY_BANK("PiggyBank"), //
	JUST_BANDAGE("Bandaid"), //
	CHICKENS_FEATHER("ChickensFeather"), //
	ENERGY_DRINK("EnergyDrink"), //
	GWS_PILL("GWSPill"), //
	PLUSHIE("Plushie"), //
	DEVIL_HAT("DevilHat"), //
	LIMITER("Limiter"), //
	NINJA_HEADBAND("NinjaHeadband"), //
	FOCUS_SHADES("FocusShades"), //
	CANDY_KINGDOM_SWEETS("Candy"), //
	BEETLE("Beetle"), //
	KUSOGAKI_SHACKLES("Shacklesss"), //
	HOPE_SODA("HopeSoda"), //
	RESEARCHERS_COAT("LabCoat"), //
	PROMISE_TIARA("PromiseTiara"), //
	RAVEN_FEATHER("RavenFeather"), //
	CORPORATION_PIN("CorporationPin"), //
	;

	private final String code;

	private Item(String code) {
		this.code = code;
	}

	public static Item get(String code) {
		for (final Item v : Item.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Item code: " + code);
	}

	public static Item[] get(String[] codes) {
		if (codes == null) {
			return null;
		}

		final Item[] results = new Item[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Item[] values) {
		if (values == null) {
			return null;
		}

		final String[] results = new String[values.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = values[i].getCode();
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case BEETLE:
			return "Beetle";
		case BLACKSMITHS_GEAR:
			return "Blacksmith's Gear";
		case BODY_PILLOW:
			return "Body Pillow";
		case BREASTPLATE:
			return "Breastplate";
		case CANDY_KINGDOM_SWEETS:
			return "Candy Kingdom Sweets";
		case CHICKENS_FEATHER:
			return "Chicken's Feather";
		case CORPORATION_PIN:
			return "Corporation Pin";
		case CREDIT_CARD:
			return "Credit Card";
		case DEVIL_HAT:
			return "Devil Hat";
		case ENERGY_DRINK:
			return "Energy Drink";
		case FACE_MASK:
			return "Face Mask";
		case FOCUS_SHADES:
			return "Focus Shades";
		case FULL_MEAL:
			return "Full Meal";
		case GORILLAS_PAW:
			return "Gorilla's Paw";
		case GWS_PILL:
			return "GWS Pill";
		case HALU:
			return "Halu";
		case HEADPHONES:
			return "Headphones";
		case HOPE_SODA:
			return "Hope Soda";
		case IDOL_COSTUME:
			return "Idol Costume";
		case INJECTION_TYPE_ASACOCO:
			return "Injection Type Asacoco";
		case JUST_BANDAGE:
			return "Just Bandage";
		case KNIGHTLY_MILK:
			return "Knightly Milk";
		case KUSOGAKI_SHACKLES:
			return "Kusogaki Shackles";
		case LIMITER:
			return "Limiter";
		case MEMBERSHIP:
			return "Membership";
		case NINJA_HEADBAND:
			return "Ninja Headband";
		case NURSES_HORN:
			return "Nurse's Horn";
		case PIKI_PIKI_PIMAN:
			return "Piki Piki Piman";
		case PLUSHIE:
			return "Plushie";
		case PROMISE_TIARA:
			return "Promise Tiara";
		case RAVEN_FEATHER:
			return "Raven Feather";
		case RESEARCHERS_COAT:
			return "Researcher's Coat";
		case SAKE:
			return "Sake";
		case STOLEN_PIGGY_BANK:
			return "Stolen Piggy Bank";
		case STUDY_GLASSES:
			return "Study Glasses";
		case SUPER_CHATTO_TIME:
			return "Super Chatto Time!";
		case UBER_SHEEP:
			return "Uber Sheep";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
