package org.fasttrackit.course7.homework.advertisement;

public class Email implements AdvertiseService {
    @Override
    public String displayAdvertiseMethod() {
        return "does its advertising via email";
    }

    @Override
    public String toString() {
        return "Email{}";
    }
}
