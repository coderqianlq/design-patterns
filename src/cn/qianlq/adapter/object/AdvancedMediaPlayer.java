package cn.qianlq.adapter.object;

/**
 * @author qianliqing
 * @date 2018/6/8 下午8:14
 * email: qianliqing@hyperchain.com
 */

public interface AdvancedMediaPlayer {

    /**
     * 播放Vlc
     *
     * @param fileName 文件名
     */
    public void playVlc(String fileName);

    /**
     * 播放MP4
     *
     * @param fileName 文件名
     */
    public void playMp4(String fileName);
}
