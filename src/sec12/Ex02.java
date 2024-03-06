package sec12;

import java.io.*;
public class Ex02 {
    public static void main(String[] args) {
        //  완전 절대경로로 파일 생성
        File file = new File("");
        try {
            boolean result = file.createNewFile();
            //  💡 해당 이름의 파일이 있다면 예외를 발생시키지는 않고 false 반환
            System.out.println(result ? "파일 생성됨" : "이미 있음");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String newName = "name_changed.txt" ;

        File file2 = new File(Ex01.CUR_PATH + "file2.txt");
        File nameChange = new File(Ex01.CUR_PATH + newName);

        //  💡 파일의 이름 변경하고 결과 반환
        boolean renameResult = file2.renameTo(nameChange);
        System.out.println(renameResult ? "이름 변경됨" : "해당 파일 없음");

        //  💡 파일의 삭제하고 결과 반환
        boolean deleteResult = nameChange.delete();
        System.out.println(deleteResult ? "삭제됨" : "해당 파일 없음");
    }
}
