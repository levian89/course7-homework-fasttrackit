package org.fasttrackit.course7.homework.advertisement;

public class Company {
    private String name;
    private AdvertiseService advertiseService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdvertiseService getAdvertiseService() {
        return advertiseService;
    }

    public void setAdvertiseService(AdvertiseService advertiseService) {
        this.advertiseService = advertiseService;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", advertiseService=" + advertiseService +
                '}';
    }
}
