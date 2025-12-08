package com.github.rnveach.data;

import java.util.Arrays;
import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public final class Tears implements Comparable<Tears> {

	private Generation generation;
	private double count;

	public static Tears[] get(JsonArray array) {
		if (array == null) {
			return null;
		}

		final Tears[] results = new Tears[array.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonArray subArray = array.get(i).getAsJsonArray();

			results[i] = getItem(subArray);
		}

		Arrays.sort(results);

		return results;
	}

	private static Tears getItem(JsonArray array) {
		final Tears result = new Tears();

		result.setGeneration(Generation.get(array.get(0).getAsString()));
		result.setCount(array.get(1).getAsDouble());

		return result;
	}

	public static JsonArray convert(Tears[] values) {
		if (values == null) {
			return null;
		}

		final JsonArray results = new JsonArray();

		for (int i = 0; i < values.length; i++) {
			results.set(i, convert(values[i]));
		}

		return results;
	}

	private static JsonArray convert(Tears value) {
		final JsonArray result = new JsonArray();

		result.set(0, new JsonPrimitive(value.getGeneration().getCode()));
		result.set(1, new JsonPrimitive(value.getCount()));

		return result;
	}

	@Override
	public int compareTo(Tears o) {
		return this.generation.compareTo(o.generation);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.generation, this.count);
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

		final Tears other = (Tears) obj;

		return (this.generation == other.generation)
				&& (Double.doubleToLongBits(this.count) == Double.doubleToLongBits(other.count));
	}

	public Generation getGeneration() {
		return this.generation;
	}

	public void setGeneration(Generation generation) {
		this.generation = generation;
	}

	public double getCount() {
		return this.count;
	}

	public void setCount(double count) {
		this.count = count;
	}

}
