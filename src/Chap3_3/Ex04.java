package Chap3_3;

public class Ex04 {
    int x = 1, y = 2;

    //  💡 단축평가 적용됨
    int changed1 = x < y ? (x += 2) : (y += 2);
    int changed2 = x < y ? (x += 2) : (y += 2); // 🔴
    int changed3 = x < y ? (x += 2) : (y += 2);
    int changed4 = x < y ? (x += 2) : (y += 2);
    int changed5 = x < y ? (x += 2) : (y += 2);

}
