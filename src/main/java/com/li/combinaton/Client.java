package com.li.combinaton;

/**
 * @Author: pijione
 * @createTime: 2022/06/11  19:34:17
 * @version:
 * @Description: 测试
 */
public class Client {
    public static void main(String[] args) {
        Menu menu = new Menu("系统管理", 1);
        Menu menu1 = new Menu("菜单管理", 2);
        menu1.add(new Menu("页面访问",3));
        menu1.add(new Menu("展开菜单",3));

        Menu menu31 = new Menu("菜单1", 3);
        menu1.add(menu31);
        menu31.add(new Menu("4545",4));
        Menu menu2 = new Menu("权限配置", 2);

        Menu menu3 = new Menu("角色管理", 2);

        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        menu.print();

        MenuComponent child = menu.getChild(0);
        child.print();
    }
}
