package com.github.rnveach.data;

import com.google.gson.JsonArray;

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
