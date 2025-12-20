package com.github.rnveach.data;

public enum InventoryItem implements Displayable {
	// TODO: better names
	// TODO: full names
	TUNA("tuna"), //
	SHRIMP("shrimp"), //
	CLOWNFISH("clownfish"), //
	STANDARD_SOIL("standardsoil"), //
	EXPEDITED_SOIL("expeditedsoil"), //
	ENHANCED_SOIL("enhancedsoil"), //
	WHEAT_SEED("wheatSeed"), //
	TOMATO_SEED("tomatoSeed"), //
	POTATO_SEED("potatoSeed"), //
	RICE_SEED("riceSeed"), //
	ONION_SEED("onionseed"), //
	CARROT_SEED("carrotseed"), //
	GREEN_BEANS_SEED("greenbeansseed"), //
	PEPPERS_SEED("peppersseed"), //
	STRAWBERRY_SEED("strawberryseed"), //
	CORN_SEED("cornseed"), //
	RADISH_SEED("radishseed"), //
	GARLIC_SEED("garlicseed"), //
	TURTLE("turtle"), //
	MANTA_RAY("mantaray"), //
	PUFFERFISH("pufferfish"), //
	LOBSTER("lobster"), //
	KOI_FISH("koifish"), //
	SQUID("squid"), //
	EEL("eel"), //
	SHARK("shark"), //
	STICK("stick"), //
	STONE("stone"), //
	PLANK("plank"), //
	LEAD_BAR("leadbar"), //
	IRON_BAR("ironbar"), //
	HARDWOOD("hardwood"), //
	MYTHRIL_BAR("mythrilbar"), //
	CEDAR_WOOD("cedarwood"), //
	CARROT("carrot"), //
	RICE("rice"), //
	ONION("onion"), //
	POTATO("potato"), //
	WHEAT("wheat"), //
	TOMATO("tomato"), //
	ADAMANTITE_BAR("adamantitebar"), //
	MAPLE_WOOD("maplewood"), //
	DIAMOND("diamond"), //
	ACACIA_WOOD("acaciawood"), //
	TEAK_WOOD("teakwood"), //
	PLATINUM_BAR("platinumbar"), //
	BAMBOO_WOOD("bamboowood"), //
	HOLOLITE("hololite"), //
	;

	private final String code;

	private InventoryItem(String code) {
		this.code = code;
	}

	public static InventoryItem get(String code) {
		for (final InventoryItem v : InventoryItem.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Inventory Item code: " + code);
	}

	@Override
	public String getDisplay() {
		return name();
	}

	public String getCode() {
		return this.code;
	}

}
