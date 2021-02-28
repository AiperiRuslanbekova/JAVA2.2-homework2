package com.company;

public class Airplane extends Transport implements Printable {

    private String typeOfPlane;
    private int year;


    public Airplane(String name, String typeOfPlane, int year){
        super.setName(name);
        this.typeOfPlane=typeOfPlane;
        this.year=year;
    }
    @Override
    public void print() {
        System.out.println(Airplane.class.getSimpleName() + " " + getName() +
                " is a " + typeOfPlane + " made in " + year + " year");
    }
}
