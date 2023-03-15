package designspring.design.builder.Test_2;

import org.junit.jupiter.api.Test;


class JavaTestTest {
    @Test
    void run() {
        JavaTest t1 = new JavaTest();
        t1.setName("HongGilDong");
        System.out.println(t1.getName());
    }

}