package com.li.bridge;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  14:48:42
 * @version:
 * @Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        OperatingStream mac = new Mac(new Mp4File());

        mac.play("sss");
    }
}
