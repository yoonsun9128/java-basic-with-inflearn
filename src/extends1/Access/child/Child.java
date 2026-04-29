package extends1.Access.child;

import extends1.Access.parent.Parent;

public class Child extends Parent {
	public void call() {
		publicValue = 1;
		//패키지는 다르지만 상속관계이다
		protectedValue = 1; //상속 관계 Or 같은 패키지
//		defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
//		privateValue = 1; //접근 조차 불가, 컴파일 오류

		publicMethod();
		protectedMethod();
//		defaultMethod(); 벨류와 같은 의미로 접근 불가
//		privateMethod();

		printParent();
	}
}
