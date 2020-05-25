package com.example;

public class Car {
    private int speed;
    private String name;

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Ошибка! Скорость не может быть отрицательным числом!");
        }
    }
}
