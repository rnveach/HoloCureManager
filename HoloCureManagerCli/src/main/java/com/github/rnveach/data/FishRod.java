package com.github.rnveach.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public enum FishRod implements Displayable {
	BEGINNERS(0.0), //
	DADS(1.0), //
	BLACKSMITH_MADE(2.0), //
	ATLANTEAN(3.0), //
	TURKEY(4.0), //
	GOLDEN(5.0), //
	;

	public static Comparator<FishRod> COMPARATOR = new Comparator<>() {

		@Override
		public int compare(FishRod left, FishRod right) {
			return left.ordinal() - right.ordinal();
		}

	};

	public static int SIZE = values().length;

	private static FishRod[] EMPTY_ARRAY = new FishRod[0];

	private final double code;

	private FishRod(double code) {
		this.code = code;
	}

	public static FishRod get(Double code) {
		for (final FishRod v : FishRod.values()) {
			if (v.code == code) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Fish Rod code: " + code);
	}

	public static FishRod[] get(Double[] codes) {
		if (codes == null) {
			return null;
		}

		final List<FishRod> results = new ArrayList<>();

		for (int i = 0; i < codes.length; i++) {
			if (codes[i] == 1.0) {
				results.add(get((double) i));
			}
		}

		results.sort(COMPARATOR);

		return results.toArray(EMPTY_ARRAY);
	}

	public static Double[] convert(FishRod[] values) {
		if (values == null) {
			return null;
		}

		final Double[] results = new Double[SIZE];

		for (final FishRod value : values) {
			results[(int) value.code] = 1.0d;
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case ATLANTEAN:
			return "Atlantean Rod";
		case BEGINNERS:
			return "Beginners Rod";
		case BLACKSMITH_MADE:
			return "Blacksmith-Made Rod";
		case DADS:
			return "Dad's Rod";
		case GOLDEN:
			return "Golden Rod";
		case TURKEY:
			return "Turkey Rod";
		}

		return null;
	}

	public double getCode() {
		return this.code;
	}
}
