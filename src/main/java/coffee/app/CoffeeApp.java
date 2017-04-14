package coffee.app;

import coffee.api.CoffeeMaker;
import coffee.modules.CoffeeShopImpl;

public class CoffeeApp {

	public static void main(String[] args) {
		CoffeeMaker coffeeMaker = CoffeeShopImpl.Builder.build().maker();
		coffeeMaker.makeCoffee();
	}

}
