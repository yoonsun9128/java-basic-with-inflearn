package oop1;

public class MusicPlayerMain2 {
	public static void main(String[] args) {
		MusicPlayerData musicPlayerData = new MusicPlayerData();

		//음악 플레이어 켜기
		musicPlayerData.isOn = true;
		System.out.println("음악 플레이어를 시작합니다");

		musicPlayerData.volume ++;
		System.out.println("볼륨 : " + musicPlayerData.volume);

		musicPlayerData.volume ++;
		System.out.println("볼륨 : " + musicPlayerData.volume);

		musicPlayerData.volume --;
		System.out.println("볼륨 : " + musicPlayerData.volume);

		System.out.println("음악 플레이어 상태 확인");
		if (musicPlayerData.isOn) {
			System.out.println("음악 플레이어 상태 ON, 볼륨: " + musicPlayerData.volume);
		} else {
			System.out.println("음악 플레이어 상태 OFF");
		}

		musicPlayerData.isOn = false;
		System.out.println("음악 플레이어 종료");
	}
}
