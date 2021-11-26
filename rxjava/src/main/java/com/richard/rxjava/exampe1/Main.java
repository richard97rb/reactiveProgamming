package com.richard.rxjava.exampe1;

import io.reactivex.Observable;

public class Main {
     public static void hello(){
         Observable.just("Hello, world")
                 .subscribe(onNext -> {
                     System.out.println(onNext);
                 });
         Observable<Integer> integerObservable = Observable.just(1 ,2, 3);

         integerObservable.subscribe(intOut->{
                     System.out.println(intOut);
                 });  //Integer observable
          Observable<String> stringObservable = Observable.just("hello, ", "world", "!"); // String observable
            stringObservable.subscribe(stringOut->{
                System.out.println(stringOut);
            });
     }

     public static void main(String args[]){
         hello();
         //Observable<Integer> integerObservable = Observable.just(1 ,2, 3);  //Integer observable
         // Observable<String> stringObservable = Observable.just("hello, "world", "!") // String observable
     }
}
