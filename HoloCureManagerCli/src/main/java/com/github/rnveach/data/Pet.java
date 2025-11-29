package com.github.rnveach.data;

public enum Pet implements Displayable {
	CAT("petCat"), //
	DOG("petDog"), //
	RABBIT("petRabbit"), //
	BEETLE("petBeetle"), //
	PENGUIN("petPenguin"), //
	MONKEY("petMonkey"), //
	;

	private final String code;

	private Pet(String code) {
		this.code = code;
	}

	public static Pet get(String code) {
		for (final Pet v : Pet.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Pet code: " + code);
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case BEETLE:
			return "Beetle";
		case CAT:
			return "Cat";
		case DOG:
			return "Dog";
		case MONKEY:
			return "Monkey";
		case PENGUIN:
			return "Penguin";
		case RABBIT:
			return "Rabbit";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
