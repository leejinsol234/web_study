package exam02;

import org.junit.jupiter.api.*;

public class TDDTest {

    @BeforeAll
    static void beforeAll(){
        System.out.println("beforeAll");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }

    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void Test2(){
        System.out.println("test2");
    }


}
