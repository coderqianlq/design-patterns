package com.coderqian.adapter.example;


/**
 * 为媒体播放器和更高级的媒体播放器创建接口。
 */

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:13
 * email: qianlq0824@gmail.com
 */

public interface MediaPlayer {

    /**
     * @param audioType 音频类型
     * @param fileName  文件名
     */
    void play(String audioType, String fileName);
}
