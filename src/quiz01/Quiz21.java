package quiz01;

import java.util.Arrays;

public class Quiz21 {
	public static void main(String[] args) {

		// 5,23 비교해서 큰값이 뒤로 밀림
		// 선택은 제일작은수를 맨 앞으로 가져오는거 같고, 버블은 제일 큰 수가 맨 뒤로 가는 것 같네요.

		// 버블정렬 -
		int[] arr = { 5, 23, 1, 43, 100, 200, 40 };
		// 5, 1, 23, 43, 100, 40, 200 1화전이후 값 // 6 - 6번
		// 1, 5, 23, 43, 40, 100, 200 2회전 이후 값 // 5 - 5
		// 1, 5, 23, 40, 43, 100, 200 3회전 이후 값 // 4 - 4
		// 1, 5, 23, 40, 43, 100, 200 4회전 이후 값 // 3 - 3
		// 1, 5, 23, 40, 43, 100, 200 5회전 이후 값 // 2 - 2
		// 1, 5, 23, 40, 43, 100, 200 6회전 이후 값 // 1 - 1

		for (int i = arr.length - 1; i > 0; i--) { // 6,5,4,3,2,1,

			for (int j = 0; j < i; j++) {

//				System.out.println(i + "-" + j);

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

			System.out.println(Arrays.toString(arr));

		}

	}
}
