package com.li.bridge;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  14:42:27
 * @version:
 * @Description: 具体实现化角色
 */
public class Mp4File implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("播放MP4文件------"+fileName);
    }
}
