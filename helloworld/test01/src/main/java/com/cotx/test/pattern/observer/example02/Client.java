package com.cotx.test.pattern.observer.example02;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(new ConcreteObserver1());
        subject.addObserver(new ConcreteObserver2());

        subject.doSomething();
    }
}
