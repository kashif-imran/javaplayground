package com.kashif.objectmapper;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser.Feature;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Test {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
		
		System.out.println(mapper.readValue("0012345", String.class));
	}

}
