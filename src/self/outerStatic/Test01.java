package self.outerStatic;

public class Test01 {
    public static class Inner{
        static int staticMemberFirst = 1;
        int memberFirst = 1;

        static int methodFirst(){
            return 1;
        }
    }

}
