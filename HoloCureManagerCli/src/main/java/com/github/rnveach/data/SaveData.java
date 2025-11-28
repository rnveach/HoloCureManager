package com.github.rnveach.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public final class SaveData {

	public static final String HOLO_COINS = "holoCoins";

	public static final String SAND = "fishSand";

	public static final String USA_CHIPS = "holoChips";

	public static Double getHoloCoins(JsonElement element) {
		return getDouble(element, HOLO_COINS);
	}

	public static void setHoloCoins(JsonElement element, Double value) {
		setDouble(element, HOLO_COINS, value);
	}

	public static Double getSand(JsonElement element) {
		return getDouble(element, SAND);
	}

	public static void setSand(JsonElement element, Double value) {
		setDouble(element, SAND, value);
	}

	public static Double getUsaChips(JsonElement element) {
		return getDouble(element, USA_CHIPS);
	}

	public static void setUsaChips(JsonElement element, Double value) {
		setDouble(element, USA_CHIPS, value);
	}

	private static Double getDouble(JsonElement element, String namedIndex) {
		final JsonElement t = get(element, namedIndex);

		if (t == null) {
			return null;
		}

		return t.getAsDouble();
	}

	private static void setDouble(JsonElement element, String namedIndex, double value) {
		final JsonObject t = element.getAsJsonObject();

		t.addProperty(namedIndex, value);
	}

	private static JsonElement get(JsonElement element, String namedIndex) {
		final JsonObject object = element.getAsJsonObject();

		if (checkFields(object, namedIndex)) {
			return object.get(namedIndex);
		}

		return null;
	}

	private static boolean checkFields(JsonObject object, String... fields) {
		for (final String field : fields) {
			if (!object.has(field)) {
				return false;
			}
		}

		return true;
	}

}
