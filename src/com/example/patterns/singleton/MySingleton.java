package com.example.patterns.singleton;

public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
            System.out.println("Init MySingleton");
        } else {
            System.out.println("Return MySingleton");
        }

        return instance;
    }
}
