package sec05.chap02;

public class Ex03 {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 10000),
                new ChickenMenu("양념치킨", 12000),
                new ChickenMenu("화덕구이", 15000, "bake")
        };
        YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("오븐구이");

        System.out.println(YalcoChicken.A.aa);
        System.out.println(Test01.a);
    }
}
