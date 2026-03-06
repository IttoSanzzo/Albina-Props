package io.github.ittosanzzo.albinaprops.common.utils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringUtils {
	public static String humanizeId(String id) {
		return Arrays.stream(id.split("_"))
			.map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
			.collect(Collectors.joining(" "));
	}
}
