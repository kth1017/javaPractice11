package sec03.Chap02;

public class Ex05 {
    public static void main(String[] args) {
        int int1 = 5;
        float flt1 = 2f;
        double dbl1 = 3;
        double dbl2 = 7;

        //  💡 정수 자료형과 실수 자료형의 계산은 실수 반환
        // int flt2 = int1 / flt1; // ⚠️ 불가
        double dbl3 = int1 / dbl1;
        double dbl4 = dbl2 / int1;

        //  💡 리터럴로 작성시 double임을 명시하려면 .0을 붙여줄 것
        double dbl5 = 5 / 2;
        double dbl6 = 5.0 / 2;
        double dbl7 = (double) 5 / 2;

        short aa = 1;
        int bb = 1;
        boolean cc = (aa == bb);

        float a = 1f;
        double b = 1;
        boolean c = (a == b);
    }
}
