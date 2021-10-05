package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {

		// 간단한 사칙 연산이 되는 간략한 프로그램
//		문제 	1. 메뉴를 보여준 후, Scanner		

//		Scanner scan01 = new Scanner(System.in);
//
//		System.out.print("정수1 > ");
//		int num01 = scan01.nextInt();
//
//		System.out.print("연산을 선택하세요[+, -, * , /] >");
//		String str01 = scan01.next();
//
//		System.out.print("정수2> ");
//		int num02 = scan01.nextInt();
//
//
//		switch (str01) {
//		case "+":
//			int result001 = num01 + num02;
//			System.out.println("두수의 덧셈은 : " + result001);
//			break;
//
//		case "-":
//			int result002 = num01 - num02;
//			System.out.println("두수의 뺄셈은 : " + result002);
//			break;
//
//		case "*":
//			int result003 = num01 * num02;
//			System.out.println("두수의 곱셈은 : " + result003);
//			break;
//
//		case "/":
//			int result004 = num01 / num02;
//			System.out.println("두수의 나눗셈은 : " + result004);
//			break;
//
//		default:
//			System.out.println("사칙연산을 제대로 입력하세요");
//			break;
//		}
//		scan01.close();

		// 선생님 답변

		Scanner scan = new Scanner(System.in);

		System.out.print("정수1>");
		int n1 = scan.nextInt();

		System.out.print("연산을 선택하세요[+, -, * , /] >");
		String oper = scan.next();

		System.out.print("정수2> ");
		int n2 = scan.nextInt();

		switch (oper) {
		case "+":
			System.out.println("두수의 덧셈은:" + (n1 + n2) );
			break;

		case "-":
			System.out.println("두수의 뺄셈은:" + (n1 - n2) );
			break;

		case "*":
			System.out.println("두수의 곱셈은:" + (n1 * n2) );
			break;

		case "/":
			System.out.println("두수의 나눗셈은:" + (n1 / n2) );
			break;

		default:
			System.out.println("사칙연산 기호를 입력해주세요.");
			System.out.println("[+, -, * , /]");

		}

		scan.close();

	}

}
