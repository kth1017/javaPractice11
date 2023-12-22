package sec06.chap08;

import java.util.Random;

public class Ex_Random {
    Random random = new Random();

    //  아래를 여러 차례 실행해 볼 것

    //  ⭐ 아래를 주석해제한 뒤 실행해 볼 것
    //  random.setSeed(1234);

    int randInt1 = random.nextInt();
    int randInt2 = random.nextInt();
    int randInt3 = random.nextInt();
    // 범위 지정 (이상, 미만)
    int randInt4 = random.nextInt(0, 10);
    int randInt5 = random.nextInt(0, 10);
    int randInt6 = random.nextInt(0, 10);

    double randDbl1 = random.nextDouble();
    double randDbl2 = random.nextDouble();
    // 범위 지정 (이상, 미만)
    double randDbl3 = random.nextDouble(3.14, 5.67);
    double randDbl4 = random.nextDouble(3.14, 5.67);

    boolean randBln1 = random.nextBoolean();
    boolean randBln2 = random.nextBoolean();
}
