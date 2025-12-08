package com.github.rnveach.data;

public enum Generation implements Displayable {
	MYTH("myth"), //
	COUNCIL_PROMISE("councilHope"), //
	GAMERS("gamers"), //
	JP_GENERATION_0("gen0"), //
	JP_GENERATION_1("gen1"), //
	JP_GENERATION_2("gen2"), //
	JP_GENERATION_3("gen3"), //
	JP_GENERATION_4("gen4"), //
	ID_GENERATION_1("id1"), //
	ID_GENERATION_2("id2"), //
	ID_GENERATION_3("id3"), //
	;

	private final String code;

	private Generation(String code) {
		this.code = code;
	}

	public static Generation get(String code) {
		for (final Generation v : Generation.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Generation code: " + code);
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case COUNCIL_PROMISE:
			return "Council + Promise";
		case GAMERS:
			return "Gamers";
		case ID_GENERATION_1:
			return "ID Generation 1";
		case ID_GENERATION_2:
			return "ID Generation 2";
		case ID_GENERATION_3:
			return "ID Generation 3";
		case JP_GENERATION_0:
			return "JP Generation 0";
		case JP_GENERATION_1:
			return "JP Generation 1";
		case JP_GENERATION_2:
			return "JP Generation 2";
		case JP_GENERATION_3:
			return "JP Generation 3";
		case JP_GENERATION_4:
			return "JP Generation 4";
		case MYTH:
			return "Myth";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}

}
