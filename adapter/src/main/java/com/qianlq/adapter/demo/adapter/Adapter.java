package com.qianlq.adapter.demo.adapter;

import com.qianlq.adapter.demo.Mp4Adaptee;
import com.qianlq.adapter.demo.Target;

/**
 * 类适配器模式
 *
 * @author qianliqing
 * @date 2018/12/11 10:16 AM
 * email: qianlq0824@gmail.com
 */

public class Adapter extends Mp4Adaptee implements Target {

    @Override
    public void play() {
        playMusic();
    }
}
