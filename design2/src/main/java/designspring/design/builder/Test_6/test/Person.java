package designspring.design.builder.Test_6.test;

public class Person {

    private String name = "홍길동";
    private int myAge;

    private String dept = "컴정";
    protected String dept2 = "컴퓨터정보계열";

    public String getDept(){
        return dept;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return myAge;
    }

    public void setAge(int argAge){
        if(argAge >= 0 && argAge <= 150)
          this.myAge = argAge;
        System.out.println("나이의 범위는 0부터 150까지 입니다.");
    }

    private void test(){
        System.out.println(name);
    }
}
