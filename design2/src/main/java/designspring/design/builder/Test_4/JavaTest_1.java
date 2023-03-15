package designspring.design.builder.Test_4;

public class JavaTest_1 {
    // instance variable
    private String name;

    // instance method
    String getName(){    // 맴버 매서드
        return name;
    }

    // static method
    // instance 로 생성하지 않아도 접근이 가능한 매소드
    static void sayHello(){
        System.out.println("Hiiiiiii");
    }

    // instance method
    void setName(String name){
        // 맴버 메서드의 매개변수와 맴버 변수와 이름이 같은 경우, 맴버 변수의 우선순위가 높음
        // 따라서 this 연산자를 사용한다
        // name = name;
        this.name = name;
    }

}
