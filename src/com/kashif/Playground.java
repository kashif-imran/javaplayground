package com.kashif;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.UUID;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import net.sf.json.JSONObject;

public class Playground {
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(UUID.randomUUID().toString());
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
