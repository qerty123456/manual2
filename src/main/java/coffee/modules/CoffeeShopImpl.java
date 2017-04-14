package coffee.modules;

import coffee.api.CoffeeMaker;
import coffee.api.Heater;
import coffee.api.Pump;

public class CoffeeShopImpl implements CoffeeShop {
	
	private CoffeeMaker coffeeMaker;
	
	private CoffeeShopImpl() {
		 Heater heater = HeaterModule.getHeater();
		 Pump pump = DripCoffeeModule.getPump();
		this.coffeeMaker = new CoffeeMaker(heater, pump);
	}

	@Override
	public CoffeeMaker maker() {
		return coffeeMaker;
	}
	
	public static class Builder {
		private static CoffeeShopImpl coffeeShop;
		
		private Builder() {};
		
		public static CoffeeShop build() {
			if (coffeeShop == null) {
				coffeeShop = new CoffeeShopImpl();
			}
			return coffeeShop;
		}
	}

}
