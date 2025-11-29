package com.github.rnveach.data;

public enum Pickaxe implements Displayable {
	OLD(0.0), //
	STONE(1.0), //
	LEAD(2.0), //
	MYTH(3.0), //
	PROMISE(4.0), //
	ADVENT(5.0), //
	JUSTICE(6.0), //
	HOLOLITE(7.0), //
	;

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

	@Override
	public String getDisplay() {
		switch (this) {
		case ADVENT:
			return "Advent";
		case HOLOLITE:
			return "Hololite";
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
