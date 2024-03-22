package self;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamPrac {
    public static void main(String[] args) {
        System.out.println("\n- - - - -\n");

        //  💡 peek으로 중간 과정 체크하기
        //  - 스트림이나 요소를 변경하지 않고 특정 작업 수행 - 디버깅에 유용
        String oddSquaresR = IntStream.range(0, 10).boxed()
                .peek(i -> System.out.println("초기값: " + i))
                .filter(i -> i % 2 == 1)
                .peek(i -> System.out.println("홀수만: " + i))
                .map(i -> i * i)
                .peek(i -> System.out.println("제곱: " + i))
                .sorted((i1, i2) -> i1 < i2 ? 1 : -1)
                .peek(i -> System.out.println("역순: " + i))
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        Integer[] ints = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        //  💡 allMatch/anyMatch : (모든 요소가/어느 한 요소라도)
        //  - 주어진 Predicate에 부합하는가 여부 반환
        boolean intsMatch = Arrays.stream(ints)
                .allMatch(i -> i > 0);
        //.allMatch(i -> i % 2 == 0);
        //.anyMatch(i -> i < 0);
        //.anyMatch(i -> i % 2 == 0);

        System.out.println("\n- - - - -\n");

        //  💡 takeWhile/dropWhile 주어진 Predicate을 충족시킬 때까지 취함/건너뜀
        //  💡 count : 중간과정을 거친 요소들의 개수를 반환
        long afterWhileOp = Arrays.stream(ints)
                .takeWhile(i -> i < 4)
                //.dropWhile(i -> i < 4)
                .peek(System.out::println)
                .count();

        System.out.println("\n- - - - -\n");

        double doubleSum = DoubleStream.iterate(3.14, i -> i * 2)
                .limit(10)
                .peek(System.out::println)
                .sum();


    }
}
