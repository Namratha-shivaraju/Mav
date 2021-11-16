package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "This is jenkins pipeline for maven project. A simple maven text project ";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
