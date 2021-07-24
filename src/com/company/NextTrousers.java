package com.company;

public class NextTrousers implements Trousers {
    public String trousers;

    public NextTrousers (String trousers){
        this.trousers = trousers;
    }

    @Override
    public void puton() {
        System.out.println("Одел штаны Next");

    }

    @Override
    public void takeoff() {
        System.out.println("Снял штаны Next");

    }
}
