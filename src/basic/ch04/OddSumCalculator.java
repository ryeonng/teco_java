package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {
 // 연습문제2
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력 하세요. : ");
		int maxNumber =  sc.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= maxNumber; i += 2 ) {
			sum = sum + i;
			
		}
		System.out.println("sum : " + sum + " \n");
		
	} // end of main

} // end of class
