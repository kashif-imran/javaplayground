package com.kashif.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;



public class Test {
	
    private static final DateTimeFormatterBuilder dateTimeFormatterBuilder =  new DateTimeFormatterBuilder();
    public static final String DEFAULT_DATE_FORMAT = "dd MMM yyyy";
	
	public static void main(String[] args) {
		
		//List<String> dateFormats = Arrays.asList("dd MMM yyyy", "dd M yyyy")
		
		String[] dates = new String[] {"26 JUL 2018"};
		
		LocalDate localDate = parseDateIgnoreCase(dates[0]);
		System.out.println(localDate.toString());
		
	}

	public static LocalDate parseDateIgnoreCase(String date) {
		DateTimeFormatter formatter = dateTimeFormatterBuilder.parseCaseInsensitive().appendPattern(DEFAULT_DATE_FORMAT).toFormatter();
		System.out.println(formatter.format(LocalDate.of(2017, 7, 24)));
		LocalDate parse = LocalDate.parse(date, formatter);
		return parse;
	}

}





