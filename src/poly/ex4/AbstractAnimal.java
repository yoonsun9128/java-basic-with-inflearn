package poly.ex4;

//순수 추상 클래스
public abstract class AbstractAnimal {

	public abstract void sound();

	public abstract void move();
}

/*
* 순수 추상 클래스는 부모의 기능을 물려 받는것이 아니라
* 자식 객체는 규격을 지켜서 똑같이 구현되어야 한다는 느낌
*
* 사실 자바에는 순수 추상 클래스라는 개념?단어가 존재? 많이 사용하지 않는다고 해야하나? 이걸 조금더 편하게 사용하는게 인터페이스라는 개념이다.
* */