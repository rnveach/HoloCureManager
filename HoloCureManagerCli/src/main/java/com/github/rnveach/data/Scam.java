package com.github.rnveach.data;

import java.util.Arrays;

public enum Scam implements Displayable {
	// TODO: better names
	ARTIFACT_WEAPON("artifactWeapon"), //
	ARTIFACT_BOOTS("artifactBoots"), //
	ARTIFACT_GLOVES("artifactGloves"), //
	ARTIFACT_DRINK("artifactDrink"), //
	ARTIFACT_LENS("artifactLens"), //
	WORKER_TOOLS("workerTools"), //
	WORKER_BREAKS("workerBreaks"), //
	RABBIT_FOOT("rabbitFoot"), //
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
		final Scam[] results = new Scam[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Scam[] values) {
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
