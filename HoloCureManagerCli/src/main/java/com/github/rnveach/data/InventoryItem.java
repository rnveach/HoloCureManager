package com.github.rnveach.data;

public enum InventoryItem implements Displayable {
	TUNA("tuna"), //
	SHRIMP("shrimp"), //
	SALMON("clownfish"), //
	STANDARD_SOIL("standardsoil"), //
	EXPEDITED_SOIL("expeditedsoil"), //
	ENHANCED_SOIL("enhancedsoil"), //
	WHEAT_SEED("wheatSeed"), //
	TOMATO_SEED("tomatoSeed"), //
	POTATO_SEED("potatoSeed"), //
	RICE_SEED("riceSeed"), //
	ONION_SEED("onionseed"), //
	CARROT_SEED("carrotseed"), //
	GREEN_BEAN_SEED("greenbeansseed"), //
	PEPPER_SEED("peppersseed"), //
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
	LEAD("leadbar"), //
	IRON("ironbar"), //
	HARD_WOOD("hardwood"), //
	MYTHRIL("mythrilbar"), //
	CEDAR_WOOD("cedarwood"), //
	CARROT("carrot"), //
	RICE("rice"), //
	ONION("onion"), //
	POTATO("potato"), //
	WHEAT("wheat"), //
	TOMATO("tomato"), //
	ADAMANTITE("adamantitebar"), //
	MAPLE_WOOD("maplewood"), //
	DIAMOND("diamond"), //
	ACACIA_WOOD("acaciawood"), //
	TEAK_WOOD("teakwood"), //
	PLATINUM("platinumbar"), //
	BAMBOO_WOOD("bamboowood"), //
	HOLOLITE("hololite"), //
	STRAWBERRY("strawberry"), //
	CORN("corn"), //
	GREEN_BEAN("greenbeans"), //
	PEPPER("peppers"), //
	RADISH("radish"), //
	GARLIC("garlic"), //
	AXOLOTL("axolotl"), //
	GOLDEN_SHRIMP("goldenshrimp"), //
	GOLDEN_SALMON("goldenclownfish"), //
	GOLDEN_TUNA("goldentuna"), //
	GOLDEN_KOI_FISH("goldenkoifish"), //
	GOLDEN_LOBSTER("goldenlobster"), //
	GOLDEN_EEL("goldeneel"), //
	GOLDEN_PUFFERFISH("goldenpufferfish"), //
	GOLDEN_MANTA_RAY("goldenmantaray"), //
	GOLDEN_TURTLE("goldenturtle"), //
	GOLDEN_SQUID("goldensquid"), //
	GOLDEN_SHARK("goldenshark"), //
	GOLDEN_AXOLOTL("goldenaxolotl"), //
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
		switch (this) {
		case ACACIA_WOOD:
			return "Acacia Wood";
		case ADAMANTITE:
			return "Adamantite";
		case AXOLOTL:
			return "Axolotl";
		case BAMBOO_WOOD:
			return "Bamboo Wood";
		case CARROT:
			return "Carrot";
		case CARROT_SEED:
			return "Carrot Seed";
		case CEDAR_WOOD:
			return "Cedar Wood";
		case CORN:
			return "Corn";
		case CORN_SEED:
			return "Corn Seed";
		case DIAMOND:
			return "Diamond";
		case EEL:
			return "Eel";
		case ENHANCED_SOIL:
			return "Enhanced Soil";
		case EXPEDITED_SOIL:
			return "Expedited Soil";
		case GARLIC:
			return "Garlic";
		case GARLIC_SEED:
			return "Garlic Seed";
		case GOLDEN_AXOLOTL:
			return "Golden Axolotl";
		case GOLDEN_EEL:
			return "Golden Eel";
		case GOLDEN_KOI_FISH:
			return "Golden Koi Fish";
		case GOLDEN_LOBSTER:
			return "Golden Lobster";
		case GOLDEN_MANTA_RAY:
			return "Golden Manta Ray";
		case GOLDEN_PUFFERFISH:
			return "Golden Pufferfish";
		case GOLDEN_SALMON:
			return "Golden Salmon";
		case GOLDEN_SHRIMP:
			return "Golden Shrimp";
		case GOLDEN_SHARK:
			return "Golden Shark";
		case GOLDEN_SQUID:
			return "Golden Squid";
		case GOLDEN_TUNA:
			return "Golden Tuna";
		case GOLDEN_TURTLE:
			return "Golden Turtle";
		case GREEN_BEAN:
			return "Green Bean";
		case GREEN_BEAN_SEED:
			return "Green Bean Seed";
		case HARD_WOOD:
			return "Hard Wood";
		case HOLOLITE:
			return "Hololite";
		case IRON:
			return "Iron";
		case KOI_FISH:
			return "Koi Fish";
		case LEAD:
			return "Lead";
		case LOBSTER:
			return "Lobster";
		case MANTA_RAY:
			return "Manta Ray";
		case MAPLE_WOOD:
			return "Maple Wood";
		case MYTHRIL:
			return "Mythril";
		case ONION:
			return "Onion";
		case ONION_SEED:
			return "Onion Seed";
		case PEPPER:
			return "Pepper";
		case PEPPER_SEED:
			return "Pepper Seed";
		case PLANK:
			return "Plank";
		case PLATINUM:
			return "Platinum";
		case POTATO:
			return "Potato";
		case POTATO_SEED:
			return "Potato Seed";
		case PUFFERFISH:
			return "Pufferfish";
		case RADISH:
			return "Radish";
		case RADISH_SEED:
			return "Radish Seed";
		case RICE:
			return "Rice";
		case RICE_SEED:
			return "Rice Seed";
		case SALMON:
			return "Salmon";
		case SHARK:
			return "Shark";
		case SHRIMP:
			return "Shrimp";
		case STANDARD_SOIL:
			return "Standard Soil";
		case STICK:
			return "Stick";
		case STONE:
			return "Stone";
		case STRAWBERRY:
			return "Strawberry";
		case STRAWBERRY_SEED:
			return "Strawberry Seed";
		case SQUID:
			return "Squid";
		case TEAK_WOOD:
			return "Teak Wood";
		case TOMATO:
			return "Tomato";
		case TOMATO_SEED:
			return "Tomato Seed";
		case TUNA:
			return "Tuna";
		case TURTLE:
			return "Turtle";
		case WHEAT:
			return "Wheat";
		case WHEAT_SEED:
			return "Wheat Seed";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}

}
