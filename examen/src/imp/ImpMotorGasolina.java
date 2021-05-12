package imp;

import componente.Motor;

public class ImpMotorGasolina implements Motor{

	@Override
	public String tipo() {
		return "Gasolina";
	}
}
