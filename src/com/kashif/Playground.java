package com.kashif;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import net.sf.json.JSONObject;

public class Playground {
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		JSONObject obj = new JSONObject();
		obj.put("uri", "data-drive-aadhar/ffa61cdf-53eb-4b12-8328-f44c258fcf09");
		System.out.println(Playground.objectToString(obj));
	}

	public static String objectToString(Object value) throws JsonGenerationException, JsonMappingException, IOException {
		if (value == null) {
			return null;
		}
		Writer writer = new StringWriter();
		writeValue(value, writer);
		return writer.toString();
	}
	
	public static void writeValue(Object value, Writer writer)
			throws JsonGenerationException, JsonMappingException, IOException {
		mapper.writeValue(writer, value);
	}
}
