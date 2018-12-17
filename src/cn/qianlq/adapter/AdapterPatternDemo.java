package cn.qianlq.adapter;

import cn.qianlq.adapter.example.AudioPlayer;
import cn.qianlq.adapter.object.*;
import cn.util.XMLUtil;

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:32
 * email: qianlq0824@gmail.com
 */

public class AdapterPatternDemo {

    public static void main(String[] args) {
        Adaptee adaptee = new Mp4Adaptee();
        Target target = new Adapter(adaptee);
        target.play();

        adaptee = new VlcAdaptee();
        target = new Adapter(adaptee);
        target.play();

        Adaptee vlcAdaptee = (Adaptee) XMLUtil.getObejct("src/cn/qianlq/adapter/config/config.xml", "adapteeType");
        vlcAdaptee.playMusic();

        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
