package com.github.rnveach.data;

import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public final class CookedFood {

	private CookedFoodItem foodItem;
	private double count;

	public static CookedFood[] get(JsonArray array) {
		if (array == null) {
			return null;
		}

		final CookedFood[] results = new CookedFood[array.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonArray subArray = array.get(i).getAsJsonArray();

			results[i] = getItem(subArray);
		}

		return results;
	}

	private static CookedFood getItem(JsonArray array) {
		final CookedFood result = new CookedFood();

		result.setFoodItem(CookedFoodItem.get(array.get(0).getAsString()));
		result.setCount(array.get(1).getAsDouble());

		return result;
	}

	public static JsonArray convert(CookedFood[] values) {
		if (values == null) {
			return null;
		}

		final JsonArray results = new JsonArray();

		for (int i = 0; i < values.length; i++) {
			results.add(convert(values[i]));
		}

		return results;
	}

	private static JsonArray convert(CookedFood value) {
		final JsonArray result = new JsonArray();

		result.add(new JsonPrimitive(value.getFoodItem().getCode()));
		result.add(new JsonPrimitive(value.getCount()));

		return result;
	}

	@Override
	public int hashCode() {
		// count doesn't make it unique
		return Objects.hash(this.foodItem);
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

		final CookedFood other = (CookedFood) obj;

		// count doesn't make it unique
		return (this.foodItem == other.foodItem);
	}

	public CookedFoodItem getFoodItem() {
		return this.foodItem;
	}

	public void setFoodItem(CookedFoodItem foodItem) {
		this.foodItem = foodItem;
	}

	public double getCount() {
		return this.count;
	}

	public void setCount(double count) {
		this.count = count;
	}

}
