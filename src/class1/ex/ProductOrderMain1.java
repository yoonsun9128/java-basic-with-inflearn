package class1.ex;

public class ProductOrderMain1 {
	public static void main(String[] args) {
		ProductOrder potatoChip = new ProductOrder();
		potatoChip.productName = "포카칩";
		potatoChip.price = 1500;
		potatoChip.quantity = 5;

		ProductOrder bananaChip = new ProductOrder();
		bananaChip.productName = "바나나칩";
		bananaChip.price = 1700;
		bananaChip.quantity = 3;

		ProductOrder chocoChip = new ProductOrder();
		chocoChip.productName = "초코칩";
		chocoChip.price = 2100;
		chocoChip.quantity = 6;

		ProductOrder[] productOrders = {potatoChip, bananaChip, chocoChip};

		int sum = 0;
		for (ProductOrder po : productOrders) {
			System.out.println("상품: " + po.productName + " 가격: " + po.price + " 수량: " + po.quantity);
			int poTotal = po.price * po.quantity;
			sum +=poTotal;
		}
		System.out.println("최종합계:" + sum);
	}
}
