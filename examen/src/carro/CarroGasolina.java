package carro;

import componente.Motor;
import componente.RelacionesDiferenciales;
import componente.Suspension;

public class CarroGasolina extends Carro{
	private final Motor motor;
	private final RelacionesDiferenciales relacionesDiferenciales;
	private final Suspension suspensiones;
	
	public CarroGasolina(Motor m, RelacionesDiferenciales r, Suspension s) {
		this.motor = m;
		this.relacionesDiferenciales = r;
		this.suspensiones = s;
	}
	@Override
	public void tipoCarroOffRoad() {
		System.out.println("Especificaciones:");
		System.out.println("    Motor: " + motor.tipo());
		System.out.println("    Suspensiones: " + suspensiones.tipo());
		System.out.println("    Relaciones Diferenciales: " + relacionesDiferenciales.tipo());
		System.out.println("Carro Gasolina");
		System.out.println("------------------------");
	}

}
