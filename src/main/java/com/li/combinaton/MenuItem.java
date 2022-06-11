package com.li.combinaton;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  19:32:08
 * @version:
 * @Description: 叶子节点（Leaf）
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level){
        this.name=name;
        this.level =level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
