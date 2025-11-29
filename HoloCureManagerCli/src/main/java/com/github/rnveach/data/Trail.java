package com.github.rnveach.data;

public enum Trail implements Displayable {
	HEARTS("trailHearts"), //
	SAKURA("trailSakura"), //
	SPARKLES("trailSparkles"), //
	LEAVES("trailLeaves"), //
	HOLOLIVE("trailHololive"), //
	BUBBLES("trailBubbles"), //
	SKULLS("trailSkulls"), //
	;

	private final String code;

	private Trail(String code) {
		this.code = code;
	}

	public static Trail get(String code) {
		for (final Trail v : Trail.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Trail code: " + code);
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case BUBBLES:
			return "Bubbles";
		case HEARTS:
			return "Hearts";
		case HOLOLIVE:
			return "Hololive";
		case LEAVES:
			return "Leaves";
		case SAKURA:
			return "Sakura";
		case SKULLS:
			return "Skulls";
		case SPARKLES:
			return "Sparkles";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
