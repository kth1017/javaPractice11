package self.outerStatic;

public class Main {
    public static void main(String[] args) {
        Outer outer1 = new Outer();

        System.out.println(outer1.memberFirst);
        // 스태틱 멤버는 클래스에 종속되지 않고 독립적
        System.out.println(Outer.staticMemberFirst);
        System.out.println(Test01.Inner.staticMemberFirst);

        //또한 스태틱 클래스는 인스턴스화 불가로 다른 클래스의 멤버가 될 수 없음.




    }
}
