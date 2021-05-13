package imp;

import componente.Motor;

public class ImpMotorDiesel implements Motor{

	//SOBREESCRITURA AL IMPLEMENTAR UN METODO DE LA CLASE MADRE
	@Override
	public String tipo() {
		return "Diesel";
	}
}
