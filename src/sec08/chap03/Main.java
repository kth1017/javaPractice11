package sec08.chap03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> intHSet1 = new HashSet<>();
        intHSet1.add(1);
        intHSet1.add(1);
        intHSet1.add(2);
        intHSet1.add(3);

        List<Integer> ints1 = new ArrayList(
                Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 7)
        );
        Set<Integer> intHSet2 = new HashSet<>(ints1);


    }



}
