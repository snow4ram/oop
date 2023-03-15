package designspring.design.builder.Test_4;

import designspring.design.builder.Test_2.JavaTest;
import org.junit.jupiter.api.Test;


class JavaTest_1Test {

    @Test
    void run() {
        JavaTest t = new JavaTest(); // instantiation

        t.name = "HongGilDong";
        t.setName(t.name);

        // instance 마다 다른 객체나 매소드로 구현해야한다면 instance 로 구현해야한다
        // 그럴 필요가 없다면 static 으로 구현하기

        JavaTest.sayHello(); // static method 는 따로 instance 로 만들지 않아도 실행이 가능함
    }
}