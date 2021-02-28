package com.company;

public class Car extends Transport implements Printable {

    private String makerCountry;
    private int engineVolume;

    public Car(String name, String makerCountry, int engineVolume) {
        super.setName(name);
        this.engineVolume = engineVolume;
        this.makerCountry = makerCountry;

    }

    @Override
    public void print() {
        System.out.println(Car.class.getSimpleName() + " " + getName()
                + " made in " + makerCountry + " with engine volume " + engineVolume);
    }
}
