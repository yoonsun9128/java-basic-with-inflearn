package pack;

import pack.a.User;

public class PackageMain3 {
	public static void main(String[] args) {
		Data data = new Data();

		User user = new User();
		pack.b.User user2 = new pack.b.User();
		// 이름이 같을 경우 하나만 import가 가능하고 다른 하나는 각각의 다 루트를 적어줘야 한다.
	}
}
