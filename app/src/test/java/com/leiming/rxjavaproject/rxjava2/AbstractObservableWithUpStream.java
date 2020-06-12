package com.leiming.rxjavaproject.rxjava2;

public class AbstractObservableWithUpStream<T,R> extends Observable<R> {

    protected ObservableSource<T> source;

    public AbstractObservableWithUpStream(ObservableSource<T> source) {
        this.source = source;
    }

    @Override
    protected void subscribeActual(Observer<R> observer) {
//        source.subscribe(observer);
    }
}
