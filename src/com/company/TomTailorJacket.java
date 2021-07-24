package com.company;

public class TomTailorJacket implements Jacket{
    public String jacket;

    public TomTailorJacket (String jacket){
        this.jacket = jacket;
    }

    @Override
    public void puton() {
        System.out.println("Одел куртку Tom Tailor");

    }

    @Override
    public void takeoff() {
        System.out.println("Снял куртку Tom Tailor");

    }
}
