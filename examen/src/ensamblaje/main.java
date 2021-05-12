package ensamblaje;
import carro.*;
import componente.*;
import imp.*;

public class main {
	
	static Motor m = new ImpMotorDiesel();
	static RelacionesDiferenciales r = new ImpRelacionDiferencial_4_7();
	static Suspension s = new ImpSuspensionARB();
	
	public static void main(String[] args) {

	new CarroDiesel(m, r, s).tipoCarroOffRoad();;
	new CarroGasolina(null, null, null);
	}
}
