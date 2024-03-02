package sec11;

public class Sync1 {
    public synchronized static void main(String[] args) {

        // 1. 기본 무한루프
        // 예시 1은 공유된 자원을 사용하는 것이 아니기에 동기화를 따지기 위한 에시로 부적절

//        Thread thread1 = new Thread(() -> {
//            for (int i = 1; i > 0; i++) {
//                System.out.print(1);
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            for (int i = 1; i > 0; i++) {
//                System.out.print(2);
//            }
//        });

        // 2. sync(arr)를 이용한 동기화
        // 따라서 아래의 예시로는 출력 결과값을 1로 고정할 수 있음
        int[] arr = {1, 2};

//        Thread thread1 = new Thread(() -> {
//            synchronized (arr) {
//                for (int i = 1; i > 0; i++) {
//                    System.out.println(arr[0]);
//
//                }
//            }
//        });
//        Thread thread2 = new Thread(() -> {
//            synchronized (arr) {
//                for (int i = 1; i > 0; i++) {
//                    System.out.println(arr[1]);
//                }
//            }
//        });

        // 3. lock을 이용한 쓰레드 통신

        Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i > 0; i++) {
                    System.out.println(arr[0]);
                    lock.notify(); // 다른 스레드를 깨움
                    try {
                        lock.wait(); // 자신을 일시 정지
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i > 0; i++) {
                    System.out.println(arr[1]);
                    lock.notify(); // 다른 스레드를 깨움
                    try {
                        lock.wait(); // 자신을 일시 정지
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }

}
