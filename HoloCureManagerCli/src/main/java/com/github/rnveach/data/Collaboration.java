package com.github.rnveach.data;

import java.util.Arrays;

public enum Collaboration implements Displayable {
	BL_FUJOSHI("BLLover"), //
	BREATHE_IN_TYPE_ASACOCO("BreatheInAsacoco"), //
	BROKEN_DREAMS("BrokenDreams"), //
	ELITE_COOKING("EliteCooking"), //
	SNOW_FLOWER_SAKE("SnowSake"), //
	SNOW_QUEEN("SnowQueen"), //
	DRAGON_FIRE("DragonBeam"), //
	LIGHT_BEAM("LightBeam"), //
	MICOMET("MiComet"), //
	RING_OF_FITNESS("RingOfFitness"), //
	BONE_BROS("BoneBros"), //
	ABSOLUTE_WALL("AbsoluteWall"), //
	CURSE_BALL("CurseBall"), //
	ELDRITCH_HORROR("EldritchHorror"), //
	IDOL_CONCERT("IdolConcert"), //
	LEGENDARY_SAUSAGE("LegendarySausage"), //
	MIKORONE("MiKorone"), //
	RAP_DOG("RapDog"), //
	STREAM_OF_TEARS("StreamOfTears"), //
	IM_DIE_THANK_YOU_FOREVER("ImDie"), //
	JINGISUKAN("Jingisukan"), //
	HOLY_FIRE("KanaCoco"), //
	IDOL_LIVE("IdolLive"), //
	FLATTENING_BOARD("FlatBoard"), //
	LIGHTNING_WIENER("LightningWeiner"), //
	CRESCENT_BARDICHE("StarHalberd"), //
	BLACK_PLAGUE("BlackPlague"), //
	TRUE_INFINITE_BL_WORKS("InfiniteBL"), //
	BLOOD_LUST("BloodLust"), //
	FROZEN_SEA("MariLamy"), //
	;

	private final String code;

	private Collaboration(String code) {
		this.code = code;
	}

	public static Collaboration get(String code) {
		for (final Collaboration v : Collaboration.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Collaboration code: " + code);
	}

	public static Collaboration[] get(String[] codes) {
		if (codes == null) {
			return null;
		}

		final Collaboration[] results = new Collaboration[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Collaboration[] values) {
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
		case ABSOLUTE_WALL:
			return "Absolute Wall";
		case BLACK_PLAGUE:
			return "Black Plague";
		case BL_FUJOSHI:
			return "BL Fujoshi";
		case BLOOD_LUST:
			return "Blood Lust";
		case BONE_BROS:
			return "Bone Bros.";
		case BREATHE_IN_TYPE_ASACOCO:
			return "Breathe-In Type Asacoco";
		case BROKEN_DREAMS:
			return "Broken Dreams";
		case CRESCENT_BARDICHE:
			return "Crescent Bardiche";
		case CURSE_BALL:
			return "Curse Ball";
		case DRAGON_FIRE:
			return "Dragon Fire";
		case ELDRITCH_HORROR:
			return "Eldritch Horror";
		case ELITE_COOKING:
			return "Elite Cooking";
		case FLATTENING_BOARD:
			return "Flattening Board";
		case FROZEN_SEA:
			return "Frozen Sea";
		case HOLY_FIRE:
			return "Holy Fire";
		case IDOL_CONCERT:
			return "Idol Concert";
		case IDOL_LIVE:
			return "Idol Live";
		case IM_DIE_THANK_YOU_FOREVER:
			return "I'm Die, Thank You Forever";
		case JINGISUKAN:
			return "Jingisukan";
		case LEGENDARY_SAUSAGE:
			return "Legendary Sausage";
		case LIGHT_BEAM:
			return "Light Beam";
		case LIGHTNING_WIENER:
			return "Lightning Wiener";
		case MICOMET:
			return "MiComet";
		case MIKORONE:
			return "MiKorone";
		case RAP_DOG:
			return "Rap Dog";
		case RING_OF_FITNESS:
			return "Ring Of Fitness";
		case SNOW_FLOWER_SAKE:
			return "Snow Flower Sake";
		case SNOW_QUEEN:
			return "Snow Queen";
		case STREAM_OF_TEARS:
			return "Stream Of Tears";
		case TRUE_INFINITE_BL_WORKS:
			return "True Infinite BL Works";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
