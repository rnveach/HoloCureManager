package com.github.rnveach.data;

import java.util.Arrays;

public enum Outfit implements Displayable {
	// TODO: better names
	DEFAULT("default"), //
	AME_ALT1("ameAlt1"), //
	AME_ALT2("ameAlt2"), //
	AME_ALT3("ameAlt3"), //
	AME_ALT4("ameAlt4"), //
	GURA_ALT1("guraAlt1"), //
	GURA_ALT2("guraAlt2"), //
	GURA_ALT3("guraAlt3"), //
	GURA_ALT4("guraAlt4"), //
	CALLI_ALT1("calliAlt1"), //
	CALLI_ALT2("calliAlt2"), //
	CALLI_ALT3("calliAlt3"), //
	CALLI_ALT4("calliAlt4"), //
	INA_ALT1("inaAlt1"), //
	INA_ALT2("inaAlt2"), //
	INA_ALT3("inaAlt3"), //
	INA_ALT4("inaAlt4"), //
	KIARA_ALT1("kiaraAlt1"), //
	KIARA_ALT2("kiaraAlt2"), //
	KIARA_ALT3("kiaraAlt3"), //
	KIARA_ALT4("kiaraAlt4"), //
	IRYS_ALT1("irysAlt1"), //
	IRYS_ALT2("irysAlt2"), //
	IRYS_ALT3("irysAlt3"), //
	IRYS_ALT4("irysAlt4"), //
	BAE_ALT1("baeAlt1"), //
	BAE_ALT2("baeAlt2"), //
	BAE_ALT3("baeAlt3"), //
	KRONII_ALT1("kroniiAlt1"), //
	KRONII_ALT2("kroniiAlt2"), //
	KRONII_ALT3("kroniiAlt3"), //
	FAUNA_ALT1("faunaAlt1"), //
	FAUNA_ALT2("faunaAlt2"), //
	FAUNA_ALT3("faunaAlt3"), //
	MUMEI_ALT1("mumeiAlt1"), //
	MUMEI_ALT2("mumeiAlt2"), //
	MUMEI_ALT3("mumeiAlt3"), //
	SANA_ALT1("sanaAlt1"), //
	SANA_ALT2("sanaAlt2"), //
	KUROKAMI("kurokami"), //
	FUBUKI_ALT1("fubukiAlt1"), //
	FUBUKI_ALT2("fubukiAlt2"), //
	FUBUKI_ALT3("fubukiAlt3"), //
	OKAYU_ALT1("okayuAlt1"), //
	OKAYU_ALT2("okayuAlt2"), //
	OKAYU_ALT3("okayuAlt3"), //
	KORONE_ALT1("koroneAlt1"), //
	KORONE_ALT2("koroneAlt2"), //
	KORONE_ALT3("koroneAlt3"), //
	MIO_ALT1("mioAlt1"), //
	MIO_ALT2("mioAlt2"), //
	MIO_ALT3("mioAlt3"), //
	SORA_ALT1("soraAlt1"), //
	SORA_ALT2("soraAlt2"), //
	SORA_ALT3("soraAlt3"), //
	AZKI_ALT1("azkiAlt1"), //
	AZKI_ALT2("azkiAlt2"), //
	AZKI_ALT3("azkiAlt3"), //
	MIKO_ALT1("mikoAlt1"), //
	MIKO_ALT2("mikoAlt2"), //
	MIKO_ALT3("mikoAlt3"), //
	SUISEI_ALT1("suiseiAlt1"), //
	SUISEI_ALT2("suiseiAlt2"), //
	SUISEI_ALT3("suiseiAlt3"), //
	ROBOCO_ALT1("robocoAlt1"), //
	ROBOCO_ALT2("robocoAlt2"), //
	ROBOCO_ALT3("robocoAlt3"), //
	HAATO_ALT1("haatoAlt1"), //
	HAATO_ALT2("haatoAlt2"), //
	MEL_ALT1("melAlt1"), //
	MEL_ALT2("melAlt2"), //
	MATSURI_ALT1("matsuriAlt1"), //
	MATSURI_ALT2("matsuriAlt2"), //
	AKI_ALT1("akiAlt1"), //
	AKI_ALT2("akiAlt2"), //
	SUBARU_ALT1("subaruAlt1"), //
	SUBARU_ALT2("subaruAlt2"), //
	CHOCO_ALT1("chocoAlt1"), //
	CHOCO_ALT2("chocoAlt2"), //
	SHION_ALT1("shionAlt1"), //
	SHION_ALT2("shionAlt2"), //
	AYAME_ALT1("ayameAlt1"), //
	AYAME_ALT2("ayameAlt2"), //
	AQUA_ALT1("aquaAlt1"), //
	AQUA_ALT2("aquaAlt2"), //
	MOONA_ALT1("moonaAlt1"), //
	RISU_ALT1("risuAlt1"), //
	IOFI_ALT1("iofiAlt1"), //
	OLLIE_ALT1("ollieAlt1"), //
	REINE_ALT1("reineAlt1"), //
	ANYA_ALT1("anyaAlt1"), //
	KAELA_ALT1("kaelaAlt1"), //
	ZETA_ALT1("zetaAlt1"), //
	KOBO_ALT1("koboAlt1"), //
	PEKORA_ALT1("pekoraAlt1"), //
	NOEL_ALT1("noelAlt1"), //
	FLARE_ALT1("flareAlt1"), //
	MARINE_ALT1("marineAlt1"), //
	COCO_ALT1("cocoAlt1"), //
	KANATA_ALT1("kanataAlt1"), //
	WATAME_ALT1("watameAlt1"), //
	LUNA_ALT1("lunaAlt1"), //
	TOWA_ALT1("towaAlt1"), //
	;

	private final String code;

	private Outfit(String code) {
		this.code = code;
	}

	public static Outfit get(String code) {
		for (final Outfit v : Outfit.values()) {
			if (v.code.equals(code)) {
				return v;
			}
		}

		throw new IllegalStateException("Unknown Outfit code: " + code);
	}

	public static Outfit[] get(String[] codes) {
		final Outfit[] results = new Outfit[codes.length];

		for (int i = 0; i < results.length; i++) {
			results[i] = get(codes[i]);
		}

		Arrays.sort(results);

		return results;
	}

	public static String[] convert(Outfit[] values) {
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
