package com.qianlq.observer;

import com.qianlq.observer.object.BinaryObserver;
import com.qianlq.observer.object.HexaObserver;
import com.qianlq.observer.object.OctalObserver;
import com.qianlq.observer.object.Subject;

/**
 * @author qianliqing
 * @date 2018-10-08 下午8:35
 * mail: qianlq0824@gmail.com
 */

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
