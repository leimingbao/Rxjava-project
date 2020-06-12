package com.leiming.rxjavaproject.rxjava2;

public class BaseicFusableObserver<T, R> implements Observer<T> {

    protected final Observer<R> actual;

    public BaseicFusableObserver(Observer<R> actual) {
        this.actual = actual;
    }

    @Override
    public void onSubscribe() {
        actual.onSubscribe();
    }

    @Override
    public void onNext(T t) {
    }

    @Override
    public void onError(Throwable e) {
        actual.onError(e);
    }

    @Override
    public void onComplete() {
        actual.onComplete();
    }
}
