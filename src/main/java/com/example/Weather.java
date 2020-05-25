package com.example;

public enum Weather{
    Sunny(1), Windy(0.95), Rainy(0.75);
    private double mod;

    Weather(double mod){
        this.mod = mod;
    }

    public double getMod(){ return mod;}
}
