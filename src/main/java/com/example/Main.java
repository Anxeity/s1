package com.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите дистанцию: ");
        String sDist = read.readLine();
        int userDist = Integer.parseInt (sDist);
        RaceField Field = new RaceField(userDist);
        System.out.println("Выберете один из вариантов погоды Sunny, Windy, Rainy и введи согласно примеру. ");
        String sWeather = read.readLine();
        System.out.println("Введите количество машин: ");
        String sNum = read.readLine();
        int num = Integer.parseInt (sNum);
        Car[] cars = new Car[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Введите скорость машины и через дефис ее название:");
            String edata = read.readLine();
            String[] buff = edata.split("-");
            int carSpeed = Integer.parseInt(buff[0]);
            String carName = buff[1];
            cars[i] = new Car(carSpeed, carName );
        }
        Race race = new Race();
        double [] finishList = race.start(Field, cars);
        for(int i = 0; i < num; i++){
            System.out.println("Машина " + cars[i].getName() + " преодолевает расстояние " + Field.getDistance() + " за " + finishList[i] + " часа");
        }
        Arrays.sort(finishList);
        System.out.println("Лучшее время заездов");
        System.out.println(Arrays.toString(finishList));
    }
    //GitComment
}

