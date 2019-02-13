package com.coderqian.adapter.example;

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:15
 * email: qianlq0824@gmail.com
 */

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
