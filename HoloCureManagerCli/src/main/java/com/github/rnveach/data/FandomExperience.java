package com.github.rnveach.data;

import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public final class FandomExperience {

	private Idol idol;
	private double experience;

	public static FandomExperience[] get(JsonArray array) {
		if (array == null) {
			return null;
		}

		final FandomExperience[] results = new FandomExperience[array.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonArray subArray = array.get(i).getAsJsonArray();

			results[i] = getItem(subArray);
		}

		return results;
	}

	private static FandomExperience getItem(JsonArray array) {
		final FandomExperience result = new FandomExperience();

		result.setIdol(Idol.get(array.get(0).getAsString()));
		result.setExperience(array.get(1).getAsDouble());

		return result;
	}

	public static JsonArray convert(FandomExperience[] values) {
		if (values == null) {
			return null;
		}

		final JsonArray results = new JsonArray();

		for (int i = 0; i < values.length; i++) {
			results.set(i, convert(values[i]));
		}

		return results;
	}

	private static JsonArray convert(FandomExperience value) {
		final JsonArray result = new JsonArray();

		result.set(0, new JsonPrimitive(value.getIdol().getCode()));
		result.set(1, new JsonPrimitive(value.getExperience()));

		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.experience, this.idol);
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

		final FandomExperience other = (FandomExperience) obj;

		return (this.idol == other.idol)
				&& (Double.doubleToLongBits(this.experience) == Double.doubleToLongBits(other.experience));
	}

	public Idol getIdol() {
		return this.idol;
	}

	public void setIdol(Idol idol) {
		this.idol = idol;
	}

	public double getExperience() {
		return this.experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

}
