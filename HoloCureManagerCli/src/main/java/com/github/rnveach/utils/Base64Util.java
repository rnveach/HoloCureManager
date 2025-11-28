package com.github.rnveach.utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public final class Base64Util {

	private Base64Util() {
	}

	private static final Decoder DECODER = Base64.getDecoder();

	private static final Encoder ENCODER = Base64.getEncoder();

	public static String decodeFrom(Path path) throws IOException {
		final byte[] fileBytes = Files.readAllBytes(path);

		return new String(DECODER.decode(fileBytes), StandardCharsets.UTF_8);
	}

	public static void encodeTo(Path path, String data) throws IOException {
		Files.write(path, ENCODER.encode(data.getBytes()));
	}

}
