package cn.qianlq.adapter.object.adapter;

import cn.qianlq.adapter.object.Mp4Adaptee;
import cn.qianlq.adapter.object.Target;

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
