package com.example;

import com.example.patterns.builder.Animal;
import com.example.patterns.factory.Person;
import com.example.patterns.factory.PersonFactory;
import com.example.patterns.singleton.MySingleton;

public class Main {

    public static void main(String[] args) {
        // Singleton pattern
        System.out.println("============= SINGLETON SAMPLE =============");
        MySingleton firstInstance = MySingleton.getInstance();
        MySingleton secondInstance = MySingleton.getInstance();


        // Factory pattern
        System.out.println("============= FACTORY SAMPLE =============");
        Person employee = PersonFactory.getPerson("employee");
        System.out.println(employee.toString());

        Person lecture = PersonFactory.getPerson("lecturer");
        System.out.println(lecture.toString());


        // Builder pattern
        System.out.println("============= BUILDER SAMPLE =============");
        Animal dog = new Animal.AnimalBuilder().setName("Kiki").setNoOfLeg(4).build();
        System.out.println("Dog " + dog.toString());

        Animal chicken = new Animal.AnimalBuilder().setName("Turkey").setNoOfLeg(2).build();
        System.out.println("Chicken " + chicken.toString());
    }
}
