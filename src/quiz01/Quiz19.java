package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {

		/*
		 * 문제 1. 정수를 입력 받으세요 2. 2중for문을 이용하여 입력 받은 수 까지 소수들의 합을 구하세요 3. 힌트 ) 입력 받은 수까지
		 * 반복 , 내부 for문에서 외;부for문의 수까지 반복
		 * 
		 * 
		 */

		// 소수인지 판별하는데 for문하나, 1부터 입력받은 값까지 순회하는데 for문하나 써서 2중 for문 써야할거같아요
		//

		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력>");
		int num = scan.nextInt();

		int sum = 0; // 합을 누적할 변수

		for (int i = 1; i <= num; i++) {
			
			int count = 0; // 약수의 개수를 판별 (값을 판별하기전에 카운트값 초기화)
			
			// i 값을 판별
			for (int j = 1; j <= i; j++) {
//				System.out.println(i + "-" + j);  확인용 해보기

				if (i % j == 0) {
					count++;

				}
			}

			if (count == 2) { // i의 약수의 개수가 2개 이므로 i는 소수이다.
				sum += i;

			}

		}
		
		System.out.println("1에서" + num + "까지의합:" + sum );
		
		
		
		
		
		
		
		
		
	}
}
