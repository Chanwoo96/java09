package 추상클래스;

public class 액션처리클래스 implements MyAction {
	
	@Override
	public void click() {
		System.out.println("클릭하면 인터넷으로 연결하는 처리...구현..");
	}

	@Override
	public void dbclick() {
		System.out.println("클릭하면 화면을 닫는 처리");
	}

}
