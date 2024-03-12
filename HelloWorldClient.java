package org.example.client;

import jakarta.xml.ws.Service;
import org.example.publisher.HelloWorld;

import javax.xml.namespace.QName;
import java.net.URL;

public class HelloWorldClient {
	public static void main(String[] args) throws Exception{
		URL url = new URL("http://localhost:8090/ws/helloworld?wsdl");
		QName qname=new QName("http://publisher.example.org/","HelloWorldImplService");
		Service service=Service.create(url,qname);
		HelloWorld port=service.getPort(HelloWorld.class);
		System.out.println(port.sayHelloWorld("Samrat"));
 
	}
 
 
}