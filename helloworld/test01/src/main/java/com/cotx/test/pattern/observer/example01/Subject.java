package com.cotx.test.pattern.observer.example01;

import java.util.ArrayList;
import java.util.List;

public class Subject {
        private List<Observer> observers=new ArrayList<>();
        private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();//状态发生改变，去通知观察者
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知观察者对象，被观察者已经发生变化
     * 被观察者只负责通知，至于怎么变化，需要观察者自己决定。
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
