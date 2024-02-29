package sec09.chap02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Runnable dogButtonFunc = () -> System.out.println("멍멍");
        /*
        익명 클래스를 사용할 원형 기억/
        결국 람다를 사용하면 그 람다식이 러너블인지 컨슈머인지 등등을 정해줘야 함.
         */
        Runnable catButtonFunc = () -> System.out.println("야옹");
        Runnable cowButtonFunc = () -> System.out.println("음메");

        dogButtonFunc.run();
        catButtonFunc.run();
        cowButtonFunc.run();

        System.out.println("\n- - - - -\n");

        Button dogButton = new Button("강아지");
        dogButton.setOnClickListener(dogButtonFunc);

        Button catButton = new Button("고양이");
        catButton.setOnClickListener(() -> {
            System.out.println("- - - - -");
            System.out.println(catButton.getText() + " 울음소리: 야옹야옹");
            System.out.println("- - - - -");
        });

        dogButton.onClick();
        catButton.onClick();
    }

}
