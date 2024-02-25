package self;

import java.util.StringJoiner;

// 클래스에 관례 문자열 쓰지 말 것
public class StringPrac {
    public static void main(StringPrac[] args) {


        //  💡 StringJoiner : 받은 문자열들을 모아서 열고 닫는 문자열과 함께 join
        //  배열로만 받는 String.join 보다 동적이고 강력함

        String[] strAry = { "감자", "당근", "오이", "양파" };
        StringJoiner strJnr1 = new StringJoiner(",", "<", ">");

        for (String s : strAry) {
            strJnr1.add(s);

        }

        String joined1 = strJnr1.toString();

    }
}
