package quiz10;

public class Computer {
	
	//문제
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;  //키보드
	private Monitor monitor;  //모니터
	private Mouse mouse;	 // 마우스
	
	
	
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() { //생성 + 변수 클래스 초기화
		this.key = new KeyBoard();
		this.monitor = new Monitor();
		this.mouse = new Mouse();
	}

	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		key.info();   //this.key.info();
		monitor.info();
		mouse.info();
	}
	
	
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요

	public KeyBoard getKey() {
		return key;
	}
	
	public void setKey(KeyBoard key) {
		this.key = key;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	
}
