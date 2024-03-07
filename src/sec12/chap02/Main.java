package sec12.chap02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;


public class Main {
    public static final String CUR_PATH = "src/sec12/chap02/";

    public static void main(String[] args) {
        //  💡 프로젝트 폴더 경로
        Path path1 = Paths.get("");
        Path path1Abs = path1.toAbsolutePath();

        Path path2 = Paths.get("my_file.txt");
        Path path2Abs = path2.toAbsolutePath();

        //  💡 인자로 들어온 문자열을 각각 내부 폴더로
        Path path3 = Paths.get(CUR_PATH, "sub1", "sub2", "sub3");

        //  💡 두 경로를 통합
        Path path4 = path3.resolve(path2);

        //  💡 부모 경로
        Path path5 = path4.getParent();

        //  💡 한 경로에서 다른 경로로의 상대 경로
        Path path6 = path4.relativize(path2);

        //  💡 끝단 파일/폴더명
        Path path7 = path4.getFileName();

        //  💡 서브경로
        Path path8 = path4.subpath(3, 5);

        System.out.println(Files.exists(path2));

        //  💡 Path 기준으로 파일 생성
        try {
            Files.createFile(path2);
        } catch (IOException e) {
            //  💡 파일이 이미 존재시 예외 던짐
            System.out.println("파일이 이미 있음");
        }

        System.out.println(Files.exists(path2));

        //  💡 Path 기준으로 폴더 생성
        try {
            Files.createDirectory(
                    Paths.get(CUR_PATH, "myFolder")
            );
        } catch (IOException e) {
            //  💡 폴더가 이미 존재시 예외 던짐
            System.out.println("폴더가 이미 있음");
        }

        //  ⭐️
        //  💡 중첩된 폴더 한 번애 생성
        try {
            Files.createDirectories(
                    path4.getParent()
            );
            //  폴더들을 미리 만들고 그곳에 파일 생성
            Files.createFile(path4);
        } catch (IOException e) {
            System.out.println("이미 있음");
        }

        //  ⭐️ Files를 사용하여 파일 쓰기
        //  - 용량이 크지 않은 데이터를 쓰는데 적합
        //  - 덧붙이는 작업이나 대용량 작업은 이후 강에서

        //  💡 write : 파일에 주어진 바이트 배열을 씀
        //  - 이미 내용이 있을 경우 덮어씀
        try {
            //  💡 getBytes : 문자열로부터, 주어진 인코딩 형식에 따라 바이트 배열로 반환
            Files.write(path4, "안녕하세요".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
