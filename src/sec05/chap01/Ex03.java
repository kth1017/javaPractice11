package sec05.chap01;

public class Ex03 {

    public static void main(String[] args) {
        YalcoChicken store1 = new YalcoChicken(3, "판교");
        YalcoChicken store2 = new YalcoChicken(17, "강남");
        YalcoChicken store3 = new YalcoChicken(24, "제주");

        String[] intros = {store1.intro(), store2.intro(), store3.intro()};

        System.out.println(intros[0]);
    }
}
