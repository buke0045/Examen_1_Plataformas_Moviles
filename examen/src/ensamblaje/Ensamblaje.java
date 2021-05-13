package ensamblaje;
import carro.*;
import componente.*;
import imp.*;

public class Ensamblaje {
	
	//POLIMORFISMO AL LLAMAR EL METODO tipoCarroOffRoad()
	//INYECCION DE DEPENDENCIAS AL MANDAR COMPONENTES POR PARAMETROS
	//COMPOSICION
	public static void main(String[] args) {
	new CarroDiesel(Create_Motor(E_Motor.DIESEL),(Create_RL(E_Relacion_Diferencial.RL4_7)), (Create_S(E_Suspension.ARB))).tipoCarroOffRoad();
	new CarroGasolina(Create_Motor(E_Motor.GASOLINA),(Create_RL(E_Relacion_Diferencial.RL4_7)), (Create_S(E_Suspension.TJM))).tipoCarroOffRoad();
	new CarroDiesel(Create_Motor(E_Motor.DIESEL),(Create_RL(E_Relacion_Diferencial.RL4_9)), (Create_S(E_Suspension.TJM))).tipoCarroOffRoad();
	}
	
	private enum E_Motor {
		DIESEL,
		GASOLINA
	}
	private enum E_Relacion_Diferencial{
		RL4_7,
		RL4_9
	}
	private enum E_Suspension {
		ARB,
		TJM
	}
	private static Motor Create_Motor(E_Motor type) {
		  if (type.equals(E_Motor.DIESEL)) {
			  return new ImpMotorDiesel();
		  }
	return new ImpMotorGasolina(); 
	}
	
	
	private static RelacionesDiferenciales Create_RL(E_Relacion_Diferencial type) {
		  if (type.equals(E_Relacion_Diferencial.RL4_7)) {
			  return new ImpRelacionDiferencial_4_7();
		  }
	return new ImpRelacionDiferencial_4_9(); 
	}
	
	private static Suspension Create_S(E_Suspension type) {
		  if (type.equals(E_Suspension.ARB)) {
			  return new ImpSuspensionARB();
		  }
	return new ImpSuspensionTJM(); 
	}
}
