package com.github.rnveach.data;

public enum CookedFoodItem implements Displayable {
	TEMPURA("tempura"), //
	TUNA_SANDWICH("tunasandwich"), //
	SUSHI_SET("sushiset"), //
	POKE_BOWL("pokebowl"), //
	LOBSTER_DINNER("lobsterdinner"), //
	PUFFERFISH_MEAL_SET("pufferfishmeal"), //
	VEGETARIAN_BURGER_AND_FRIES("vegetarianburger"), //
	TURTLE_SOUP("turtlesoup"), //
	UNAGI_DON("unagidon"), //
	CALAMARI_SET("calamariset"), //
	MANTA_RAY_SOUP("mantaraysoup"), //
	FRUIT_SANDWICH("fruitsandwich"), //
	BURGER_MEAL("burgermeal"), //
	STRANGE_SEAFOOD_SOUP("strangeseafoodsoup"), //
	VEGETABLE_SOUP("vegetablesoup"), //
	BBQ_SQUID("bbqsquid"), //
	SPICY_SEAFOOD_UDON("spicyudon"), //
	;

	private final String code;

	private CookedFoodItem(String code) {
		this.code = code;
	}

	public static CookedFoodItem get(String code) {
		for (final CookedFoodItem v : CookedFoodItem.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Cooked Food Item code: " + code);
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case BBQ_SQUID:
			return "BBQ Squid";
		case BURGER_MEAL:
			return "Burger Meal";
		case CALAMARI_SET:
			return "Calamari Set";
		case FRUIT_SANDWICH:
			return "Fruit Sandwich";
		case LOBSTER_DINNER:
			return "Lobster Dinner";
		case MANTA_RAY_SOUP:
			return "Manta Ray Soup";
		case POKE_BOWL:
			return "Poke Bowl";
		case PUFFERFISH_MEAL_SET:
			return "Pufferfish Meal Set";
		case SPICY_SEAFOOD_UDON:
			return "Spicy Seafood Udon";
		case STRANGE_SEAFOOD_SOUP:
			return "Strange Seafood Soup";
		case SUSHI_SET:
			return "Sushi Set";
		case TEMPURA:
			return "Tempura";
		case TUNA_SANDWICH:
			return "Tuna Sandwich";
		case TURTLE_SOUP:
			return "Turtle Soup";
		case UNAGI_DON:
			return "Unagi Don";
		case VEGETABLE_SOUP:
			return "Vegetable Soup";
		case VEGETARIAN_BURGER_AND_FRIES:
			return "Vegetarian Burger and Fries";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}

}
