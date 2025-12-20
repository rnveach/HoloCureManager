package com.github.rnveach.data;

import java.util.Map.Entry;
import java.util.Objects;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public final class Achievements {

	private AchievementName achievementName;
	private boolean unlocked; // sometimes double (1/0), sometimes boolean (true/false)
	// flags - unknown

	public static Achievements[] get(JsonObject object) {
		if (object == null) {
			return null;
		}

		final Achievements[] results = new Achievements[object.size()];

		int i = 0;
		for (final Entry<String, JsonElement> entry : object.entrySet()) {
			results[i] = getItem(entry.getKey(), entry.getValue());

			i++;
		}

		return results;
	}

	private static Achievements getItem(String achievementName, JsonElement element) {
		final Achievements result = new Achievements();

		result.setAchievementName(AchievementName.get(achievementName));
		final JsonElement unlocked = element.getAsJsonObject().get("unlocked");

		if (unlocked.getAsString().contains(".")) {
			result.setUnlocked(unlocked.getAsDouble() != 0.0);
		} else {
			result.setUnlocked(unlocked.getAsBoolean());
		}

		return result;
	}

	public static Achievements[] values() {
		final AchievementName[] values = AchievementName.values();
		final Achievements[] results = new Achievements[values.length];
		int i = 0;

		for (final AchievementName value : values) {
			results[i] = value.getAchievementUnlocked();
			i++;
		}

		return results;
	}

	public static JsonObject convert(Achievements[] values) {
		if (values == null) {
			return null;
		}

		final JsonObject results = new JsonObject();

		for (final Achievements value : values) {
			results.add(value.getAchievementName().getCode(), convert(value));
		}

		return results;
	}

	private static JsonObject convert(Achievements value) {
		final JsonObject results = new JsonObject();

		results.add("unlocked", new JsonPrimitive(value.isUnlocked()));
		results.add("flags", new JsonObject());

		return results;
	}

	@Override
	public int hashCode() {
		// unlocked doesn't make it unique
		return Objects.hash(this.achievementName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		final Achievements other = (Achievements) obj;

		// unlocked doesn't make it unique
		return (this.achievementName == other.achievementName);
	}

	public AchievementName getAchievementName() {
		return this.achievementName;
	}

	public void setAchievementName(AchievementName achievementName) {
		this.achievementName = achievementName;
	}

	public boolean isUnlocked() {
		return this.unlocked;
	}

	public void setUnlocked(boolean unlocked) {
		this.unlocked = unlocked;
	}

}
