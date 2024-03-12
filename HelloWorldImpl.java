package org.example.publisher;

import jakarta.jws.WebService;

@WebService(endpointInterface = "org.example.publisher.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHelloWorld(String content) {
		return "Hello " + content + " !";
	}

}