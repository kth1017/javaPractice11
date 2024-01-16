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
}
