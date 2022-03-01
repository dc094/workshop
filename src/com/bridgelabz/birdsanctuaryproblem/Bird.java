package com.bridgelabz.birdsanctuaryproblem;

public class Bird {
    String colour;
    String name;

    @Override
    public String toString() {
        return "Bird{" +
                "colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(getClass().getSimpleName() + " can eats");
    }

    public void swim() {
        System.out.println(getClass().getSimpleName() + " can swim");
    }

    public void fly() {
        System.out.println(getClass().getSimpleName() + " can fly");
    }

}
