package org.fasttrackit.course7.homework.animal;

public class Cat implements Animal {

    @Override
    public String walk() {
        return "Cat walking";
    }

    @Override
    public String talk() {
        return "Cat talking";
    }

    @Override
    public String eat() {
        return "Cat eating";
    }
}
