package com.leiming.rxjavaproject.rxjava2;

/**
 *
 */
public class ObservableCreate<T> extends Observable<T> {

    ObservableOnSubscribe<T> source;

    public ObservableCreate(ObservableOnSubscribe<T> source) {
        this.source = source;
    }

    @Override
    public void subscribe(Observer observer) {
        super.subscribe(observer);
    }

    //如果订阅功能要实现，在这里就应该通知observable要更新了
    @Override
    protected void subscribeActual(Observer observer) {
//        observer.onNext();
        CreateEmitter<T> parent = new CreateEmitter<>(observer);
        observer.onSubscribe();
        //把观察者(发射器)和被观察者绑定在一期（订阅）
        source.subscribe(parent);
    }

    static final class CreateEmitter<T> implements Emitter<T>{

        Observer<T> observer;

        public CreateEmitter(Observer<T> observer) {
            this.observer = observer;
        }

        @Override
        public void onNext(T t) {
            observer.onNext(t);
        }

        @Override
        public void onError(Throwable e) {
            observer.onError(e);
        }

        @Override
        public void onComplete() {
            observer.onComplete();
        }
    }
}
