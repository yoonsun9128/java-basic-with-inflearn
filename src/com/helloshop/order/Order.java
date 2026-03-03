package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
	User user;
	Product product;

	//public이 붙어야 다른 패키지에서 부를 수 있다.
	public Order(User user, Product product) {
		//주문하는 사람과 무엇을 주문하는지 구성
		this.user = user;
		this.product = product;
	}
}
