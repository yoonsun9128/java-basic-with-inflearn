package oop1;

public class MusicPlayerMain3 {
	public static void main(String[] args) {
		MusicPlayerData musicPlayerData = new MusicPlayerData();

		//음악 플레이어 켜기
		on(musicPlayerData);

		volumeUp(musicPlayerData);
		volumeUp(musicPlayerData);
		volumeDown(musicPlayerData);

		showStatus(musicPlayerData);

		off(musicPlayerData);
	}

	static void on(MusicPlayerData data) {
		data.isOn = true;
		System.out.println("음악 플레이어를 시작합니다");
	}
	static void off(MusicPlayerData data) {
		data.isOn = false;
		System.out.println("음악 플레이어를 종료");
	}

	static void volumeUp(MusicPlayerData data) {
		data.volume ++;
		System.out.println("볼륨 : " + data.volume);
	}
	static void volumeDown(MusicPlayerData data) {
		data.volume --;
		System.out.println("볼륨 : " + data.volume);
	}

	static void showStatus(MusicPlayerData data) {
		System.out.println("음악 플레이어 상태 확인");
		if (data.isOn) {
			System.out.println("음악 플레이어 상태 ON, 볼륨: " + data.volume);
		} else {
			System.out.println("음악 플레이어 상태 OFF");
		}
	}
}
