package ejercicioEmpleados;

public class Gerente extends EmpleadoP{
	static double sueldobasico = 50000;

	public Gerente(String nombre, int edad, int legajo, int hijos, boolean casado, int antiguedad) {
		super(nombre, edad, legajo, hijos, casado, antiguedad);
	}
	public double calcularSueldo() {
		return super.calcularSueldo(sueldobasico);	
		}
}
