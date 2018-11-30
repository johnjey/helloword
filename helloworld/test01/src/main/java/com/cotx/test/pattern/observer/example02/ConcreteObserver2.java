package com.cotx.test.pattern.observer.example02;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("观察者2收到消息，并进行处理");
    }
}
