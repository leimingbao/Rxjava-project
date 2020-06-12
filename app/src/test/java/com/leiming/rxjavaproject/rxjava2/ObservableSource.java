package com.leiming.rxjavaproject.rxjava2;

/**
 * 抽象被观察者
 */
public interface ObservableSource<T> {
    void subscribe(Observer<T> observer);
}
