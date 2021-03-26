package com.coforge.inher;

class Stationary extends Product {
	public void getDesc() {
		System.out.println("Stationary Items");
	}
	void showDiscountePrice(int amount) {
		System.out.println("Discount "+amount*2);
	}

}
