package quiz01;

import java.util.Arrays;

public class Quiz15 {
	public static void main(String[] args) {

		// 숫자를 바꿔 보자

//		int x = 50;
//		int y = 100;
//		
//		int temp = y;
//		y = x;
//		x = temp;
//		
//		System.out.println(x);
//		System.out.println(y);

		// 아래 배열에서 절대 중복되지 않는 값을 3개 추출해서 새로운 배열을 만드는 과정.
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 1. 랜덤수를 생성하고 랜덤index번째 값과 위치를 변경.

		// 2. 0~2번째 까지의 값을 3인 배열에 담아주면 됩니다.

		for (int i = 0; i < arr.length; i++) {

			int ran = (int) (Math.random() * arr.length);// 0~8
//			System.out.println(ran);  확인용

//			int temp = arr[i] = arr[ran] = temp 이렇게 생각해봐

			int temp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = temp;

//			System.out.println(Arrays.toString(arr)); //랜덤값 눈으로 보기
		}

		int[] newArr = new int[3];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];

		}

		System.out.println(Arrays.toString(newArr));

	}
}
