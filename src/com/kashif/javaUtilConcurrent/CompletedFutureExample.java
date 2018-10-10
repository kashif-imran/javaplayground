package com.kashif.javaUtilConcurrent;

import java.util.concurrent.CompletableFuture;

public class CompletedFutureExample {
	public static void main(String[] args) {
		CompletableFuture.completedFuture("FUTURE")
        .thenApply(r -> r.toLowerCase())
        .thenAccept(f -> System.out.println(f))
        .thenAccept(f -> System.out.println(f))
        .thenApply(f -> new String("FUTURE"))
        .thenAccept(f -> System.out.println(f));
	}

}
