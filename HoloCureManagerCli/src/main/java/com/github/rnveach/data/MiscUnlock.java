package com.github.rnveach.data;

import java.util.Arrays;

public enum MiscUnlock implements Displayable {
	LEGENDARY_WEAPON("artifactWeapon"), //
	LEGENDARY_BOOTS("artifactBoots"), //
	LEGENDARY_GLOVES("artifactGloves"), //
	LEGENDARY_DRINK("artifactDrink"), //
	LEGENDARY_LENS("artifactLens"), //
	TRAIL_HEARTS("trailHearts"), //
	TRAIL_SAKURA("trailSakura"), //
	TRAIL_SPARKLES("trailSparkles"), //
	TRAIL_LEAVES("trailLeaves"), //
	TRAIL_HOLOLIVE("trailHololive"), //
	TRAIL_BUBBLES("trailBubbles"), //
	TRAIL_SKULLS("trailSkulls"), //
	PET_CAT("petCat"), //
	PET_DOG("petDog"), //
	PET_RABBIT("petRabbit"), //
	PET_BEETLE("petBeetle"), //
	PET_PENGUIN("petPenguin"), //
	PET_MONKEY("petMonkey"), //
	WORKER_TOOLS("workerTools"), //
	WORKER_BREAKS("workerBreaks"), //
	GOLD_RABBITS_FOOT("rabbitFoot"), //
	;

	private final String code;

	private MiscUnlock(String code) {
		this.code = code;
	}

	public static MiscUnlock get(String code) {
		for (final MiscUnlock v : MiscUnlock.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Misc. Unlock code: " + code);
	}

	public static MiscUnlock[] get(String[] codes) {
		if (codes == null) {
			return null;
		}

		final MiscUnlock[] results = new MiscUnlock[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(MiscUnlock[] values) {
		if (values == null) {
			return null;
		}

		final String[] results = new String[values.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = values[i].getCode();
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case GOLD_RABBITS_FOOT:
			return "Gold Rabbit's Foot";
		case LEGENDARY_BOOTS:
			return "Legendary Boots";
		case LEGENDARY_DRINK:
			return "Legendary Drink";
		case LEGENDARY_GLOVES:
			return "Legendary Gloves";
		case LEGENDARY_LENS:
			return "Legendary Lens";
		case LEGENDARY_WEAPON:
			return "Legendary Weapon";
		case PET_BEETLE:
			return "Pet Beetle";
		case PET_CAT:
			return "Pet Cat";
		case PET_DOG:
			return "Pet Dog";
		case PET_MONKEY:
			return "Pet Monkey";
		case PET_PENGUIN:
			return "Pet Penguin";
		case PET_RABBIT:
			return "Pet Rabbit";
		case TRAIL_BUBBLES:
			return "Trail Bubbles";
		case TRAIL_HEARTS:
			return "Trail Hearts";
		case TRAIL_HOLOLIVE:
			return "Trail Hololive";
		case TRAIL_LEAVES:
			return "Trail Leaves";
		case TRAIL_SAKURA:
			return "Trail Sakura";
		case TRAIL_SKULLS:
			return "Trail Skulls";
		case TRAIL_SPARKLES:
			return "Trail Sparkles";
		case WORKER_BREAKS:
			return "Worker Breaks";
		case WORKER_TOOLS:
			return "Worker Tools";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}

}
