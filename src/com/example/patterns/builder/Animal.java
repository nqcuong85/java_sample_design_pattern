package com.example.patterns.builder;

public class Animal {
    private String name;
    private Integer noOfLeg;

    public Animal(AnimalBuilder builder) {
        this.name = builder.getName();
        this.noOfLeg = builder.getNoOfLeg();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", noOfLeg=" + noOfLeg +
                '}';
    }

    public static class AnimalBuilder {
        private String name;
        private Integer noOfLeg;

        public AnimalBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getName() {
            return this.name;
        }

        public AnimalBuilder setNoOfLeg(Integer noOfLeg) {
            this.noOfLeg = noOfLeg;
            return this;
        }

        public Integer getNoOfLeg() {
            return this.noOfLeg;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
