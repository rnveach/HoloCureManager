package com.github.rnveach.data;

import java.util.Arrays;

public enum Collaboration implements Displayable {
	// TODO: better names
	BL_LOVER("BLLover"), //
	BREATHE_IN_ASACOCO("BreatheInAsacoco"), //
	BROKEN_DREAMS("BrokenDreams"), //
	ELITE_COOKING("EliteCooking"), //
	SNOW_SAKE("SnowSake"), //
	SNOW_QUEEN("SnowQueen"), //
	DRAGON_BEAM("DragonBeam"), //
	KANA_COCO("KanaCoco"), //
	LIGHT_BEAM("LightBeam"), //
	MI_COMET("MiComet"), //
	RING_OF_FITNESS("RingOfFitness"), //
	BONE_BROS("BoneBros"), //
	ABSOLUTE_WALL("AbsoluteWall"), //
	BL_FUJOSHI("BLFujoshi"), //
	CURSE_BALL("CurseBall"), //
	DRAGON_FIRE("DragonFire"), //
	ELDRITCH_HORROR("EldritchHorror"), //
	IDOL_CONCERT("IdolConcert"), //
	LEGENDARY_SAUSAGE("LegendarySausage"), //
	MI_KORONE("MiKorone"), //
	RAP_DOG("RapDog"), //
	SNOW_FLOWER_SAKE("SnowFlowerSake"), //
	STREAM_OF_TEARS("StreamOfTears"), //
	IM_DIE("ImDie"), //
	JINGISUKAN("Jingisukan"), //
	HOLY_FIRE("HolyFire"), //
	IDOL_LIVE("IdolLive"), //
	FLAT_BOARD("FlatBoard"), //
	LIGHTNING_WEINER("LightningWeiner"), //
	STAR_HALBERD("StarHalberd"), //
	MARI_LAMY("MariLamy"), //
	BLACK_PLAGUE("BlackPlague"), //
	INFINITE_BL("InfiniteBL"), //
	BLOOD_LUST("BloodLust"), //
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
		final Collaboration[] results = new Collaboration[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Collaboration[] values) {
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
