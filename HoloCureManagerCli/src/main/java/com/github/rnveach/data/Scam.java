package com.github.rnveach.data;

import java.util.Arrays;

public enum Scam implements Displayable {
	LEGENDARY_WEAPON("artifactWeapon"), //
	LEGENDARY_BOOTS("artifactBoots"), //
	LEGENDARY_GLOVES("artifactGloves"), //
	LEGENDARY_DRINK("artifactDrink"), //
	LEGENDARY_LENS("artifactLens"), //
	WORKER_TOOLS("workerTools"), //
	WORKER_BREAKS("workerBreaks"), //
	GOLD_RABBITS_FOOT("rabbitFoot"), //
	;

	private final String code;

	private Scam(String code) {
		this.code = code;
	}

	public static Scam get(String code) {
		for (final Scam v : Scam.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Scam code: " + code);
	}

	public static Scam[] get(String[] codes) {
		if (codes == null) {
			return null;
		}

		final Scam[] results = new Scam[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Scam[] values) {
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
		case GOLD_RABBITS_FOOT:
			return "Gold Rabbit's Foot";
		case LEGENDARY_BOOTS:
			return "Legendary Boots";
		case LEGENDARY_DRINK:
			return "Legendary Drink";
		case LEGENDARY_GLOVES:
			return "Legendary Gloves";
		case LEGENDARY_LENS:
			return "Legendary Lens";
		case LEGENDARY_WEAPON:
			return "Legendary Weapon";
		case WORKER_BREAKS:
			return "Worker Breaks";
		case WORKER_TOOLS:
			return "Worker Tools";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}

}
