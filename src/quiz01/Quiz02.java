package quiz01;

public class Quiz02 {

	public static void main(String[] args) {

		// 1. 1~100까지 랜덤한 수를 만들고 짝, 홀수를 판별

		int result = (int)(Math.random()*101);
		System.out.println(result);
		String ran= result % 2 == 0?  "2의배수입니다" : "2의배수가 아닙니다";
		System.out.println(ran);
		

		// 선생님 답변
		int r = (int)(Math.random() * 100) +1;
		System.out.println("랜덤값:" + r);
		System.out.println( r % 2 == 0 ? "짝수" : "홀수" );

		// 2. -5~5까지 랜덤한 수를 만들고 , 절대값으로만 출력해주세요

		// 내 답변
		int result2 = (int)(Math.random()*10 - 5);
		System.out.println(result2); // 비교값용
		
		if ( result2 >= 0) { 
			System.out.println(result2);
		} else {
			System.out.println(-result2);
		}

		// 선생님 답변
		int r2 = 5- (int)(Math.random()* 11) ;
		System.out.println("랜덤값:" + r2);
		System.out.println("절대값:" + ( r2 < 0 ? -r2 : r2)  );

		// 삼항 연산자 안에는 삼항ㅇㄴ산자가 들어갈 수 있습니다.
		// 3.
		// 1~150까지 랜덤한 수를 사과의 개수로 가정.
		// bucket은 사과를 담을 수 있는 양
		// ex 사과 148개? 버킷 15개 , 사과 150개? 버킷 15개
		// 사과 % 바구니 =0 은 몫 , 사과 % 바구니 = 나머지존재 , 몫+1 선생님조언

		int bucket = 10;
		int apple = (int) ((Math.random() * 150) + 1);
		System.out.println("사과의개수:" + apple);

		System.out.println("바구니의개수:" + (apple % bucket == 0 ? apple / bucket : apple / bucket + 1));

//		학생 질문
//		System.out.println( apple % 10 == 1 <= 9? (apple / bucket) + 1 : apple / bucket );
		// apple %10 == 0 은 True op false 떠서 숫자 9와 비교가안됨 true <= 9 비교가안되

	}
}
