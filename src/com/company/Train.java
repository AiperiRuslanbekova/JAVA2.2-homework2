package com.company;

public class Train extends Transport implements Printable {

    private int quantityOfWagon;

    public Train (String name, int quantityOfWagon) {
        super.setName(name);
        this.quantityOfWagon=quantityOfWagon;

    }

    @Override
    public void print() {
        System.out.println(Train.class.getSimpleName() + " " + getName()
                + " with quantity of wagons " + quantityOfWagon);
    }
}
