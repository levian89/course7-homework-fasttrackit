package org.fasttrackit.course7.homework.animal;

public class Chicken implements Animal {
    @Override
    public String walk() {
        return "Chicken waking";
    }

    @Override
    public String talk() {
        return "Chicken talking";
    }

    @Override
    public String eat() {
        return "Chicken eating";
    }
}
