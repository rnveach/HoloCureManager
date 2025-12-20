package com.github.rnveach.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public enum Prism implements Displayable {
	BASIC(0.0), //
	MYTH(1.0), //
	PROMISE(2.0), //
	ADVENT(3.0), //
	JUSTICE(4.0), //
	HOLOLITE(5.0), //
	;

	public static Comparator<Prism> COMPARATOR = new Comparator<>() {

		@Override
		public int compare(Prism left, Prism right) {
			return left.ordinal() - right.ordinal();
		}

	};

	public static int SIZE = values().length;

	private static Prism[] EMPTY_ARRAY = new Prism[0];

	private final double code;

	private Prism(double code) {
		this.code = code;
	}

	public static Prism get(Double code) {
		for (final Prism v : Prism.values()) {
			if (v.code == code) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Prism code: " + code);
	}

	public static Prism[] get(Double[] codes) {
		if (codes == null) {
			return null;
		}

		final List<Prism> results = new ArrayList<>();

		for (int i = 0; i < codes.length; i++) {
			if (codes[i] == 1.0) {
				results.add(get((double) i));
			}
		}

		results.sort(COMPARATOR);

		return results.toArray(EMPTY_ARRAY);
	}

	public static Double[] convert(Prism[] values) {
		if (values == null) {
			return null;
		}

		final Double[] results = new Double[SIZE];

		for (final Prism value : values) {
			results[(int) value.code] = 1.0d;
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case ADVENT:
			return "Advent";
		case BASIC:
			return "Basic";
		case HOLOLITE:
			return "Hololite";
		case JUSTICE:
			return "Justice";
		case MYTH:
			return "Myth";
		case PROMISE:
			return "Promise";
		}

		return null;
	}

	public double getCode() {
		return this.code;
	}
}
