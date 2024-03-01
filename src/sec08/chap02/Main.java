package sec08.chap02;

import game.Knight;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //  ⭐️ 제네릭을 사용하여 타입 지정
        //  - 붙이지 않을 시 <Object>와 동일
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        ArrayList<Knight> knights = new ArrayList<>();

        //  add 메소드로 요소 추가
        ints1.add(11);
        ints1.add(22);
        ints1.add(33);
        ints1.add(44);
        ints1.add(55);

        //  요소 중복 허용
        for (String str : "바니 바니 바니 바니 당근 당근".split(" ")) {
            strings.add(str);
        }

        //  for-each 문 사용 가능
        for (int i : ints1) {
            System.out.println(i);
        }

        int ints1Size = ints1.size(); // 요소 개수
        boolean ints1IsEmpty = ints1.isEmpty(); // size가 0인지 여부 반환
        int ints12nd = ints1.get(1); // 인덱스로 요소 접근
        boolean ints1Con3 = ints1.contains(33); // 포함 여부
        boolean ints1Con6 = ints1.contains(66);

        ints1.set(2, 444); // 위치의 요소 수정
        ints1.add(0, 11); // 위치에 요소 추가 (다음 요소들 밀어냄)

        List<Integer> intList = new ArrayList<>();
        intList = new LinkedList<>();

        Set<String> strSet = new HashSet<>();
        strSet = new TreeSet<>();

        Map<Integer, String> intStrMap = new HashMap<>();
        intStrMap = new TreeMap<>();

        //




    }



}
