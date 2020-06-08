package com.leiming.rxjavaproject.rxjavasimple;

public interface AbstractObservable {
    public void add(Observer observer);
    public void notifys(String message);
}
