package com.li.combinaton;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  19:26:36
 * @version:
 * @Description: 树枝节点（Composite）
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> menuComponentList;

    public Menu(String name,int level) {
        this.name=name;
        this.level=level;
        this.menuComponentList = new ArrayList<MenuComponent>();
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {

        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}
