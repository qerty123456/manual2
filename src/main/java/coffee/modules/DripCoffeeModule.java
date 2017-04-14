package coffee.modules;

import coffee.api.Heater;
import coffee.api.Pump;
import coffee.impl.Thermosiphon;

public final class DripCoffeeModule {
	
	private static Pump pump;
	
	private DripCoffeeModule() {}
	
	public static Pump getPump() {
		if (pump == null) {
			Heater heater = HeaterModule.getHeater();
			pump = new Thermosiphon(heater);
		}
		return pump;
	}

}
