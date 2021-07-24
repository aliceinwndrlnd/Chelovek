package com.company;

public class Human implements Jacket,Trousers,Shoes {
    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Shoes shoes;


    public Human (String name, Jacket jacket, Trousers trousers, Shoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }


    public String getName () {
        return name;
    }

    public Jacket getJacket () {
        return jacket;
    }
    public Trousers getTrousers () {
        return trousers;
    }
    public Shoes getShoes() {
        return shoes;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setJacket (Jacket jacket) {
        this.jacket = jacket;
    }
    public void setShoes (Shoes shoes) {
        this.shoes = shoes;
    }
    public void setTrousers (Trousers trousers) {
        this.trousers = trousers;
    }

    @Override
    public void puton() {
        jacket.puton();
        trousers.puton();
        shoes.puton();
    }

    @Override
    public void takeoff() {
        jacket.takeoff();
        trousers.takeoff();
        shoes.takeoff();
    }
}
