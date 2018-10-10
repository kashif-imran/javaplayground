package com.kashif.dateCal;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class TimeZoneTest {

	public static void main(String[] args) {
		String dateTime = "2009-04-03T18:30:00.000Z";
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
	    final ZonedDateTime parsed = ZonedDateTime.parse(dateTime, formatter.withZone(ZoneId.of("UTC")));
	    LocalDateTime localDateTime = parsed.toLocalDateTime();
		System.out.println(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()));
	}
}
