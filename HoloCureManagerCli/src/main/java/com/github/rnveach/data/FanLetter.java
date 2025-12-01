package com.github.rnveach.data;

import java.util.Arrays;

public enum FanLetter implements Displayable {
	KOBOKERZ("Kobokerz"), //
	ZECRETARY("Zecretary"), //
	UDIN("Udin"), //
	ZOMRADE("Zomrade"), //
	MOONAFIC("Moonafic"), //
	SHIOKKO("Shiokko"), //
	NAKIRIGUMI("Nakirigumi"), //
	FUBU_CHUN("FubuChun"), //
	ORUYANKE("Oruyanke"), //
	MITEIRU("Miteiru"), //
	KINTOKI("Kintoki"), //
	ROBOSA("Robosa"), //
	HOSHIYOMI("Hoshiyomi"), //
	MIOFA("Miofa"), //
	YATAGARASU("Yatagarasu"), //
	TOKOYAMI_KENZOKU("Kenzoku"), //
	TATSUNOKO("Tatsunoko"), //
	GUY_RYS("GuyRys"), //
	HOOMAN("Hoomans"), //
	BRAT("Brats"), //
	SMOL_AME("SmollAme"), //
	CURSED_BUBBA("CursedBubba"), //
	SSRB("SSRB"), //
	SANALITE("Sanalites"), //
	KRONIE("Kronies"), //
	KFP("KFP"), //
	HARUSAKI_NODOKA("Nodoka"), //
	AREA_15("Area15"), //
	HEIMIN("Heimin"), //
	PEMALOE("Pemaloe"), //
	BAZO("Bazo"), //
	CILUS("Cilus"), //
	MERAKYAT("Merakyat"), //
	MELFREND("Melfriend"), //
	RISUNER("Risuner"), //
	AQUACREW("Aquacrew"), //
	CHOCOMATE("Chocomate"), //
	SUBATOMO("Subatomo"), //
	ROSETAI("Rosetai"), //
	KAPUMIN("Kapumin"), //
	A_CHAN("Achan"), //
	SUKONBU("Sukonbu"), //
	DEADBEAT_Q("DeadbeatQ"), //
	TAKODACHI("Takodachi"), //
	SAPLING("Saplings"), //
	HAATON("Haaton"), //
	MATSURISU("Matsurisu"), //
	PIONEER("Pioneer"), //
	SORATOMO("Soratomo"), //
	BLOOM_GLOOM("BloomGloom"), //
	DEADBEAT("Deadbeat"), //
	MOONABITO("Moonabito"), //
	SPIDERCHAMA("Spiderchama"), //
	CHUMBUD("Shrimp"), //
	IOFORIA("Ioforia"), //
	RISCOT("Riscot"), //
	WATAMATE("Watamate"), //
	NOUSAGI("Nousagi"), //
	HOUSHOU_NO_ICHIMIN("Ichimi"), //
	KNIGHTS_ORDER_OF_SHIROGANE("ShiroganeKnight"), //
	ELFRIEND("Elfriend"), //
	OTAKU("Otaku"), //
	NANORAAA("Nanoraaa"), //
	FUBURA("Fubuzilla"), //
	BAE_HALLOWEEN("HalloweenBae"), //
	MIKODANYE("Mikodanye"), //
	SHUBANGELION("Shubangelion"), //
	TEA_MATE("Teamate"), //
	CHUMBUD_Q("ShrimpQ"), //
	HALLOWEEN_MYTH("HalloweenMyth"), //
	OBAKE_CHAN("ObakeChan"), //
	P35("Mikopi"), // reversed due to Java not allowing numbers first
	STAFF("Staff"), //
	GORIELA("GoriEla"), //
	PEKODAM("Pekodam"), //
	ONIGIRIYA("Onigiriya"), //
	KORONESUKI("Koronesuki"), //
	UPAO("Upao"), //
	LU_KNIGHT("Luknight"), //
	CHOCOLAT("Chocolat"), //
	IRYSTOCRAT_LEGACY("Irystocrats"), //
	POYOYO("Poyoyo"), //
	;

	private final String code;

	private FanLetter(String code) {
		this.code = code;
	}

