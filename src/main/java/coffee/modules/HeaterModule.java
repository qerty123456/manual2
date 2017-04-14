package coffee.modules;

import coffee.api.Heater;
import coffee.impl.ElectricHeater;

public final class HeaterModule {
	
	private static Heater heater;
	
	private HeaterModule() {};
	
	public static Heater getHeater() {
		if (heater == null) {
			heater = new ElectricHeater();
		}
		return heater;
	}

}
