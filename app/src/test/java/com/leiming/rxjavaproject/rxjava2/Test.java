package com.leiming.rxjavaproject.rxjava2;

public class Test {
    @org.junit.Test
    public void test() {

        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(Emitter<String> emitter) {
                emitter.onNext("大家好");
            }
        }).map(new Function<String,String>() {
            @Override
            public String apply(String o) {
                return o;
            }
        }).subscribe(new Observer() {
            @Override
            public void onSubscribe() {

            }

            @Override
            public void onNext(Object o) {
                System.out.println("收到消息" + (String) o);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
