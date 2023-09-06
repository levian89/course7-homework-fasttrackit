package org.fasttrackit.course7.homework.advertisement;

public class Facebook implements AdvertiseService {
    @Override
    public String displayAdvertiseMethod() {
        return "does its advertising via facebook page";
    }

    @Override
    public String toString() {
        return "Facebook{}";
    }
}
