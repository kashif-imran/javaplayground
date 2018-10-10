package com.kashif.caching;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		// store data in redis list
		// Get the stored data and print it
		Set<String> set = jedis.keys("*");

		set.forEach(s -> System.out.println("List of stored keys:: " + s));

	}
}
