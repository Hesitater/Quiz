package quiz01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {

		// 1.문제 메뉴를 보여준 후, Scanner로 해당 메뉴를 입력 받으세요
		// 2. 없는 메뉴 라면" ~은 메뉴에 없습니다" 를 출력하세요.
		// 3. switch 구문을 이욯하세요

		/*
		 * 실행화면 예시 구입할 메뉴는? [수박, 사과, 멜론, 포도, 귤] >수박 수박의 가격은 2만원입니다.
		 * 
		 * >복숭아 복숭아는 메뉴에 없습니다. 다시 입력해주세요
		 */

		// 내 답변

//		System.out.println("구입할 메뉴는?");
//		System.out.println("수박, 사과, 멜론, 포도, 귤");
//
//		Scanner scan01 = new Scanner(System.in);
//		System.out.print(">");
//		String name01 = scan01.next();

//		문자열과 비교할수 있는 값이 들어아갸함

//		switch(scan01)  {
//		
//		case "수박":
//			System.out.println("수박의 가격은 2만원입니다");
//			break;
//		
//		case "사과":
//			System.out.println("사과의 가격은 3만원입니다");
//			break;
//			
//		case "멜론":
//			System.out.println("멜론의 가격은 4만원입니다");
//			break;
//			
//		case "포도":
//			System.out.println("포도의 가격은 5만원입니다");
//			break;
//			
//		case "귤":
//			System.out.println("귤의 가격은 6만원입니다");
//			break;
//			
//			default:
//				System.out.println(  + "는 없습니다");
//				break;

		// 선생님 답

		Scanner scan = new Scanner(System.in);

		System.out.println("구입할 메뉴는?");
		System.out.println("[수박,사과,멜론,포도,귤}\n>");
		String menu = scan.next();

		switch (menu) {

		case "수박":
			System.out.println("수박은 2만원");
			break;

		case "사과":
			System.out.println("사과는 3만원");
			break;

		case "멜론":
			System.out.println("멜론은 4만원");
			break;

		case "포도":
			System.out.println("포도는 5만원");
			break;

		case "귤":
			System.out.println("귤은 6만원");
			break;

		default:
			System.out.println(menu + "는 없습니다");
			break;
		}

		scan.close();

	}
}
