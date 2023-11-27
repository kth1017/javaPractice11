package sec05.chap02;

public class YalcoChicken {
    int no;
    String name;
    ChickenMenu[] menus;

    YalcoChicken (int no, String name, ChickenMenu[] menus) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu (String name) {
        for (ChickenMenu menu : menus) {
            if (menu.name.equals(name)) { // 🔴
                return menu;
            }
        }
        return null;
    }

    static class A{
        // int aa;는 인식 불가
        static int aa;
    }
}