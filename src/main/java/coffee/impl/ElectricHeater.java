package coffee.impl;

import coffee.api.Heater;

public class ElectricHeater implements Heater {
	
	

	@Override
	public void heat() {
		System.out.println("heating");

	}

}
