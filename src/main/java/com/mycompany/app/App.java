package com.mycompany.app;

/**
 * Hello world!
 this is modified by satya
this is modified second time on git client
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
