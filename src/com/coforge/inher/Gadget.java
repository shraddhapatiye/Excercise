package com.coforge.inher;

class Gadget extends Product {
	public void getDesc() {
		System.out.println("Gadgets");
	}
	void showDiscountePrice(int amount) {
		System.out.println("Discount "+amount*3);
	}

}
