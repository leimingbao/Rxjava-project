package com.leiming.rxjavaproject.rxjavasimple;

import java.util.ArrayList;
import java.util.List;

public class Observable implements AbstractObservable {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifys(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
