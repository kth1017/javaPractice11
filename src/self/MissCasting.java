package self;

public class MissCasting {
    public static void main(String[] args) {
        // 자바에서 클래스 캐스팅시 거치는 메모리 과정은
        /*
        1 겍체의 실제 타입 확인
        2 캐스팅 유효성 검사(상속 관게 확인)
        3 메모리 조정
         */

        interface MyInterface {
            void myMethod();
        }

        class MyClass implements MyInterface {
            public void myMethod() {
                System.out.println("Implementation of MyInterface");
            }

            void myClassMethod() {
                System.out.println("MyClass specific method");
            }
        }

        MyInterface myInterfaceObj = new MyClass();



        // 잘못된 캐스팅 - 실제로는 MyClass 객체이지만 MyInterface 타입으로 캐스팅
        // 이 시점에서는 컴파일 오류가 발생하지 않습니다.
        MyClass myClassObj = (MyClass) myInterfaceObj;

        // 실행 중에 ClassCastException 발생
//        myClassObj.myClassMethod();
    }
}
