package com.springcore.lifecycle;

/*
    XML Lifecycle configuration
*/

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Setting price..");
    }

    public Samosa(){
        super();
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void init(){
        System.out.println("Inside of init method....");
    }

    public void bye(){
        System.out.println("Inside of destroy method....bye bye i am going to die..");
    }

}
