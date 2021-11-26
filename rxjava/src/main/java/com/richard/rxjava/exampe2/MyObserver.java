package com.richard.rxjava.exampe2;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MyObserver implements Observer {
    @Override
    public void onSubscribe(Disposable disposable) {
        System.out.println("Subscribed");
    }

    @Override
    public void onNext(Object o) {
        System.out.println(o);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("This is an error");
    }

    @Override
    public void onComplete() {
        System.out.println("Completed");
    }
}
