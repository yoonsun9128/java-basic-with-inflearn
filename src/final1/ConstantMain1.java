package final1;

public class ConstantMain1 {
	public static void main(String[] args) {
//		System.out.println("프로그램 최대 참여자 수" + 1000);
		System.out.println("프로그램 최대 참여자 수" + Constant.MAX_USERS);
		int currentUserCount = 999;
		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++);
	}

	private static void process(int currentUserCount) {
		System.out.println("참여자 수: " + currentUserCount);
		//magic number (나를 놀라게 하는 숫자 : 즉 너 뭔데)
//		if (currentUserCount > 1000) {
		if (currentUserCount > Constant.MAX_USERS) {
			System.out.println("대기자로 등록합니다.");
		} else {
			System.out.println("게임에 참여합니다.");
		}
	}

	// 참여자 수에 대한 상수 필요!!!! 만일 나중에 디버깅 할때 매번 값을 직접 변경해줘야한다는 번거로움 발생
}
