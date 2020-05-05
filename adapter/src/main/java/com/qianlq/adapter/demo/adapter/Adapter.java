package com.qianlq.adapter.demo.adapter;

import com.qianlq.adapter.demo.Mp4Adaptee;
import com.qianlq.adapter.demo.Target;

/**
 * 类适配器模式
 *
 * @author CoderQian
 * @date 2018/12/11 10:16 AM
 * @concat <a href="mailto:qianlq0824@gmail.com">qianlq0824@gmail.com</a>
 */

public class Adapter extends Mp4Adaptee implements Target {

    @Override
    public void play() {
        playMusic();
    }
}
