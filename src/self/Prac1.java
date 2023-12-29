package self;

import java.math.BigDecimal;

public class Prac1 {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

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

    CharSequence cs1 = "ABC";
    CharSequence cs2 = new StringBuffer();
    CharSequence cs3 = new StringBuilder();
}