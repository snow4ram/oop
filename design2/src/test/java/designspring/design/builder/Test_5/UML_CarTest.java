package designspring.design.builder.Test_5;

import org.junit.jupiter.api.Test;

import java.util.Scanner;


class UML_CarTest {

    @Test
    void run_1() {
        String proverb = "A barking dog";    // new 연산자 생략
        String s1, s2, s3, s4;               // 참조 변수로서 메소드에서 반환된 참조값을 받음

        System.out.println("문자열의 길이 = " + proverb.length());

        s1 = proverb.concat(" never Bites!");        // 문자열 결합
        s2 = proverb.replace('B','b');    // 문자 교환
        s3 = proverb.substring(2,5);                    // 부분 문자열 추출
        s4 = proverb.toUpperCase();                     // 대문자로 변환

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    @Test
    void run_2() {
        String str;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("문자열을 입력하세요 > ");
            str = sc.next();
            if(str.equals("quit") == true){
                break;
            }
            if (str.matches("^www\\.(.+)")){
                System.out.println(str + " 은 'www'로 시작합니다,");
            } else{
                System.out.println(str + " 은 'www'로 시작하지 않습니다.");
            }
        }
    }

    @Test
    void run_3() {
        UML_Car myCar = new UML_Car();
        myCar.speedUp();

        System.out.println();
    }
}