package com.example.patterns.factory;

public abstract class Person {
    public abstract String getFirstName();

    public abstract String getLastName();

    public abstract String getType();

    @Override
    public String toString() {
        return "Hello " + getType() + " First name: " + getFirstName() + ", Last name: " + getLastName();
    }
}
