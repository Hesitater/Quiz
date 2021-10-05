package quiz01;

public class Quiz11 {
	public static void main(String[] args) {
		
		// 1. 1~100까지 정수중에 3의배수이거나, 4의배수일경우 가로로 출력
		// 2. 1~200까지 정수중 5의배수의 합.
		// 3. 1~200까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수
		// 4. 두 정수를 입력 받아서 두 정수 사이의 합을 구하자(같은 경우는 없다고 가정, 앞에 큰수 or 뒤에 큰수 상관없게)
		
		// 변수 설정하고 그다음 배수
		
		System.out.println("------------------문제 1--------------");
		int x = 1; // 제어변수 설정
		
		while(x <= 100) {
			
			if(x % 3 == 0) {
				System.out.println(x);
			} else if (x % 4 == 0) {
				System.out.println(x);
			}
			
			x++;
			
		}
		
		System.out.println("------------------문제 2--------------");
		int sum = 0;
		
		int y = 1;
		while( y <= 200) {
			if( y % 5 == 0 ) {
				sum += y;
			}
			y++;
		
		}
		
		System.out.println("5의배수의합의 개수 : " + sum);
		
		
		System.out.println("-----------------문제3----------------");
		
		int z = 1;
		int count = 0;
		
		while(z <= 200) {
			if( z % 4 == 0 && z % 8 !=0) {
				 count++;
			} 
			z++;
		}
		System.out.println("200까지 4의배수이고 8의배수아닌 수 몇개? " + count);
		
		
	}
}
