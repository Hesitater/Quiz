package quiz08;

public class MainClass {
	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("떳다떳다 비행기");
		
		ap.takeOff();
		ap.fly(); 	// 오버라이딩 된 메서드
		ap.flyMode = 1;
		ap.fly();
		ap.land(); //물ㄹ 받은
		System.out.println("이름: " +ap.info() );
		
		
		
	}
}
