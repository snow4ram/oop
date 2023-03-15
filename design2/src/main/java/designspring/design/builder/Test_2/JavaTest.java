package designspring.design.builder.Test_2;

public class JavaTest {
    public String name;

    public static void sayHello() {
    }

    String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    double square(double df){
        test();
        return df * df;
    }
    int square(int num){
        return num * num;
    }

    void test(){
    }
}
