package com.dmitriy.test.patterns.observer.test;

import com.dmitriy.test.patterns.observer.implementations.FileObserver;
import com.dmitriy.test.patterns.observer.implementations.LoggerObserver;
import com.dmitriy.test.patterns.observer.implementations.MeteoStation;

import java.util.TreeSet;

public class ObserverTest {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(new LoggerObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setTemperature(22.2,750);
        meteoStation.setTemperature(22.8,755);

        TreeSet<String> opsSet = new TreeSet<>();
        String newStr = new String();
        newStr = "op";
        newStr = newStr.concat("a");
        opsSet.add("opa");
        opsSet.add("opa");
        opsSet.add(newStr);
        opsSet.add("Bugaga");
        for (String str : opsSet){
            System.out.println(str);
        }
    }
}
