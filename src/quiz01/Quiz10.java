package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {

//		Scanner scan01 = new Scanner(System.in);
//		System.out.print("구구단 단수를 입력하세요: ");
//		int dans = scan01.nextInt(); // 정수
//		
//		
//		System.out.println("랜덤 구구단 " +  dans + "단");
//		System.out.println("-------------------");
//		
//		int x = 1 ; // 제어변수 : 반복문의 횟수를 제어할 변수
//		int sum = 0;
//		
//		while( x <= 9) {
//			
//			System.out.println(dans + " x " + x + " = " + (dans * x) );
//			
//			x++;
//			
//		}

		// 선생님 답변

		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요: ");
		int dan = scan.nextInt();

		System.out.println("랜덤 구구단 " + dan + "단");
		System.out.println("-------------------");

		int a = 1;
		while (a <= 9) {

			System.out.println(dan + " x " + a + " = " + dan * a);

			a++;
		}

		scan.close();

	}
}
