package com.springcore.lifecycle;

/*
    Implementing bean life cycle using interfaces
*/

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("Setting pepsi");
    }

    public Pepsi(){
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        //will work as init()
        System.out.println("Taking pepsi: init..");
    }

    public void destroy() throws Exception {
        //will work as destroy()
        System.out.println("Going to put bottle back to shop: destroy..");
    }
}
