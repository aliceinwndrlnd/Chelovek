package com.company;

public class ModoShoes implements Shoes {
    public String shoes;

    public ModoShoes (String shoes){
        this.shoes = shoes;
    }

    @Override
    public void puton() {
        System.out.println("Одел обувь Modo");

    }

    @Override
    public void takeoff() {
        System.out.println("Снял обувь Modo");

    }
}
