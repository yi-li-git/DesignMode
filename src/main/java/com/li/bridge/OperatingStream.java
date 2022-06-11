package com.li.bridge;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  14:43:52
 * @version:
 * @Description: 抽象化角色
 */
public abstract class OperatingStream {
    protected VideoFile videoFile;

    public OperatingStream(VideoFile videoFile) {
        this.videoFile = videoFile;
    }


    abstract void play(String fileName);
}
