package quiz01;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {

// 문제  	1. 양의 정수를 입력 받아 짝수 라면 "x는 짝수 입니다", 홀수 라면 "x는 홀수 입니다"를 출력하세요.
//		2. 0이라면 "0입니다"
//		3. 음수 라면  "음수 입니다"를 출력하세요

		// 내 답변 ex) -4 일때 -4는짝수입니다. 라고 나옴
		// else if 조건 순서 고려 선생님의 의견 0과 음수를 먼저했으면 나머지가 양수 잖아
		// 내방식때로 했으면 a > 0 && a % 2 ==0 이후 a > 00 && a % 1 == 1 이여야함

//		Scanner scan01 = new Scanner(System.in);
//		
//		System.out.println("정수를 입력하세요.");
//		int a = scan01.nextInt();
//		
//		if( a > 0 && a % 2  == 0) {
//			System.out.println( a + "는 짝수 입니다.");
//		} else if( a % 2 == 1) {
//			System.out.println( a + "는 홀수 입니다.");
//		} else if (a == 0) {
//			System.out.println( "입력한 정수는" + a + "입니다");
//		} else 
//			System.out.println( a + "는 음의 정수 입니다.");
//		
//		scan01.close();

		// 선생님 의견 else if 는 0인경우 음수인 경우 먼저 하는게?
		// 짝수 홀수 구하는 보편적 a % 2 == 0 , a % 1 == 1 음수를 나눈 몫도 포함이라 a의 양수 음수 여부 판단도해야할듯.

		Scanner scan = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();

		if (num >= 0) { // 양수

			if (num == 0) { // 0
				System.out.println("0입니다");
			} else if (num % 2 == 0) { // 짝수
				System.out.println(num + "은 짝수 입니다");
			} else { // 홀수
				System.out.println(num + "은 홀수 입니다");
			}

		} else { // 음수
			System.out.println(num + "은 음수입니다");

		}

		scan.close();

	}
}
