package quiz01;


public class Quiz13 {
	public static void main(String[] args) {

		// 문제 2
//		1. 양수를 입력 받아, 입력 받은 수 크기의 배열을 생성하세요.
//		2. 배열에 1~입력받은 수 까지 차례대로 값을 넣으세요

//		Scanner scan = new Scanner(System.in);
//
//		System.out.print("수를 입력하세요 >");
//		int size = scan.nextInt();
//		int[] arr = new int[size]; // 배열 생성
//
//		int i = 0;
//		while (i < arr.length) {
//
//			arr[i] = i;
//
//			i++;
//
//		}
//
//		System.out.println(Arrays.toString(arr));

		// 결과값

		// 문제1. 내 답변이아닌 일상 참고해서..
//		int[] arrA = {1000,500,100,50,10}; // 동전
//		int money = 17520; // 금액
//		
//		System.out.println("금액 : " + money + "원");
//		int i = 0;
//		
//		while( i < arrA.length) {
//			System.out.println( arr[i] + "원 " + money / arrA[i]);
//			money %= arrA[i];
//			
//			i++;
//		}
//		

		// 문제 1 선생님
		int[] arr = { 1000, 500, 100, 50, 10 }; // 동전
		int money = 17520; // 금액

		int i = 0;
		while (i < arr.length) {

			System.out.println(arr[i] + "원 :" + (money / arr[i]));
			money %= arr[i]; // money = money % arr[i] money 변화를 위하여 나머지를대입

			i++;
		}

	}
}
