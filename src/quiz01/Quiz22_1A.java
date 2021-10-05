package quiz01;

import java.util.Scanner;

public class Quiz22_1A {
	public static void main(String[] args) {

		// 선생님 답변.. Quiz22_1에서 할때는 내가 질문을 잘못 인식하여 랜덤수 -100 ~ 100으로함

		Scanner scan = new Scanner(System.in);

		int okCount = 0;
		int noCount = 0;

		while (true) {

			int num1 = (int) (Math.random() * 100) + 1;
			int num2 = (int) (Math.random() * 100) + 1;
			int oper = (int) (Math.random() * 2); // 0 or 1

			System.out.println("--------------------------------");
			System.out.println(num1 + (oper == 1 ? " + " : " - ") + num2 + " = ?"); // 삼항연산자이용
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print(">");

			int answer = scan.nextInt();
			int result = (oper == 1 ? num1 + num2 : num1 - num2);
			if (answer == 0 && num1 + num2 != 0) {
				System.out.println("프로그램을 종료합니다");
				break; // 그만 혹은 아래 if문에서 else if로 answer == 0
			}

			// else if 로 0 집어넣어 break; 하거나
			if (answer == result) {
				System.out.println("정답입니다.");
				okCount++;
			} else {
				System.out.println("오답입니다.");
				noCount++;
			}

		}

		System.out.println("정답: " + okCount);
		System.out.println("오답 :" + noCount);

		scan.close();

	}
}
