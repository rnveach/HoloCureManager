package com.github.rnveach.data;

import java.util.Map.Entry;
import java.util.Objects;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

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

	@Override
	public int hashCode() {
		return Objects.hash(this.achievementName, this.unlocked);
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

		return (this.achievementName == other.achievementName) && (this.unlocked == other.unlocked);
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
