package com.wyj.excel.convert;


/**
 * Created by wyj on 17-9-19.
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

	@Override
	public Integer convert(String s) {
		if (s == null || "".equals(s.trim())) {
			return null;
		}
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
