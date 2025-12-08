package com.github.rnveach.data;

public enum Idol implements Displayable {
	NONE("none"), //
	EMPTY("empty"), //
	RANDOM("random"), //
	//
	AMELIA_WATSON("ame"), //
	GAWR_GURA("gura"), //
	NINOMAE_INANIS("ina"), //
	TAKANASHI_KIARA("kiara"), //
	MORI_CALLIOPE("calli"), //
	HAKOS_BAELZ("bae"), //
	OURO_KRONII("kronii"), //
	CERES_FAUNA("fauna"), //
	NANASHI_MUMEI("mumei"), //
	TSUKUMO_SANA("sana"), //
	IRYS("irys"), //
	SHIRAKAMI_FUBUKI("fubuki"), //
	OOKAMI_MIO("mio"), //
	NEKOMATA_OKAYU("okayu"), //
	INUGAMI_KORONE("korone"), //
	TOKINO_SORA("sora"), //
	AZKI("azki"), //
	ROBOCOSAN("roboco"), //
	HOSHIMACHI_SUISEI("suisei"), //
	SAKURA_MIKO("miko"), //
	AKAI_HAATO("haato"), //
	YOZORA_MEL("mel"), //
	NATSUIRO_MATSURI("matsuri"), //
	AKI_ROSENTHAL("aki"), //
	OOZORA_SUBARU("subaru"), //
	YUZUKI_CHOCO("choco"), //
	MURASAKI_SHION("shion"), //
	NAKIRI_AYAME("ayame"), //
	MINATO_AQUA("aqua"), //
	USADA_PEKORA("pekora"), //
	HOUSHOU_MARINE("marine"), //
	SHIROGANE_NOEL("noel"), //
	SHIRANUI_FLARE("flare"), //
	KIRYU_COCO("coco"), //
	AMANE_KANATA("kanata"), //
	TOKOYAMI_TOWA("towa"), //
	TSUNOMAKI_WATAME("watame"), //
	HIMEMORI_LUNA("luna"), //
	MOONA_HOSHINOVA("moona"), //
	AYUNDA_RISU("risu"), //
	AIRANI_IOFIFTEEN("iofi"), //
	KUREIJI_OLLIE("ollie"), //
	PAVOLIA_REINE("reine"), //
	ANYA_MELFISSA("anya"), //
	KOBO_KANAERU("kobo"), //
	KAELA_KOVALSKIA("kaela"), //
	VESTIA_ZETA("zeta"), //
	;

	private final String code;

	private Idol(String code) {
		this.code = code;
	}

	public static Idol get(String code) {
		for (final Idol v : Idol.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Idol code: " + code);
	}

	@Override
	public String getDisplay() {
		switch (this) {
		case EMPTY:
			return "Empty";
		case NONE:
			return "None";
		case RANDOM:
			return "Random";
		//
		case AIRANI_IOFIFTEEN:
			return "Airani Iofifteen";
		case AKAI_HAATO:
			return "Akai Haato";
		case AKI_ROSENTHAL:
			return "Aki Rosenthal";
		case AMANE_KANATA:
			return "Amane Kanata";
		case AMELIA_WATSON:
			return "Amelia Watson";
		case ANYA_MELFISSA:
			return "Anya Melfissa";
		case AYUNDA_RISU:
			return "Ayunda Risu";
		case AZKI:
			return "AZKi";
		case CERES_FAUNA:
			return "Ceres Fauna";
		case GAWR_GURA:
			return "Gawr Gura";
		case HAKOS_BAELZ:
			return "Hakos Baelz";
		case HIMEMORI_LUNA:
			return "Himemori Luna";
		case HOSHIMACHI_SUISEI:
			return "Hoshimachi Suisei";
		case HOUSHOU_MARINE:
			return "Houshou Marine";
		case INUGAMI_KORONE:
			return "Inugami Korone";
		case IRYS:
			return "IRyS";
		case KAELA_KOVALSKIA:
			return "Kaela Kovalskia";
		case KIRYU_COCO:
			return "Kiryu Coco";
		case KOBO_KANAERU:
			return "Kobo Kanaeru";
		case KUREIJI_OLLIE:
			return "Kureiji Ollie";
		case MINATO_AQUA:
			return "Minato Aqua";
		case MOONA_HOSHINOVA:
			return "Moona Hoshinova";
		case MORI_CALLIOPE:
			return "Mori Calliope";
		case MURASAKI_SHION:
			return "Murasaki Shion";
		case NAKIRI_AYAME:
			return "Nakiri Ayame";
		case NANASHI_MUMEI:
			return "Nanashi Mumei";
		case NATSUIRO_MATSURI:
			return "Natsuiro Matsuri";
		case NEKOMATA_OKAYU:
			return "Nekomata Okayu";
		case NINOMAE_INANIS:
			return "Ninomae Ina'nis";
		case OOKAMI_MIO:
			return "Ookami Mio";
		case OOZORA_SUBARU:
			return "Oozora Subaru";
		case OURO_KRONII:
			return "Ouro Kronii";
		case PAVOLIA_REINE:
			return "Pavolia Reine";
		case ROBOCOSAN:
			return "Roboco-san";
		case SAKURA_MIKO:
			return "Sakura Miko";
		case SHIRAKAMI_FUBUKI:
			return "Shirakami Fubuki";
		case SHIRANUI_FLARE:
			return "Shiranui Flare";
		case SHIROGANE_NOEL:
			return "Shirogane Noel";
		case TAKANASHI_KIARA:
			return "Takanashi Kiara";
		case TOKINO_SORA:
			return "Tokino Sora";
		case TOKOYAMI_TOWA:
			return "Tokoyami Towa";
		case TSUNOMAKI_WATAME:
			return "Tsunomaki Watame";
		case TSUKUMO_SANA:
			return "Tsukumo Sana";
		case USADA_PEKORA:
			return "Usada Pekora";
		case VESTIA_ZETA:
			return "Vestia Zeta";
		case YOZORA_MEL:
			return "Yozora Mel";
		case YUZUKI_CHOCO:
			return "Yuzuki Choco";
		}

		return null;
	}

	public String getCode() {
		return this.code;
	}
}
