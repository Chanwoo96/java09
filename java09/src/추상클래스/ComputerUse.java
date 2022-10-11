package 추상클래스;

public class ComputerUse {
public static void main(String[] args) {
	AppleComputer apple = new AppleComputer();
	BananaComputer banana = new BananaComputer();
	
	apple.계산하다();
	apple.인터넷연결();
	banana.계산하다();	
	banana.인터넷연결();
}
}
