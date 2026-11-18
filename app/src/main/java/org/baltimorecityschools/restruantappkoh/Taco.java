package org.baltimorecityschools.restruantappkoh;

public class Taco {
    private int quantity;
    private int numSauces;
    private String size;
    private final double BASE_PRICE;

    public Taco() {
        quantity = 5;
        numSauces = 0;
        size = "M";
        BASE_PRICE = 6.00;
    }


    public Taco(String size, int numSauces, int quantity) {
        this.size = size;
        this.numSauces = numSauces;
        this.quantity = quantity;
        BASE_PRICE = 6.00;
    }


    public double getBASE_PRICE() {
        return BASE_PRICE;
    }

    public String getSize() {
        return size;
    }

    public int getNumSauces() {
        return numSauces;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void setNumSauces(int numSauces) {
        this.numSauces = numSauces;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Taco{" +
                "quantity=" + quantity +
                ", numSauces=" + numSauces +
                ", size='" + size + '\'' +
                ", BASE_PRICE=" + BASE_PRICE +
                '}';
    }
}


