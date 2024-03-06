package sec12;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static final String CUR_PATH = "src/asec12/chap01/";
    public static void main(String[] args) {
        String filePath = "file1.txt";
        filePath = CUR_PATH + filePath; //  ⭐️ 상대경로

        //  💡 파일명만 적으면 프로젝트 파일 바로 안에 저장
        //  - 상대경로 또는 절대경로를 앞에 추가하여 지정

        File file1 = new File(filePath);
        System.out.println(file1.exists()); // 생성 후 다시 실행해 볼 것

        if (!file1.exists()) {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                System.out.println("🛑 파일 생성 실패");
                // CUR_PATH를 틀리게 작성하고 실행해 볼 것
                throw new RuntimeException(e);
            }
        }

    }
}
