package org.fasttrackit.course7.homework.animal;

public class Mouse implements Animal {
    @Override
    public String walk() {
        return "Mouse walking";
    }

    @Override
    public String talk() {
        return "Mouse talking";
    }

    @Override
    public String eat() {
        return "Mouse eating";
    }
}
