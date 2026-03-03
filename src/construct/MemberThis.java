package construct;

public class MemberThis {
	String nameField;

	void initMemer(String nameParameter) {
		// 변수명이 다를 경우 this를 넣을 필요가 없다. 변수명이 동일 할 경우 scope의 위치 때문에 this를 생략하지 않는 것임
		nameField = nameParameter;
	}
}
