package poly.ex.pay1;

public class PayService {
	public void processPay(String option, int amount) {
		boolean result = false;
		System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

		Pay[] pays = {new KakaoPay(), new NaverPay()};
		for(Pay pay : pays) {
			if (option == pay.getName()) {
				result = pay.pay(amount);
			}
		}

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제 수단이 없습니다.");
			System.out.println("결제가 실패했습니다.");
		}
	}

	public void processPay2(String option, int amount) {
		System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
		Pay pay = PayStore.findPay(option);
		boolean result = pay.pay(amount);

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}
}
