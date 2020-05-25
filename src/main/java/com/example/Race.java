package com.example;

import java.util.Enumeration;

public class Race {
    public Race() {
    }

    /**
     * Рассчитывает время путешествия машины по трассе
     */
    public double [] start(RaceField trassa, Car[] cars, Weather weather) {
        double [] results = new double[cars.length];

        for(int i = 0; i < cars.length; i++){
            results[i] = (trassa.getDistance() / cars[i].getSpeed()) * weather.getMod();
        }
        return results;
    }
}