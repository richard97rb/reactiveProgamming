package com.richard.rxjava.example3;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class Main {
    public static void main(String[] args) {
        Observable<String> list = Observable.just("Hello","world","Hello","form Chiclayo");

        list.map(String::toUpperCase).subscribe(e->System.out.println(e));

    }
}