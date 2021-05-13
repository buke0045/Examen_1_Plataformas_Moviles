package imp;

import componente.Suspension;

public class ImpSuspensionTJM implements Suspension{

	//SOBREESCRITURA AL IMPLEMENTAR UN METODO DE LA CLASE MADRE
	@Override
	public String tipo() {
		return "TJM";
		
	}

}
