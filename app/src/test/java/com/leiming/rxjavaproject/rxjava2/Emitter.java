package com.leiming.rxjavaproject.rxjava2;

/**
 * 定义发送消息的API
 */
public interface Emitter<T> {
    //发送消息
    void onNext(T t);
    void onError(Throwable e);
    void onComplete();
}
