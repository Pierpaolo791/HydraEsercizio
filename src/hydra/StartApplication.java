package hydra;

import hydra.test.MyTest;

public class StartApplication {

    public static void main(String[] args) {
        testSuite(); 
    }

    private static void testSuite() {
        MyTest tests = new MyTest(); 
        //tests.test01();
        tests.test02();
    }
    
}
