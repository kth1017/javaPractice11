package sec03.Chap3_3;

public class Ex03 {
    int a = 1, b = 2, c = 0, d = 0, e = 0, f = 0;

    boolean bool1 = a < b && c++ < (d += 3);
    boolean bool2 = a < b || e++ < (f += 3);

    boolean bool3 = a > b && c++ < (d += 3); // 🔴
    boolean bool4 = a > b || e++ < (f += 3);
}
