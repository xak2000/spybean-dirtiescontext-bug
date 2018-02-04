package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SpyMe {

	public void someMethod() {
		System.out.println("SpyMe.someMethod() was called");
	}

}
