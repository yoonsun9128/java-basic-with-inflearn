package ref.ex;

public class ProductOrderMain2 {
	public static void main(String[] args) {
		ProductOrder[] orders = new ProductOrder[3];
		orders[0] = createOrder("포카칩", 1500, 1);
		orders[1] = createOrder("바나나킥", 2500, 1);
		orders[2] = createOrder("사과칩", 3500, 1);

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
