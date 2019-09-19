package ejercicioEmpleados;

public abstract class Empleado {
	private String nombre ;
	private int edad;
	private int legajo;

	public Empleado(String nombre, int edad, int legajo) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setLegajo(legajo);
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String toSrting() {
		return "El nombre completo del empleado es:  "+this.getNombre();
	}

	protected abstract double calcularSueldo(double sueldobasico);

}
