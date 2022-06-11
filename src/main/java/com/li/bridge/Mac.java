package com.li.bridge;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  14:45:17
 * @version:
 * @Description: 拓展抽象化角色
 */
public class Mac extends OperatingStream{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }
}
