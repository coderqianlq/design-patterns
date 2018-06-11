package cn.qianlq.adapter;

import cn.qianlq.adapter.object.AudioPlayer;

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:32
 * email: qianliqing@hyperchain.com
 */

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
