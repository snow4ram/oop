package designspring.design.builder.Test_6.test;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void run_1() {
        Person p = new Person();
        p.setAge(15);
        System.out.println(p.getAge());

        System.out.println(p.getName());
        System.out.println(p.getDept());
        String d = p.dept2;
        System.out.println(d);

    }

    @Test
    void run_2() {
        Person p = new Person();
        p.setAge(15);
        System.out.println(p.getAge());
    }
}