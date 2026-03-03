package access;

public class SpeakerMain {

	public static void main(String[] args) {
		Speaker speaker = new Speaker(90);
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		speaker.volumeUp();

//		//필드에 직접 접근 -> 이렇게 되면 개발 조건이랑 안맞아서 문제가 생김
//		System.out.println("volume 필드에 직접 접근");
//		//java: volume has private access in access.Speaker
//		speaker.volume = 200;
//		speaker.showVolume();
	}
}
