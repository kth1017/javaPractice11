package sec08.chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prac1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        ArrayList<Integer> list2 = new ArrayList<>(list1);

        String list1Type = list1.getClass().getName();
        String list2Type = list2.getClass().getName();

        // list1.add(6); // ⚠️ 런타임 오류
        list2.add(6);
    }
}
