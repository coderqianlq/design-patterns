package com.qianlq.observer;

import com.qianlq.observer.example.BinaryObserver;
import com.qianlq.observer.example.HexObserver;
import com.qianlq.observer.example.OctalObserver;
import com.qianlq.observer.example.Subject;

/**
 * @author CoderQian
 * @date 2018-10-08 下午8:35
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("\nSecond state change: 10");
        subject.setState(10);
    }
}
