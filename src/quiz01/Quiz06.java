package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {

		/*
		 * 정수를 3개 순서대로 입력받습니다. 가장 큰값, 중간값, 가장 작은값을 구해서 max, mid, min변수에 저장하고 출력하면 됩니다. 단
		 * 값이 같은 경우에는 없다고 가정한다.
		 */

		// 내 답변 ..나는 컴파일 조차 안됨 ㅡ,.ㅡ.... 그나마..
//		Scanner scan01 = new Scanner(System.in);
//		System.out.println(">");
//		int x = scan01.nextInt();
//		System.out.println(">");
//		int y = scan01.nextInt();
//		System.out.println(">");
//		int z = scan01.nextInt();
//
//		int max = 0, mid = 0, min = 0;
//
//		if (x > y && y > z) {
//			max = x;
//			mid = y;
//			min = z;
//		} else if (x > y & z > y) {
//			max = x;
//			mid = z;
//			min = y;
//		} else if (y > x && x > z) {
//			max = y;
//			mid = x;
//			min = z;
//		} else if (y > z && z > x) {
//			max = y;
//			mid = z;
//			min = x;
//		} else if (z > x && x > y) {
//			max = z;
//			mid = x;
//			min = y;
//		} else if (z > y && y > x) {
//			max = z;
//			mid = y;
//			min = x;
//		}
//		
//		System.out.println("max:" + max + ", mid:" + mid + ", min:" + min);

		// 선생님 답변

		Scanner scan = new Scanner(System.in);

		System.out.println(">");
		int num1 = scan.nextInt();
		System.out.println(">");
		int num2 = scan.nextInt();
		System.out.println(">");
		int num3 = scan.nextInt();

		int max = 0, mid = 0, min = 0;

		if (num1 > num2 && num1 > num3) { // num1이 가장 큰 경우

			max = num1; // 가장 큰값 설정

			if (num2 > num3) { // num2 중간값
				mid = num2;
				min = num3;
			} else { // num3이 중간값
				mid = num3;
				min = num2;
			}

		} else if (num2 > num1 && num2 > num3) { // num2 가 가장 큰경우

			max = num2;
			if (num1 > num3) {
				mid = num1;
				min = num3;

			} else {
				mid = num3;
				min = num1;

			}

		} else { // num3이 가장 큰경우
			max = num3;

			if (num2 > num1) {
				mid = num2;
				min = num1;

			} else {
				mid = num1;
				min = num2;

			}

		}

		System.out.println("max:" + max + ", mid:" + mid + ", min:" + min);

		scan.close();
		
	}
}
