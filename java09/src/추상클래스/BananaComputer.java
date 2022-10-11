package 추상클래스;

public class BananaComputer implements computer {

	@Override
	public void 계산하다() {
		System.out.println("정확하게 계산하다");

	}

	@Override
	public void 인터넷연결() {
		System.out.println("인터넷에 빠르게 연결하다.");
	}

}
