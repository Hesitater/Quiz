package quiz01;

public class Quiz17 {
	public static void main(String[] args) {

		// 구구단 1 x 1 = 1 2 x 1 = 2 3 x 1 = 3
		// 2 x 1 = 2 2 x 2 = 4 3 x 2 = 6 어런식..

		for (int i = 1; i <= 9; i += 3) {

			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + i * j);
				System.out.print("\t" + (i + 1) + " x " + j + " = " + (i + 1) * j);
				System.out.println("\t" + (i + 2) + " x " + j + " = " + (i + 2) * j);

			}
		}
		System.out.println("----------------------------------------------------");

		// 선생님 답변

		for (int i = 1; i <= 9; i += 3) {

			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = " + i * j + "\t");
				System.out.print((i + 1) + " x " + j + " = " + (i + 1) * j + "\t");
				System.out.print((i + 2) + " x " + j + " = " + (i + 2) * j);
				System.out.println();

//				System.out.printf("%d x %d = %d\t%d x %d =%d\t%d x %d = %d\n",i,j,i*j,i+1,j,(i+1)*j,i+2,j,(i+2)*j );                           
			}

			System.out.println();

		}

	}
}
