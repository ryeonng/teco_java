package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {

	public static void main(String[] args) {

		// ctrl + shift + o --> import java.util.Scanner; 가져옴.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값을 입력 하세요. : ");
		int maxNumber =  sc.nextInt();
		// 1 <-- 고정값          10 --> 2 + 4 + 6 + 8 + 10;
		int sum = 0; 
		
		//  10 
		// 반복적인 패턴이 확인된다.
		// 1 2 3 4 5 6 7 8 9 10;
		
		
		// 1 2 3 4 5 6 7 8 9 10;	
		// i = i + 2 --> i += 2; (복합대입연산자 사용해 더 간단히)
		for(int i = 2 ; i <= maxNumber; i += 2 ) {
			//1 =  0  + 1;
			//3 =  1  + 2;
			//6 =  3  + 3;
			sum = sum + i;
			System.out.println("sum : " + sum + " \n");
		}		
		System.out.println("sum : " + sum); 
		
		
		
						
	} // end of main

} // end of class
