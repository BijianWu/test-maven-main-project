package com.WBJGames.testmavenmainproject;

import com.WBJGames.maventestlib.TestClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMavenMainProjectApplication {

	public static void main(String[] args) {
		TestClass.printHello();
		SpringApplication.run(TestMavenMainProjectApplication.class, args);
	}

}
