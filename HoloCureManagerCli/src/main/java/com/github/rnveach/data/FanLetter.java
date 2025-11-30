package com.github.rnveach.data;

import java.util.Arrays;

public enum FanLetter implements Displayable {
	// TODO: better names
	KOBOKERZ("Kobokerz"), //
	ZECRETARY("Zecretary"), //
	UDIN("Udin"), //
	ZOMRADE("Zomrade"), //
	MOONAFIC("Moonafic"), //
	SHIOKKO("Shiokko"), //
	NAKIRIGUMI("Nakirigumi"), //
	FUBUCHUN("FubuChun"), //
	ORUYANKE("Oruyanke"), //
	MITEIRU("Miteiru"), //
	KINTOKI("Kintoki"), //
	ROBOSA("Robosa"), //
	HOSHIYOMI("Hoshiyomi"), //
	MIOFA("Miofa"), //
	YATAGARASU("Yatagarasu"), //
	KENZOKU("Kenzoku"), //
	TATSUNOKO("Tatsunoko"), //
	GUY_RYS("GuyRys"), //
	HOOMANS("Hoomans"), //
	BRATS("Brats"), //
	SMOLL_AME("SmollAme"), //
	CURSED_BUBBA("CursedBubba"), //
	SSRB("SSRB"), //
	SANALITES("Sanalites"), //
	KRONIES("Kronies"), //
	KFP("KFP"), //
	NODOKA("Nodoka"), //
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
	ACHAN("Achan"), //
	SUKONBU("Sukonbu"), //
	DEADBEAT_Q("DeadbeatQ"), //
	TAKODACHI("Takodachi"), //
	SAPLINGS("Saplings"), //
	HAATON("Haaton"), //
	MATSURISU("Matsurisu"), //
	PIONEER("Pioneer"), //
	SORATOMO("Soratomo"), //
	BLOOM_GLOOM("BloomGloom"), //
	DEADBEAT("Deadbeat"), //
	MOONABITO("Moonabito"), //
	SPIDERCHAMA("Spiderchama"), //
	SHRIMP("Shrimp"), //
	IOFORIA("Ioforia"), //
	RISCOT("Riscot"), //
	WATAMATE("Watamate"), //
	NOUSAGI("Nousagi"), //
	ICHIMI("Ichimi"), //
	SHIROGANE_KNIGHT("ShiroganeKnight"), //
	ELFRIEND("Elfriend"), //
	OTAKU("Otaku"), //
	NANORAAA("Nanoraaa"), //
	FUBUZILLA("Fubuzilla"), //
	HALLOWEEN_BAE("HalloweenBae"), //
	MIKODANYE("Mikodanye"), //
	SHUBANGELION("Shubangelion"), //
	TEAMATE("Teamate"), //
	SHRIMP_Q("ShrimpQ"), //
	HALLOWEEN_MYTH("HalloweenMyth"), //
	OBAKE_CHAN("ObakeChan"), //
	MIKOPI("Mikopi"), //
	STAFF("Staff"), //
	GORI_ELA("GoriEla"), //
	PEKODAM("Pekodam"), //
	ONIGIRIYA("Onigiriya"), //
	KORONESUKI("Koronesuki"), //
	UPAO("Upao"), //
	LUKNIGHT("Luknight"), //
	CHOCOLAT("Chocolat"), //
	IRYSTOCRATS("Irystocrats"), //
	PAYOYO("Payoyo"), //
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
		final FanLetter[] results = new FanLetter[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(FanLetter[] values) {
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
