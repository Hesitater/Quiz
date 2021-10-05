package quiz01;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {

		/*
		 * 가로,세로를 입력받아서 직사각형을 출력합니다. 단 , 윤곽만 출력하면 됩니다.
		 * 
		 * 먼저 사각형을 만들고, 첫행, 마지막행 , 첫열, 마지막열에만 *출력 나머지는 공백
		 */

		// 참조답변
//		Scanner scan01 = new Scanner(System.in);
//		
//		System.out.print("가로>");
//		int x = scan01.nextInt();
//		System.out.print("세로>");
//		int y = scan01.nextInt();
//		
//		for(int i =1; i <= x; i++) {
//			for(int j = 1; j <= y; j++) {
//				
//				if( i == 1 || j ==1 || i == x || j == y ) {
//						System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//				
//			}
//				System.out.println();
//		}

		// 선생님 답변

		Scanner scan = new Scanner(System.in);
		System.out.print("가로값");
		int w = scan.nextInt();
		System.out.print("세로값");
		int h = scan.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {

				if (i == 1 || i == h) { // 첫행과 마지막행
					System.out.print("*");
				} else { // 나머지행
					if (j == 1 || j == w) { // c 첫열과 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}

			System.out.println();

		}
		scan.close();
		
	}

}
