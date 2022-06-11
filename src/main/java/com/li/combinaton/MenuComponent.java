package com.li.combinaton;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  17:45:37
 * @version:
 * @Description: 抽象根节点（Component）
 */
public abstract class MenuComponent {
    protected String  name;
    protected int level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return name;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }


}
