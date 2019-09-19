package ejercicioEmpleados;

public class Operario extends EmpleadoP{
	static double sueldobasico = 15000;
	
	public Operario(String nombre, int edad, int legajo, int hijos, boolean casado, int antiguedad) {
		super(nombre, edad, legajo, hijos, casado, antiguedad);
	}
	
	
	public static double getSueldoBasico() {
		return sueldobasico;
	}
	public double calcularSueldo() {
		return super.calcularSueldo(sueldobasico);
	}
}
