package coffee.impl;

import coffee.api.Heater;
import coffee.api.Pump;

public class Thermosiphon implements Pump {
	
	private Heater heater;
	
	public Thermosiphon( Heater heater ) {
		this.heater = heater;
	}

	@Override
	public void pump() {
		System.out.println("Thermosiphon: " + heater);
		System.out.println("pumping");
	}

}
