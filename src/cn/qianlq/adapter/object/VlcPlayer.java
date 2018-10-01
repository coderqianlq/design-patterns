package cn.qianlq.adapter.object;

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:14
 * email: qianlq0824@gmail.com
 */

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }
}
