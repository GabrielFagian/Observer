package com.tcc.designpatern.model;

import com.tcc.designpatern.interfaces.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Stock{

    private String product;
    private Integer quantity;
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public Stock(String product, Integer quantity){
        this.quantity = quantity;
        this.product = product;
    }

    public void notifyObject(){
        for(Observer observer: observers)
            observer.update(this);
    }

    public void setProduct(String product){
        this.product = product;
        notifyObject();
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
        notifyObject();
    }

    public int getQuantity(){
        return quantity;
    }

    public String getProduct(){
        return product;
    }
}
