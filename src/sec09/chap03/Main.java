package sec09.chap03;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    /*

    # 클래스 메소드 호출
    {클래스명}::{클래스 메소드명}

    # 인스턴스 메소드 호출
    {클래스명}::{인스턴스메소드명}
    {인스턴스}::{인스턴스메소드명}

    # 클래스 생성자 호출
    {클래스}::new

     */
    public static void main(String[] args) {
        //  클래스의 클래스 메소드에 인자 적용하여 실행
        Function<Integer, String> intToStrLD = (i) -> String.valueOf(i);
        Function<Integer, String> intToStrMR = String::valueOf;
        String intToStr = intToStrMR.apply(123);

        //  인자로 받은 인스턴스의 메소드 실행
        UnaryOperator<String> toLCaseLD = s -> s.toLowerCase();
        UnaryOperator<String> toLCaseMR = String::toLowerCase;
        String toLCase = toLCaseMR.apply("HELLO");

        //  클래스의 생성자 실행
        Function<String, Button> strToButtonLD = s -> new Button(s);
        Function<String, Button> strToButtonMR = Button::new;
        Button button1 = strToButtonMR.apply("Dog");


        System.out.println(button1.getText());

    }
}
