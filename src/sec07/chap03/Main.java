package sec07.chap03;

public class Main {
    //  제네릭 메소드
    //  T : 타입변수. 원하는 어떤 이름으로든 명명 가능
    public static <T> T pickRandom (T a, T b) {
        return Math.random() > 0.5 ? a : b;
    }


    public static void main(String[] args) {
        int randNum = pickRandom(123, 456);
        boolean randBool = pickRandom(true, false);
        String randStr = pickRandom("마루치", "아라치");




    }

    //  선언시 아래와 같이 자료형에 각 타입변수의 자료형을 명시
    //  - 제내릭에는 원시값이 아닌 클래만 사용 가능
    //  - (래퍼 클래스의 또 다른 존재 이유)
    Pocket<Double, Double, Double> size3d1 =
            new Pocket<>(123.45, 234.56, 345.67);

    //  타입추론도 가능은 함
    Pocket<Double, Double, Double> size3d2 =
            new Pocket<>(123.45, 234.56, 345.67);

    double width = size3d1.getFieldA();
    double height = size3d1.getFieldB();
    double depth = size3d1.getFieldC();

    Pocket<String, Integer, Boolean> person =
            new Pocket<>("홍길동", 20, false);

    //  제네릭 클래스는 배열 생성시 new로 초기화 필수
    Pocket<String, Integer, Boolean>[] people = new Pocket[] {
            new Pocket<>("홍길동", 20, false),
            new Pocket<>("전우치", 30, true),
            new Pocket<>("임꺽정", 27, true),
    };


}
