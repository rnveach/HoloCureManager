package com.github.rnveach.data;

import java.util.Arrays;

public enum Stage implements Displayable {
	STAGE_1("STAGE 1"), //
	STAGE_2("STAGE 2"), //
	STAGE_3("STAGE 3"), //
	STAGE_4("STAGE 4"), //
	STAGE_5("STAGE 5"), //
	STAGE_1_HARD("STAGE 1 (HARD)"), //
	STAGE_2_HARD("STAGE 2 (HARD)"), //
	STAGE_3_HARD("STAGE 3 (HARD)"), //
	STAGE_4_HARD("STAGE 4 (HARD)"), //
	TIME_STAGE_1("TIME STAGE 1"), //
	HOLO_HOUSE("HOLO HOUSE"), //
	USADA_CASINO("USADA CASINO"), //
	;

	private final String code;

	private Stage(String code) {
		this.code = code;
	}

	public static Stage get(String code) {
		for (final Stage v : Stage.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Stage code: " + code);
	}

	public static Stage[] get(String[] codes) {
		final Stage[] results = new Stage[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Stage[] values) {
		final String[] results = new String[values.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = values[i].getCode();
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case HOLO_HOUSE:
			return "Holo House";
		case STAGE_1:
			return "Stage 1";
		case STAGE_1_HARD:
			return "Stage 1 Hard";
		case STAGE_2:
			return "Stage 2";
		case STAGE_2_HARD:
			return "Stage 2 Hard";
		case STAGE_3:
			return "Stage 3";
		case STAGE_3_HARD:
			return "Stage 3 Hard";
		case STAGE_4:
			return "Stage 4";
		case STAGE_4_HARD:
			return "Stage 4 Hard";
		case STAGE_5:
			return "Stage 5";
		case TIME_STAGE_1:
			return "Time Stage 1";
		case USADA_CASINO:
			return "Usada Casino";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
