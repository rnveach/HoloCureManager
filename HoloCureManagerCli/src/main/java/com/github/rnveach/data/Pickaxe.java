package com.github.rnveach.data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public enum Pickaxe implements Displayable {
	OLD(0.0), //
	STONE(1.0), //
	LEAD(2.0), //
	IRON(3.0), //
	MYTH(4.0), //
	PROMISE(5.0), //
	ADVENT(6.0), //
	JUSTICE(7.0), //
	HOLOLITE(8.0), //
	;

	public static Comparator<Pickaxe> COMPARATOR = new Comparator<>() {

		@Override
		public int compare(Pickaxe left, Pickaxe right) {
			return left.ordinal() - right.ordinal();
		}

	};

	public static int SIZE = values().length;

	private static Pickaxe[] EMPTY_ARRAY = new Pickaxe[0];

	private final double code;

	private Pickaxe(double code) {
		this.code = code;
	}

	public static Pickaxe get(Double code) {
		for (final Pickaxe v : Pickaxe.values()) {
			if (v.code == code) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Pickaxe code: " + code);
	}

	public static Pickaxe[] get(Double[] codes) {
		if (codes == null) {
			return null;
		}

		final List<Pickaxe> results = new ArrayList<>();

		for (int i = 0; i < codes.length; i++) {
			if (codes[i] == 1.0) {
				results.add(get((double) i));
			}
		}

		results.sort(COMPARATOR);

		return results.toArray(EMPTY_ARRAY);
	}

	public static Double[] convert(Pickaxe[] values) {
		if (values == null) {
			return null;
		}

		final Double[] results = new Double[SIZE];

		for (final Pickaxe value : values) {
			results[(int) value.code] = 1.0d;
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case ADVENT:
			return "Advent";
		case HOLOLITE:
			return "Hololite";
		case IRON:
			return "Iron";
		case JUSTICE:
			return "Justice";
		case LEAD:
			return "Lead";
		case MYTH:
			return "Myth";
		case OLD:
			return "Old";
		case PROMISE:
			return "Promise";
		case STONE:
			return "Stone";
		}

		return null;
	}

	public double getCode() {
		return this.code;
	}
}
