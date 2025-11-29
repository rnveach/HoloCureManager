package com.github.rnveach.utils;

import java.util.Arrays;

import picocli.CommandLine;

/**
 * A generic TypeConverter for picocli that converts a String input to any Enum
 * type T, ignoring case.
 *
 * @param <T> The target Enum type.
 */
public final class CaseInsensitiveEnumConverter<T extends Enum<T>> implements CommandLine.ITypeConverter<T> {

	private final Class<T> enumClass;

	public CaseInsensitiveEnumConverter(Class<T> enumClass) {
		this.enumClass = enumClass;
	}

	@Override
	public T convert(String value) throws Exception {
		final String upperCaseValue = value.toUpperCase();

		try {
			return Enum.valueOf(this.enumClass, upperCaseValue);
		} catch (final IllegalArgumentException e) {
			final String allowedValues = Arrays.toString(this.enumClass.getEnumConstants());

			throw new CommandLine.TypeConversionException(
					String.format("Invalid value '%s'. Must be one of %s (case-insensitive).", value, allowedValues));
		}
	}
}