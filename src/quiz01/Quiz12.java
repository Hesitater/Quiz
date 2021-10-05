package quiz01;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {

		// 정수입력 하나씩 하다가 0은 입력했을시 위에 입력해놓은 정수들의 합이 나온다

		Scanner scan = new Scanner(System.in);

		int sum = 0; // 합계변수
		int a = 1;

		while (a != 0) {

			System.out.print(">");
			a = scan.nextInt();
			sum += a;

		}

		System.out.println("총합:" + sum);

			scan.close();
			
	}

}
