package access;

public class Speaker {
	//private을 추가해서 밖에서 직접 접근이 불가능하게 설정
	private int volume;

	Speaker(int volume) {
		//초기 볼류값을 받는 조건으로 함
		this.volume = volume;
	}

	void volumeUp() {
		if (volume >= 100) {
			System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
		} else {
			volume += 10;
			System.out.println("음량을 10 증가합니다.");
		}
	}

	void volumeDown() {
		volume -= 10;
		System.out.println("volumeDown 호출");
	}

	void showVolume() {
		System.out.println("현자 볼륨 : "+ volume);
	}
}
