package designspring.design.builder.Test_1;

import org.junit.jupiter.api.Test;

class TestBox {

    @Test
    void run() {
        Box box = new Box();
        box.width = 20;
        box.length = 20;
        box.height = 30;
        System.out.println("상자의 가로, 세로, 높이는 " + box.width + ", " + box.length + ", " +
                box.height + "입니다.");
    }

    @Test
    void runCar() {
        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();

        System.out.println(myCar);
    }

    @Test
    void runMath() {
        Maths maths = new Maths();
        int sum;

        sum = maths.add(2, 3); // 2와 3은 인수로서 add()로 전달

        System.out.println("2와 3의 합은 " + sum);

        sum = maths.add(7, 8); // 7와 8은 인수로서 add()로 전달

        System.out.println("7와 8의 합은 " + sum);
    }

    @Test
    void runMyMath() {
        MyMath obj = new MyMath();
        System.out.println(obj.square(10)); // int형 메소드
        System.out.println(obj.square(3.14)); // double형 메소드
    }

    @Test
    void runTel_1() {
        Television_1 tv = new Television_1();   // 객체 생성
        // 객체의 맴버에 접근할 때는 맴버 연산자(.)를 사용한다
        tv.channel = 7;         // 인스턴스 변수 channel 값에 7을 넣기
        tv.volume = 9;          // 인스턴스 변수 volume 값에 9를 넣기
        tv.onOff = true;        // 인스턴스 변수 onOff 값에 true를 넣기
        System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다. ");
    }

    @Test
    void runTel_3() {
        Television_3 tv = new Television_3();   // 단, 인스턴스 맴버를 사용하기 위해 객체를 선언하는 것은 필수
        tv.channel = 7;
        tv.volume = 9;
        tv.onOff = true;
        System.out.println("텔레비전의 채널은 " + tv.channel + "이고, 볼륨은 " + tv.volume + "입니다.");
    }

    @Test
    void runTel_4() {
        Television_4 myTv = new Television_4();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;

        // yourTv 또한 Television_4_1 클래스의 객체를 가리킨다
        Television_4 yourTv = new Television_4();
        yourTv.channel = 9;
        yourTv.volume = 12;
        myTv.onOff = true;

        System.out.println("저의 텔레비전 채널은 " + myTv.channel + "이고, 볼륨은 " + myTv.volume + "입니다.");
        System.out.println("당신 텔레비전 채널은 " + yourTv.channel + "이고, 볼륨은 " + yourTv.volume + "입니다.");
    }

    @Test
    void runTel_5() {
        Television_5 myTv = new Television_5();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        myTv.print();

        Television_5 yourTv = new Television_5();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        yourTv.print();
    }

    @Test
    void runTel_6() {
        Television_6 myTv = new Television_6();
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;

        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
    }

    @Test
    void runTel_7() {
        Television_7 myTv = new Television_7();
        myTv.setChannel(11);
        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
    }


}