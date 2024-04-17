package basic.ch06;

import java.util.Scanner;

public class Practice {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        System.out.println("안녕하세요 " +sysprint() + "님!");
        System.out.println("입력한 수 의 제곱은 " + square()+ "입니다.");
        System.out.println("당신은 성인이 : " +ageCount());
        System.out.println("정수 입력  : ");

        int a =sc.nextInt();
        System.out.println("입력한 정수는 : " + signOfNumber(a));

        System.out.println("숫자 5개 입력하셈");
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("입력한것중 젤큰거는 : " +findMax(num));

    }

    static String sysprint(){

        System.out.println("이름 입력");
        String result = sc.next();
        return result;
    }

    static int square() {
        System.out.println("정수 하나 입력");
        int result = sc.nextInt();
        return result*result;

    }
    static boolean ageCount() {
        System.out.println("나이 입력하세요");
        int age = sc.nextInt();
        boolean result;
        if (age < 18) {
            result = false;
        }
        else {
            result = true;
        }
        return result;

    }
    static String signOfNumber(int num) {
        String result;
        if(num == 0) {
            result = "zero";
        }else if(num < 0) {
            result = "negative";
        }else {
            result = "positive";
        }
        return result;

    }

    static int findMax(int[] getNums) {
        int max = getNums[0];
        for (int i = 0; i < getNums.length; i++) {
            if(getNums[i] > max) {
                max = getNums[i];
            }
        }
        return max;

    }
}
