package com.richard.rxjava.exampe2;

import io.reactivex.Observable;

public class Main {
    public static void main(String[] args) {
        Observable<String> list = Observable.just("skhello", "world","hello", "people");

        list.subscribe(new MyObserver());
    }
}
