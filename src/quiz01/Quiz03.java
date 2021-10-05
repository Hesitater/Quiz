package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {

		// 문제
//        1. 키(double)와 나이(int)를 입력 받으세요
//		  2. 키가 140 이상이고, 나이가 8세 이상이라면 "놀이기구 탑승가능" 아니라면, "놀이기구 탑승불가" 를 출력

		// 내 답변
//		Scanner scan1 = new Scanner(System.in);
//
//		System.out.println("키와 나이를 입력하세요.");
//
//		System.out.print("키:");
//		double cm1 = scan1.nextDouble();
//
//		System.out.print("나이:");
//		int age1 = scan1.nextInt();
//
//		System.out.println("==========================");
//
//		scan1.close();
//
//		if (cm1 >= 140 & age1 >= 8) {
//			System.out.println("놀이기구 탑승이 가능합니다.");
//		} else {
//			System.out.println("놀이기구 탑승이 불가능합니다.");
//		}

		// 선생님 답변
		Scanner scan = new Scanner(System.in);

		System.out.println("키와 나이를 입력하세요");
		System.out.println("키>");
		double cm = scan.nextDouble();

		System.out.println("나이>");
		int age = scan.nextInt();

		if (cm >= 140 && age >= 8) { // 보편적으로 && 많이씀
			System.out.println("놀이기구 사용이 가능합니다");
		} else {
			System.out.println("놀이기구 사용이 불가능합니다");
		}

		scan.close();

	}
}
