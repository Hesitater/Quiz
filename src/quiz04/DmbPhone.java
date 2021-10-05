package quiz04;

public class DmbPhone extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	
	// 부모클래스에서   color , model  있으니 안만들어도됨
	
	// 변수생성하고 초기화하고 생성자 작성함
	int  channel;
	
	DmbPhone(String pColor, String pModel, int pChannel) {
		
		color = pColor;
		model = pModel;
		channel = pChannel;
	}
	
	//  메인메서드 추가해야됨
	
	
	 void turnOnDmb() {    //기능: TV를 켭니다 출력
		 System.out.println("TV를 켭니다");
	 }
	
	 
	int changeChannel(int pChannel) {//기능: channel변수를 전달받은 변수로 변경후 출력
		channel = pChannel;
		return channel;
	}
	
	void turnOffDmb() { //기능: TV를 끕니다 출력
		System.out.println("Tv 끕니다");
	}
	
	void powerOff() {
		
	}
	
	
	
}
