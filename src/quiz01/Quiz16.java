package quiz01;

public class Quiz16 {
	public static void main(String[] args) {

		// * 가로, 세로를 입력받고, 반쪽피라미드, 반쪽역 피라미드 구조만들어보기

		// 개행

		int star = 5;

		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("-------------------------");

		// 피라미드 역구조

		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= star + 1 - i; j++) {

				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("---------------------------");

		// 진짜 피라미드..?

		for (int i = 1; i <= star; i++) {

			for (int j = 1; j <= star - i; j++) { // 공백출력
				System.out.print(" ");
			}

			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}

}
