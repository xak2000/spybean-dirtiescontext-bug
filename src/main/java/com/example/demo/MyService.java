package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	private SpyMe spyMe;

	public void serviceMethod() {
		spyMe.someMethod();
	}

}
