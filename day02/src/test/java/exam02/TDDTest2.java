package exam02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;

public class TDDTest2 {
    @TempDir
    File file;

    @Test
    void test1(){
        System.out.println(file.getAbsolutePath()); //임시 파일 경로 확인
        //C:\Users\ADMINI~1\AppData\Local\Temp\junit10249698837957612726
    }

    @Test
    void test2(@TempDir File file2){
        System.out.println(file2.getAbsolutePath());
    }

    @Test
    @Timeout(2) //기본값은 초 단위, 단위는 변경할 수 있음.
    void test3(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
