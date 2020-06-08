package com.leiming.rxjavaproject.rxjavasimple;

public class Observer {

    public String name;

    public Observer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " - 收到消息:" + message);
    }
}
