package quiz01;

public class Quiz14 {
	public static void main(String[] args) {

		// 1. 랜덤수 2~9랜덤 정수를 만들고, 구구단 출력

		int ran = (int) (Math.random() * 8) + 2;
		for (int i = 1; i <= 9; i++) {
//			System.out.println(ran + " X " + i + " = " + ran*i);
//			출력 printf 문 이용한거 알아두자 %d 정수 ,%f 실수, %s 문자열 
			System.out.printf("%d x %d = %d  \n", ran, i, ran * i);
		}

		// 2. 50~100까지 두수 사이의 합

		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum += i;

		}
		System.out.println("50 ~ 100까지합 " + sum);

		// 3. A~Z까지 문자를 가로로 출력 (A=65 , Z= 90)
		for (char c = 'A'; c <= 90; c++) { // 숫자나 영어로가능 알파벳이 숫자값을 가지고 있으니깐

			System.out.print(c + " ");
		}
		System.out.println("\n");

		// 4. 200까지 정수중의 if문을 사용하지 않고 짝수만 출력.

		for (int i = 2; i <= 200; i += 2) {
			System.out.print(i + " ");

		}

	}
}
