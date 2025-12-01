package com.github.rnveach.data;

import java.util.Arrays;

public enum Weapon implements Displayable {
	PSYCHO_AXE("PsychoAxe"), //
	GLOWSTICK("Glowstick"), //
	SPIDER_COOKING("SpiderCooking"), //
	PLUG_TYPE_ASACOCO("Tailplug"), //
	BL_BOOK("BLBook"), //
	ELITE_LAVA_BUCKET("EliteLava"), //
	HOLO_BOMB("HoloBomb"), //
	FAN_BEAM("HoloLaser"), //
	WAMY_WATER("WamyWater"), //
	CEOS_TEARS("CEOTears"), //
	CUTTING_BOARD("CuttingBoard"), //
	BOUNCE_BALL("BounceBall"), //
	ENS_CURSE("ENCurse"), //
	IDOL_SONG("IdolSong"), //
	X_POTATO("XPotato"), //
	SAUSAGE("Sausage"), //
	OWL_DAGGER("OwlDagger"), //
	;

	private final String code;

	private Weapon(String code) {
		this.code = code;
	}

	public static Weapon get(String code) {
		for (final Weapon v : Weapon.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Weapon code: " + code);
	}

	public static Weapon[] get(String[] codes) {
		if (codes == null) {
			return null;
		}

		final Weapon[] results = new Weapon[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Weapon[] values) {
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
		case BL_BOOK:
			return "BL Book";
		case BOUNCE_BALL:
			return "Bounce Ball";
		case CEOS_TEARS:
			return "CEO's Tears";
		case CUTTING_BOARD:
			return "Cutting Board";
		case ELITE_LAVA_BUCKET:
			return "Elite Lava Bucket";
		case ENS_CURSE:
			return "EN's Curse";
		case FAN_BEAM:
			return "Fan Beam";
		case GLOWSTICK:
			return "Glowstick";
		case HOLO_BOMB:
			return "Holo Bomb";
		case IDOL_SONG:
			return "Idol Song";
		case OWL_DAGGER:
			return "Owl Dagger";
		case PLUG_TYPE_ASACOCO:
			return "Plug Type Asacoco";
		case PSYCHO_AXE:
			return "Psycho Axe";
		case SAUSAGE:
			return "Sausage";
		case SPIDER_COOKING:
			return "Spider Cooking";
		case WAMY_WATER:
			return "Wamy Water";
		case X_POTATO:
			return "X-Potato";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
