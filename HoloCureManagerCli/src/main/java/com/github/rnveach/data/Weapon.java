package com.github.rnveach.data;

import java.util.Arrays;

public enum Weapon implements Displayable {
	// TODO: better names
	PSYCHO_AXE("PsychoAxe"), //
	GLOWSTICK("Glowstick"), //
	SPIDER_COOKING("SpiderCooking"), //
	TAILPLUG("Tailplug"), //
	BL_BOOK("BLBook"), //
	ELITE_LAVA("EliteLava"), //
	HOLO_BOMB("HoloBomb"), //
	HOLO_LASER("HoloLaser"), //
	WAMY_WATER("WamyWater"), //
	CEO_TEARS("CEOTears"), //
	CUTTING_BOARD("CuttingBoard"), //
	BOUNCE_BALL("BounceBall"), //
	EN_CURSE("ENCurse"), //
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
		final Weapon[] results = new Weapon[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Weapon[] values) {
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
