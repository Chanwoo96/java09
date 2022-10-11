package 추상클래스;
//클래스로 만들 때 반드시 있어야하는 기능에 대한 조건을 명시
public interface MyAction {
	//abstract : 추상적인, 불완전한다라는 의미
	public abstract void click();// 처리하는 내용X(추상메서드)
	public abstract void dbclick();
	//public abstract 생략 가능
	//일반변수 사용불가능 공유목적의 변수만 가능
}
