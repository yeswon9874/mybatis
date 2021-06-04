package org.tain.models;

import java.util.HashMap;

import org.springframework.jdbc.support.JdbcUtils;

public class CamelMap extends HashMap<String,Object> {

	private static final long serialVersionUID = 0L;
	
	@Override
	public Object put(String key, Object value) {
		return super.put(JdbcUtils.convertUnderscoreNameToPropertyName(key), value);
	}
}