package self;

import game.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class Prac1 {
    // 자바 규칙에 따라 반드시 메소드 호출은 메소드 내부에서 이루어져야 함
    Set<Integer> intHSet1 = new HashSet<>();
    public void a(){
        intHSet1.add(1);
    }
    public static void main(String[] args) {

        Map<Integer, String> numNameHMap = new HashMap<>();

        Map<Side, ArrayList<Unit>> sideUnitsHMap = new HashMap<>();
        sideUnitsHMap.put(
                Side.BLUE,
                new ArrayList<>(
                        Arrays.asList(
                                new Swordman(Side.BLUE),
                                new Knight(Side.BLUE),
                                new MagicKnight(Side.BLUE))
                )
        );
        sideUnitsHMap.put(
                Side.RED,
                new ArrayList<>(
                        Arrays.asList(
                                new Knight(Side.RED),
                                new Knight(Side.RED),
                                new Knight(Side.RED))
                )
        );

        Map<Integer, String> numNameHMapClone = new HashMap<>();
        numNameHMapClone.putAll(numNameHMap);

        Set<Integer> numSet = numNameHMap.keySet();
        Set<Integer> numHSet = new HashSet<>();
        numHSet.addAll(numSet);



        MyGeneric<String> test = new MyGeneric<>("hello");
        System.out.println(test.getValue());


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

    }

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

    // time

    LocalDateTime familyDinner = LocalDateTime.of(
            2023, 12, 25, 18, 00
    );

    LocalTime thisTime = LocalTime.now();
    LocalTime hourAndHalfLater = thisTime
            .plusHours(1)
            .plusMinutes(30);

    ZonedDateTime newYorkNewYear = ZonedDateTime.of(
            2023, 1, 1,
            0, 0, 0, 0,
            ZoneId.of("America/New_York"));

    ArrayList<Integer> ints1 = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5)
    );

    ArrayList<Integer> ints3 = new ArrayList<>(ints1);

    Map<Integer, String> intStrMap = new HashMap<>();

    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    ArrayList<Integer> list2 = new ArrayList<>(list1);

    String list1Type = list1.getClass().getName();
    String list2Type = list2.getClass().getName();

    Set<Integer> intHSet = new HashSet<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)
    );

    Iterator<Integer> intItor = intHSet.iterator();

    Integer int1 = intItor.next();
    Integer int2 = intItor.next();
    Integer int3 = intItor.next();

    boolean hasNext = intItor.hasNext();

//    for (Integer num : intHSet) {
//        if (num % 3 == 0) intHSet.remove(num);
//    }

//    Arrays.sort(strs, new Comparator<String>() {
//        @Override
//        public int compare(String o1, String o2) {
//            return o1.length() - o2.length();
//        }

    //  💡 Deprecated : 앞으로 사용하지 말 것
    //  - 더 좋은 / 기존 문제를 해결한 새 기능으로 대체
    //  - 기존의 메소드를 삭제할 수는 없으므로...
    @Deprecated
    public static void deprecatedMethod () {

        //  호출 메소드 작성시 IDE 힌트 보기
        //  ❗️Problems 탭에서 경고 메시지 확인
        System.out.println("라떼는 말이야...");
    }

    // 💡SuppressWarnings : 컴파일러의 경고 무시
    @SuppressWarnings("unchecked") // ⭐️
    public static void warnedMethod () {

        //  ⚠️ 제네릭을 사용하지 않는 컬렉션
        //  - unchecked 경고 발생
        //  - 실행시 에러가 발생하지는 않음
        //  - 위의 어노테이션 활성화하고 다시 확인

        ArrayList list = new ArrayList();
        list.add("감자");
        list.add("고구마");
        list.add("호박");
        System.out.println(list);

        System.out.println("\n- - - - -\n");

        String str1 = "Hello World! Welcome to the world of Java~";

        str1.chars().forEach(System.out::println);

        System.out.println("\n- - - - -\n");

        char str1MaxChar = (char) str1.chars()
                .max() // OptionalInt 반환 - 이후 배울 것
                //.min()
                .getAsInt();

        str1.chars()
                //.sorted()
                //.distinct()
                //.filter(i -> (i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z'))
                .forEach(i -> System.out.print((char) i));




    }






}