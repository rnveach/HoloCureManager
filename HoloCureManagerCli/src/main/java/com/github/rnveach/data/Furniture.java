package com.github.rnveach.data;

import java.util.Arrays;

public enum Furniture implements Displayable {
	// TODO: better names
	WOODEN_BED("woodenBed"), //
	WOODEN_BED_B("woodenBedB"), //
	WOODEN_BED_C("woodenBedC"), //
	WOODEN_BED_D("woodenBedD"), //
	MARBLE_BED("marblebed"), //
	FUTON("futon"), //
	COUCH_A("couchA"), //
	FOXBURGER("foxburger"), //
	NIGHTSTAND_A("nightstandA"), //
	NIGHTSTAND_B("nightstandB"), //
	WOODEN_DRESSER_A("woodenDresserA"), //
	WOODEN_DESK("woodendesk"), //
	WOODEN_PC_DESK("woodenPCdesk"), //
	MARBLE_DESK("marbledesk"), //
	MARBLE_LAPTOP_DESK("marblelaptopdesk"), //
	BEANBAG("beanbag"), //
	OFFICE_CHAIR("officechair"), //
	GAMER_CHAIR_A("gamerchaira"), //
	GAMER_CHAIR_B("gamerchairb"), //
	GAMER_CHAIR_C("gamerchairc"), //
	GAMER_CHAIR_D("gamerchaird"), //
	GAMER_CHAIR_E("gamerchaire"), //
	GAMER_CHAIR_F("gamerchairf"), //
	GAMER_CHAIR_G("gamerchairg"), //
	GAMER_CHAIR_H("gamerchairH"), //
	VANITY("vanity"), //
	BODY_PILLOW("bodypillow"), //
	WOODEN_DINING_TABLE("woodenDiningTable"), //
	MARBLE_TABLE("marbleTable"), //
	WOODEN_DINING_CHAIR("woodenDiningChair"), //
	MARBLE_CHAIR("marblechair"), //
	STOOL_A1("stoolA1"), //
	WOODEN_TABLE("woodentable"), //
	MARBLE_TABLE_2("marbletable"), //
	GLASS_TABLE("glasstable"), //
	EASTERN_TABLE("easterntable"), //
	FLOOR_CUSHION("floorcushion"), //
	WOODEN_TALL_CABINET("woodentallcabinet"), //
	STANDING_LAMP_A("standinglampA"), //
	FIREPLACE("fireplace"), //
	TV_STAND("TVStand"), //
	CRT_TV("crttv"), //
	RETRO_CONSOLE("retroconsole"), //
	VR_SET("vrset"), //
	WOODEN_BOOKSHELF("woodenbookshelf"), //
	MARBLE_BOOKSHELF("marblebookshelf"), //
	DISPLAY_CASE("displaycase"), //
	KITCHEN_COUNTER_A("kitchenCounterA"), //
	MICROWAVE("Microwave"), //
	MARBLE_COUNTER("marbleCounter"), //
	SINK("sink"), //
	MARBLE_SINK("marblesink"), //
	FRIDGE("fridge"), //
	STOVE("stove"), //
	WOODEN_CRATE("woodenCrate"), //
	WOODEN_BARREL("woodenbarrel"), //
	BOX_A("boxA"), //
	BOX_B("BoxB"), //
	TREASURE_CHEST_A("TreasureChestA"), //
	PLANT_POT_A("plantpotA"), //
	PLANT_POT_B("plantpotB"), //
	PLANT_POT_C("plantpotC"), //
	BERRY_PLANT("berryplant"), //
	MARBLE_STUMP("marblestump"), //
	DUMBELL("dumbell"), //
	EXERCISE_BALL("exerciseball"), //
	BOXING_DUMMY("boxingdummy"), //
	VAMPIRE_COFFIN("vampirecoffin"), //
	BAEGEMITE("baegemite"), //
	TAIKO_DRUMS("taikodrums"), //
	SHRINE_BOX("shrinebox"), //
	KFP_BUCKET("KFPbucket"), //
	SHARK_PLUSH("sharkplush"), //
	NEKO_PLUSH("nekoplush"), //
	ACHAN_DOLL("achandoll"), //
	WOODEN_DIVIDER("woodendivider"), //
	MARBLE_PARTITION("marblepartition"), //
	EASTERN_DIVIDER("easterndivider"), //
	WOODEN_WALL("woodenWall"), //
	WOODEN_WALL_2("woodenwall"), //
	WOODEN_HALF_WALL("woodenhalfwall"), //
	WOODEN_COLUMN("woodencolumn"), //
	MARBLE_COLUMN("marblecolumn"), //
	WOODEN_DOOR("woodendoor"), //
	BATH_STOOL("bathstool"), //
	BATHTUB("bathtub"), //
	TOILET("toilet"), //
	WASHING_MACHINE("washingmachine"), //
	LAUNDRY_BASKET("laundrybasket"), //
	CLOCK("clock"), //
	KRONIC_CLOCK("kroniclock"), //
	PAINTING_A("paintingA"), //
	PAINTING_C("paintingC"), //
	PAINTING_B("paintingB"), //
	PAINTING_D("paintingD"), //
	WALL_MIRROR("wallmirror"), //
	LANTERN("lantern"), //
	HANGING_VINE("hangingvine"), //
	MOUNTED_SWORD("mountedSword"), //
	DEMON_SWORD("demonSword"), //
	WINDOW("window"), //
	WOODEN_FLOOR("woodenFloor"), //
	WOODEN_FLOOR_2("woodenFloor2"), //
	STONE_FLOOR("stoneFloor"), //
	RED_CARPET_FLOOR("redCarpetFloor"), //
	BLUE_CARPET_FLOOR("blueCarpetFloor"), //
	PINK_CARPET_FLOOR("pinkCarpetFloor"), //
	CONCRETE_FLOOR("concreteFloor"), //
	MARBLE_FLOOR("marbleFloor"), //
	TILED_FLOOR("tiledFloor"), //
	TATAMI_FLOOR("tatamiFloor"), //
	FLAT_WALL("flatWall"), //
	STRIPED_WALL("stripedWall"), //
	SKY_WALL("skyWall"), //
	POLKA_WALL_A("polkaWallA"), //
	POLKA_WALL_B("polkaWallB"), //
	POLKA_WALL_C("polkaWallC"), //
	OCEAN_WALL("oceanWall"), //
	MODERN_WALL("modernWall"), //
	STONE_WALL("stoneWall"), //
	EASTERN_WALL("easternWall"), //
	;

	private final String code;

	private Furniture(String code) {
		this.code = code;
	}

	public static Furniture get(String code) {
		for (final Furniture v : Furniture.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Furniture code: " + code);
	}

	public static Furniture[] get(String[] codes) {
		final Furniture[] results = new Furniture[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Furniture[] values) {
		final String[] results = new String[values.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = values[i].getCode();
		}

		return results;
	}

	@Override
	public String getDisplay() {
		return name();
	}

	public String getCode() {
		return this.code;
	}
}
