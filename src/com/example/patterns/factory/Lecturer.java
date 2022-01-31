package com.example.patterns.factory;

public class Lecturer extends Person {
    private String firstName;
    private String lastName;

    public Lecturer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
