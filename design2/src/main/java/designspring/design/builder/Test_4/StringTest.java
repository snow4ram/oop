package designspring.design.builder.Test_4;

public class StringTest {
    public static void main(String[] args) {
        String s = new String("Hello World!");

        String ss = "Hello World!";

        char c = s.charAt(4);
        System.out.println(c);

        String s1 = "동해물과 백두산이";
        String s2 = "동해물과 백두산이";
        boolean r = s1 == s2;
        System.out.println(r);

        String s3 = new String("동해물과 백두산이");
        r = s1 == s3;
        System.out.println(r);

        r = s3.equals(s1);
        System.out.println(r);


        s1 = new String("I love you");
        s2 = new String("I Love you");
        r = s1.equals(s2);
        System.out.println(r); // 결과 : false
        r = s1.equalsIgnoreCase(s2);
        System.out.println(r); // 결과 : true


        String proverb = "A barking dog";
        System.out.println(proverb.length());
        proverb.concat(" never Bites!");
        System.out.println(proverb);

        s1 = proverb.concat(" never Bites!");
        System.out.println(s1);


        s2 = proverb.replace("b","B");
        System.out.println(s2);


        s3 = proverb.substring(2, 3);
        System.out.println(s3);


        String s4 = proverb.toUpperCase();
        System.out.println(s4);



        // 문자열의 결합
        int x = 20;
        System.out.println("결과값은 " + x);

        System.out.println("100" + 20);

        System.out.println(100 + x);


        // 문자열을 수치값으로 변환
        s = "1234";
        Integer n = Integer.parseInt(s);
        System.out.println(n.getClass().getSimpleName());
        Double d = Double.parseDouble(s);
        System.out.println(d.getClass().getSimpleName());
        Float f = Float.parseFloat(s);
        System.out.println(f.getClass().getSimpleName());
        Long l = Long.parseLong(s);
        System.out.println(l.getClass().getSimpleName());
    }
}
