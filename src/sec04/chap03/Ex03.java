package sec04.chap03;

public class Ex03 {
    public static void main(String[] args) {
        char yutnori = '도';

        switch (yutnori) {
            case '모': System.out.println("앞으로");
            case '윷': System.out.println("앞으로");
            case '걸': System.out.println("앞으로");
            case '개': System.out.println("앞으로");
            case '도': System.out.println("앞으로"); break;
            default:
                System.out.println("무효");
        }
    }
}
