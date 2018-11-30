package com.cotx.test.pattern.observer.example01;

public abstract class Observer {
    protected  Subject subject;

    /**
     * 观察者实现自己的更新业务
     */
    public abstract void update();
}
