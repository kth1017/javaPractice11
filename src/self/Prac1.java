package self;

import java.math.BigDecimal;

public class Prac1 {
    public static void main(String[] args) {
        // 매개변수 args
        for (String arg : args) {
            System.out.println(arg);
        }

        // 타입 추론
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /*
        decimal
         */
        float num6 = new BigDecimal("0.2")
                .add(new BigDecimal("0.3"))
                .floatValue();

        float num7 = new BigDecimal("0.3")
                .multiply(new BigDecimal("0.7"))
                .floatValue();

        float num8 = new BigDecimal("0.4")
                .subtract(new BigDecimal("0.3"))
                .floatValue();

        double num9 = new BigDecimal("0.9")
                .divide(new BigDecimal("0.3"))
                .doubleValue();

        double num10 = new BigDecimal("0.9")
                .remainder(new BigDecimal("0.6"))
                .doubleValue();
    }

    // 버퍼 빌더

    CharSequence cs1 = "ABC";
    CharSequence cs2 = new StringBuffer();
    CharSequence cs3 = new StringBuilder();

    /*
    꼬리 재귀
     */

    static int factorial (int num) {
        return num == 0 ? 1 : num * factorial(--num);
    }

    int fact1 = factorial(1);
    int fact2 = factorial(2);
    int fact3 = factorial(3);
    int fact4 = factorial(4);
    int fact5 = factorial(5);


}