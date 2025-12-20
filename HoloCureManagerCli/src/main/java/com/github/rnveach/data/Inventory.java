package com.github.rnveach.data;

import java.util.Objects;

import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;

public final class Inventory {

	private InventoryItem item;
	private double count;
	private double total;

	public static Inventory[] get(JsonArray array) {
		if (array == null) {
			return null;
		}

		final Inventory[] results = new Inventory[array.size()];

		for (int i = 0; i < results.length; i++) {
			final JsonArray subArray = array.get(i).getAsJsonArray();

			results[i] = getItem(subArray);
		}

		return results;
	}

	private static Inventory getItem(JsonArray array) {
		final Inventory result = new Inventory();

		result.setItem(InventoryItem.get(array.get(0).getAsString()));
		result.setCount(array.get(1).getAsDouble());
		result.setTotal(array.get(2).getAsDouble());

		return result;
	}

	public static JsonArray convert(Inventory[] values) {
		if (values == null) {
			return null;
		}

		final JsonArray results = new JsonArray();

		for (int i = 0; i < values.length; i++) {
			results.add(convert(values[i]));
		}

		return results;
	}

	private static JsonArray convert(Inventory value) {
		final JsonArray result = new JsonArray();

		result.add(new JsonPrimitive(value.getItem().getCode()));
		result.add(new JsonPrimitive(value.getCount()));
		result.add(new JsonPrimitive(value.getTotal()));

		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.item, this.count, this.total);
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

		final Inventory other = (Inventory) obj;

		return (this.item == other.item)
				&& (Double.doubleToLongBits(this.count) == Double.doubleToLongBits(other.count))
				&& (Double.doubleToLongBits(this.total) == Double.doubleToLongBits(other.total));
	}

	public InventoryItem getItem() {
		return this.item;
	}

	public void setItem(InventoryItem item) {
		this.item = item;
	}

	public double getCount() {
		return this.count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
