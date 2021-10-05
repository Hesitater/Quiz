package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {

		// 문제
//		1.정수 2개를 입력 받으세요
//		2.두수를 비교해서 "x 가 큰수 입니다" 를 출력 , 같은 수라면 "같은 수 입니다" 를 출력
//		정답 정수 두개를 입력하세요
//		>10
//		>10
//		같은수 입니다.
//		
//		    정수 두개를 입력하세요
//		   >10
//		   >3
//		    10이 큰수입니다.

		// 내 대답
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		int x = scan.nextInt();

		System.out.print(">");
		int y = scan.nextInt();

		if (x == y) {
			System.out.println("같은수 입니다");
		} else if (x > y) {
			System.out.println(x + "이 큰수입니다");
		}
		
		scan.close();
		
		
	}
}
