package com.cotx.test.pattern.observer;

import com.cotx.test.pattern.observer.example01.BinaryObserver;
import com.cotx.test.pattern.observer.example01.HexaObserver;
import com.cotx.test.pattern.observer.example01.OctalObserver;
import com.cotx.test.pattern.observer.example01.Subject;
import org.junit.Test;

/**
 * 设计模式测试类
 */
public class TestPattern {

    /**
     * 测试观察者设计模式
     */
    @Test
    public void testObserver(){
        Subject subject = new Subject();

        /*Observer observer1 = new Observer() {
            @Override
            public void update() {

            }
        };*/
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First state change:15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
