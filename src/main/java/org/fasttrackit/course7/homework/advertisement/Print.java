package org.fasttrackit.course7.homework.advertisement;

public class Print implements AdvertiseService {
    @Override
    public String displayAdvertiseMethod() {
        return "does its advertising by printing fliers";
    }

    @Override
    public String toString() {
        return "Print{}";
    }
}
