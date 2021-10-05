package quiz01;

import java.util.Arrays;

public class Quiz20 {
	public static void main(String[] args) {

		// 중첩반복문을 이요해서 정렬. 이게 가장 기본임...ㅡㅡ

		// 정렬종류 10가지정도 .. 기본 선택정려르, 가장느린 버블정렬, 가장 빠른 퀵정렬
		// 선택은 작은수를 앞으로 빼오면서 정렬이고, 버블은 큰수를 뒤로보내면서 정렬이죠
		//선택은 제일작은수를 맨 앞으로 가져오는거 같고, 버블은 제일 큰 수가 맨 뒤로 가는 것 같네요.


		//		Arrays.sort(arr); // 자동정렬,  일단 퀵정렬이란것만 알아두자
		
		
		
		int[] arr = { 5, 23, 1, 43, 100, 200, 40 }; // { 1,5,23, 40,43,100,200}

		for (int i = 0; i < arr.length-1; i++) {
//			System.out.print(i + " ");  출력 해봐서 확인 눈으로
			//
			for (int j = i+1; j < arr.length; j++) {
				// System.out.println(i + "-" + j); 출력해서 확인
				if ( arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;

				}

//				System.out.println( Arrays.toString(arr)); 확인용
			}

		}

		System.out.println(Arrays.toString(arr));
		
		
//		Arrays.sort(arr); // 자동정렬
//		System.out.println(Arrays.toString(arr));
		
		
	}
}
