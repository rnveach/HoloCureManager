package com.github.rnveach.data;

import java.util.Arrays;

public enum Item implements Displayable {
	// TODO: better names
	BODY_PILLOW("BodyPillow"), //
	FULL_MEAL("FullMeal"), //
	PIKI_PIKI_PIMAN("PikiPikiPiman"), //
	SUCCUBUS_HORN("SuccubusHorn"), //
	HEADPHONES("Headphones"), //
	UBER_SHEEP("UberSheep"), //
	HOLY_MILK("HolyMilk"), //
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
	INJECTION_ASACOCO("InjectionAsacoco"), //
	MEMBERSHIP("Membership"), //
	PIGGY_BANK("PiggyBank"), //
	BANDAID("Bandaid"), //
	CHICKENS_FEATHER("ChickensFeather"), //
	ENERGY_DRINK("EnergyDrink"), //
	GWS_PILL("GWSPill"), //
	PLUSHIE("Plushie"), //
	DEVIL_HAT("DevilHat"), //
	LIMITER("Limiter"), //
	NINJA_HEADBAND("NinjaHeadband"), //
	FOCUS_SHADES("FocusShades"), //
	CANDY("Candy"), //
	BEETLE("Beetle"), //
	SHACKLESS("Shacklesss"), //
	HOPE_SODA("HopeSoda"), //
	LAB_COAT("LabCoat"), //
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
		final Item[] results = new Item[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Item[] values) {
		final String[] results = new String[values.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = values[i].getCode();
		}

		return results;
	}

	@Override
	public String getDisplay() {
		return name();
	}

	public String getCode() {
		return this.code;
	}
}
