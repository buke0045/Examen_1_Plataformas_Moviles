package imp;

import componente.Motor;

public class ImpMotorGasolina implements Motor{

	//SOBREESCRITURA AL IMPLEMENTAR UN METODO DE LA CLASE MADRE
	@Override
	public String tipo() {
		return "Gasolina";
	}
}
