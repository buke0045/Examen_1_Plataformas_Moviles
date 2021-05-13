package imp;

import componente.Suspension;

public class ImpSuspensionARB implements Suspension{

	//SOBREESCRITURA AL IMPLEMENTAR UN METODO DE LA CLASE MADRE
	@Override
	public String tipo() {
		return "ARB";
	}

}
