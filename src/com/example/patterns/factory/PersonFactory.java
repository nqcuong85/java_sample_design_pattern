package com.example.patterns.factory;

public class PersonFactory {

    public static final String FIRST_NAME = "Cuong";
    public static final String LAST_NAME = "Ngo";

    public static Person getPerson(String type) {
        if (type.equalsIgnoreCase("employee")) {
            return new Employee(FIRST_NAME, LAST_NAME);
        } else if (type.equalsIgnoreCase("lecturer")) {
            return new Lecturer(FIRST_NAME, LAST_NAME);
        }

        return null;
    }
}
