package access.b;

import access.a.AccessData;

public class AccessOuterMain {

	public static void main(String[] args) {
		AccessData data = new AccessData();

		//public 호출 가능 -> 어디서든
		data.publicField = 1;
		data.publicMethod();

//		// 다른 패키지 default 호출 가능 -> java: defaultField is not public in access.a.AccessData; cannot be accessed from outside package
//		data.defaultField = 2;

//		private 호출 불가 -> java: privateField has private access in access.a.AccessData
//		data.privateField = 3;

		data.innerAccess();
	}
}
