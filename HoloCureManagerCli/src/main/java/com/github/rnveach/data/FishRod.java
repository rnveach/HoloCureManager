package com.github.rnveach.data;

public enum FishRod implements Displayable {
	BEGINNERS(0.0), //
	DADS(1.0), //
	BLACKSMITH_MADE(2.0), //
	ATLANTEAN(3.0), //
	TURKEY(4.0), //
	GOLDEN(5.0), //
	;

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
