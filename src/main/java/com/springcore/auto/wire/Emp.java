package com.springcore.auto.wire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Setting value...");
    }

    public Emp(){
        super();
    }

    public Emp(Address address) {
        this.address = address;
        System.out.println("Using constructor...");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
