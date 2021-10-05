package quiz01;

public class Quiz08 {
	public static void main(String[] args) {

		/*
		 * Math.random()을 이용해서 0~3까지 랜덤수를 발생시키고, 해당 인덱스를 배열에 적용해서, 선택된 값이 한국어, 영어, 중국어,
		 * 외계어 인지 구별하면 됩니다.
		 * 
		 * 
		 */
		// 내 답변 뭔가 개념없이 복붙한 느낌임 생각하고 해봐야함

//		String[] arr01 = { "안녕하세요", "hi", "니 취팔로마", "#$%" };
//		int result01 = (int) (Math.random() * 4);
//		System.out.println(result01);
//
//		// switch(문자열) 이면 case 문자열: / switch(
//		switch (result01) {
//		case 0:
//			System.out.println("한국어: " + arr01[0]);
//			break;
//
//		case 1:
//			System.out.println("영어: " + arr01[1]);
//			break;
//
//		case 2:
//			System.out.println("중국어: " + arr01[2]);
//			break;
//
//		case 3:
//			System.out.println("외계어: " + arr01[3]);
//			break;
//
//		default:
//			System.out.println("이거 나오면 오류인거임");
//			break;
//		}

		// 선생님 답변

		String[] arr = { "안녕하세요", "hi", "니 취팔로마", "#$%" };

//		int index = (int)(Math.random() * 4);
		int index = (int) (Math.random() * arr.length);
		System.out.println(index);
		System.out.println("선택된 단어:" + arr[index]);

		switch (arr[index]) {
		case "안녕하세요":
			System.out.println("한국어입니다");
			break;

		case "hi":
			System.out.println("영어입니다");
			break;

		case "니 취팔로마":
			System.out.println("중국어입니다");
			break;

		case "#$%":
			System.out.println("외계어 입니다");
			break;

		default:
			System.out.println("이거 나오면 내가 틀린거야");
			break;
		}

//    swithch(index) 로 했을 경우 case가 숫자.
//		switch (index) {
//		case 0:
//			System.out.println("한국어입니다");
//			break;
//			
//		case 1:
//			System.out.println("영어입니다");
//			break;
//			
//		case 2:
//			System.out.println("중국어입니다");
//			break;
//			
//		case 3:
//			System.out.println("외계어 입니다");
//			break;
//
//		default:
//			System.out.println("이거 나오면 내가 틀린거야");
//			break;
//		}

	}
}
