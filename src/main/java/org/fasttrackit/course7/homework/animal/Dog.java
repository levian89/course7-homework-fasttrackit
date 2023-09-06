package org.fasttrackit.course7.homework.animal;

public class Dog implements Animal {
    @Override
    public String walk() {
        return "Dog walking";
    }

    @Override
    public String talk() {
        return "Dog talking";
    }

    @Override
    public String eat() {
        return "Dog eating";
    }
}
