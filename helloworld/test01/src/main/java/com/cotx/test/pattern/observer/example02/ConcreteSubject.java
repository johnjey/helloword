package com.cotx.test.pattern.observer.example02;

public class ConcreteSubject extends Subject {
    @Override
    public void doSomething(){
        System.out.println("被观察者事件发生123");
        this.notifyObserver();
    }
}
