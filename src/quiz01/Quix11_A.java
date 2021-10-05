package quiz01;

public class Quix11_A {
	public static void main(String[] args) {

		// 1. 1~100까지 정수중에 3의배수이거나, 4의배수일경우 가로로 출력

		// 2. 1~200까지 정수중 5의배수의 합.

		// 3. 1~200까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수

		// 4. 두 정수를 입력 받아서 두 정수 사이의 합을 구하자(같은 경우는 없다고 가정, 앞에 큰수 or 뒤에 큰수 상관없게)
		// 4번힌트 큰수 , 작은수를 먼저 구별 -> 반복분

		// 1. 1~100까지 정수중에 3의배수이거나, 4의배수일경우 가로로 출력
		System.out.println("---------------문제1-----------------");

		int a = 1;
		while (a <= 100) {
			if (a % 3 == 0 || a % 4 == 0)
				System.out.print(a + " ");

			a++;
		}
		System.out.println(); // 개행

		// 2. 1~200까지 정수중 5의배수의 합.
		System.out.println("---------------문제2-----------------");

		int sum = 0;

		int x = 1;

		while (x <= 200) {

			if (x % 5 == 0) {
				sum += x;
			}

			x++;
		}
		System.out.println("200까지의 5의 배수의 합:" + sum);

		// 3. 1~200까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수
		System.out.println("---------------문제2-----------------");

		int i = 1;
		int count = 0;

		while (i <= 200) {
			if (i % 4 == 0 && i % 8 != 0) {

				count++;
			}

			i++;

		}

		System.out.println("200까지의 정수중 4의배수 이면서 8의 배수 아닌것 :" + count);

	}
}
