package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력할 주문의 개수를 입력하세요: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		ProductOrder[] orders = new ProductOrder[n];

		for (int i = 0; i< orders.length; i++) {
			System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
			System.out.print("상품명: ");
			String productName = scanner.nextLine();

			System.out.print("가격: ");
			int price = scanner.nextInt();

			System.out.print("수량: ");
			int quantity = scanner.nextInt();
			scanner.nextLine();

			orders[i] = createOrder(productName, price, quantity);
		}

//		ProductOrder[] orders = {potatoChip, bananaChip, appleChip};

		printOrder(orders);

		int totalAmount = getTotalAmount(orders);
		System.out.println("total =" + totalAmount);
	}

	static ProductOrder createOrder (String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}

	static void printOrder(ProductOrder[] orders) {
		for (ProductOrder po : orders) {
			System.out.println("상품: " + po.productName + " 가격: " + po.price + " 수량: " + po.quantity);
		}
	}

	static int getTotalAmount(ProductOrder[] orders) {
		int total = 0;
		for (ProductOrder po : orders) {
			total += po.price * po.quantity;
		}
		return total;
	}
}
