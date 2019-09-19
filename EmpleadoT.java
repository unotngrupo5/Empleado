package ejercicioEmpleados;

public class EmpleadoT extends Empleado{
	private int horas;
	static int precioporhora = 100;
	static double sueldobasico = 0;

	public EmpleadoT(String nombre, int edad, int legajo, int horas){
		super(nombre, edad, legajo);
		this.setHoras(horas);

	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double calcularSueldo(double sueldobasico) {
		return this.getHoras() * precioporhora;
	}
}