	public static FanLetter get(String code) {
		for (final FanLetter v : FanLetter.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Fan Letter code: " + code);
	}

	public static FanLetter[] get(String[] codes) {
		if (codes == null) {
			return null;
		}

		final FanLetter[] results = new FanLetter[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(FanLetter[] values) {
		if (values == null) {
			return null;
		}

		final String[] results = new String[values.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = values[i].getCode();
		}

		return results;
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case A_CHAN:
			return "A-chan";
		case AQUACREW:
			return "Aquacrew";
		case AREA_15:
			return "Area 15";
		case BAZO:
			return "Bazo";
		case BAE_HALLOWEEN:
			return "Bae (Halloween)";
		case BLOOM_GLOOM:
			return "Bloom & Gloom";
		case BRAT:
			return "Brat";
		case CHOCOLAT:
			return "Chocolat";
		case CHOCOMATE:
			return "Chocomate";
		case CHUMBUD:
			return "Chumbud";
		case CHUMBUD_Q:
			return "Chumbud (Q)";
		case CILUS:
			return "Cilus";
		case CURSED_BUBBA:
			return "Cursed Bubba";
		case DEADBEAT:
			return "Deadbeat";
		case DEADBEAT_Q:
			return "Deadbeat (Q)";
		case ELFRIEND:
			return "Elfriend";
		case FUBU_CHUN:
			return "Fubu-chun";
		case FUBURA:
			return "Fubura";
		case GORIELA:
			return "GoriEla";
		case GUY_RYS:
			return "GuyRys";
		case HAATON:
			return "Haaton";
		case HALLOWEEN_MYTH:
			return "Halloween Myth";
		case HARUSAKI_NODOKA:
			return "Harusaki Nodoka";
		case HEIMIN:
			return "Heimin";
		case HOOMAN:
			return "Hooman";
		case HOSHIYOMI:
			return "Hoshiyomi";
		case HOUSHOU_NO_ICHIMIN:
			return "Houshou no Ichimin";
		case IOFORIA:
			return "IOFORIA";
		case IRYSTOCRAT_LEGACY:
			return "Irystocrat (Legacy)";
		case KAPUMIN:
			return "Kapumin";
		case KFP:
			return "KFP";
		case KINTOKI:
			return "Kintoki";
		case KNIGHTS_ORDER_OF_SHIROGANE:
			return "Knight's Order of Shirogane";
		case KOBOKERZ:
			return "Kobokerz";
		case KORONESUKI:
			return "Koronesuki";
		case KRONIE:
			return "Kronie";
		case LU_KNIGHT:
			return "LuKnight";
		case MATSURISU:
			return "Matsurisu";
		case MELFREND:
			return "Melfriend";
		case MERAKYAT:
			return "Merakyat";
		case MIKODANYE:
			return "Mikodanye";
		case P35:
			return "35P";
		case MIOFA:
			return "Miofa";
		case MITEIRU:
			return "Miteiru";
		case MOONABITO:
			return "Moonabito";
		case MOONAFIC:
			return "Moonafic";
		case NAKIRIGUMI:
			return "Nakirigumi";
		case NANORAAA:
			return "Nanoraaa";
		case NOUSAGI:
			return "Nousagi";
		case OBAKE_CHAN:
			return "Obake-Chan";
		case ONIGIRIYA:
			return "Onigiriya";
		case ORUYANKE:
			return "Oruyanke";
		case OTAKU:
			return "Otaku";
		case PEKODAM:
			return "Pekodam";
		case PEMALOE:
			return "Pemaloe";
		case PIONEER:
			return "Pioneer";
		case POYOYO:
			return "Poyoyo";
		case RISUNER:
			return "Risuner";
		case RISCOT:
			return "Riscot";
		case ROBOSA:
			return "Robosa";
		case ROSETAI:
			return "Rosetai";
		case SANALITE:
			return "Sanalite";
		case SAPLING:
			return "Sapling";
		case SHIOKKO:
			return "Shiokko";
		case SHUBANGELION:
			return "Shubangelion";
		case SMOL_AME:
			return "Smol Ame";
		case SORATOMO:
			return "Soratomo";
		case SPIDERCHAMA:
			return "Spiderchama";
		case SSRB:
			return "SSRB";
		case STAFF:
			return "Staff";
		case SUBATOMO:
			return "Subatomo";
		case SUKONBU:
			return "Sukonbu";
		case TAKODACHI:
			return "Takodachi";
		case TATSUNOKO:
			return "Tatsunoko";
		case TEA_MATE:
			return "Tea-mate";
		case TOKOYAMI_KENZOKU:
			return "Tokoyami Kenzoku";
		case UDIN:
			return "Udin";
		case UPAO:
			return "Upao";
		case WATAMATE:
			return "Watamate";
		case YATAGARASU:
			return "Yatagarasu";
		case ZECRETARY:
			return "Zecretary";
		case ZOMRADE:
			return "Zomrade";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
