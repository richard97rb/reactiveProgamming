package com.richard.rxjava.example4;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Observable<Long> list = Observable.interval(1, TimeUnit.SECONDS);
        list.subscribe(System.out::println);

        try{
            Thread.sleep(80000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
