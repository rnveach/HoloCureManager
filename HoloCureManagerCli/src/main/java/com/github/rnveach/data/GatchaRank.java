package com.github.rnveach.data;

import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public final class GatchaRank implements Comparable<GatchaRank> {

	private Idol idol;
	private double rank;

	public static GatchaRank[] get(JsonArray array) {
		if (array == null) {
			return null;
		}

		final GatchaRank[] results = new GatchaRank[array.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonArray subArray = array.get(i).getAsJsonArray();

			results[i] = getItem(subArray);
		}

		return results;
	}

	private static GatchaRank getItem(JsonArray array) {
		final GatchaRank result = new GatchaRank();

		result.setIdol(Idol.get(array.get(0).getAsString()));
		result.setRank(array.get(1).getAsDouble());

		return result;
	}

	public static JsonArray convert(GatchaRank[] values) {
		if (values == null) {
			return null;
		}

		final JsonArray results = new JsonArray();

		for (int i = 0; i < values.length; i++) {
			results.add(convert(values[i]));
		}

		return results;
	}

	private static JsonArray convert(GatchaRank value) {
		final JsonArray result = new JsonArray();

		result.add(new JsonPrimitive(value.getIdol().getCode()));
		result.add(new JsonPrimitive(value.getRank()));

		return result;
	}

	@Override
	public int compareTo(GatchaRank o) {
		return this.idol.compareTo(o.idol);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.idol, this.rank);
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

		final GatchaRank other = (GatchaRank) obj;

		return (this.idol == other.idol) && (Double.doubleToLongBits(this.rank) == Double.doubleToLongBits(other.rank));
	}

	public Idol getIdol() {
		return this.idol;
	}

	public void setIdol(Idol idol) {
		this.idol = idol;
	}

	public double getRank() {
		return this.rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

}
