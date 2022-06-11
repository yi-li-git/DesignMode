package com.li.bridge;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  14:41:06
 * @version:
 * @Description: 具体实现化角色
 */
public class AviFile  implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("播放AVI视频----"+fileName);
    }
}
