package com.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("Hi there");

        SpringApplication.run(DemoApplication.class, args);

        printMessage("Hi, how are you?");
        printMessage("I am fine,thx");
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }


}
