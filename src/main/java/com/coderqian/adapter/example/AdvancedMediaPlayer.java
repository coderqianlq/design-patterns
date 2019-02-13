package com.coderqian.adapter.example;

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:14
 * email: qianlq0824@gmail.com
 */

public interface AdvancedMediaPlayer {

    /**
     * 播放Vlc
     *
     * @param fileName 文件名
     */
    void playVlc(String fileName);

    /**
     * 播放MP4
     *
     * @param fileName 文件名
     */
    void playMp4(String fileName);
}
