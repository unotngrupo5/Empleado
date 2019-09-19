package ejercicioEmpleados;

public abstract class EmpleadoP extends Empleado{
	private int hijos;
	private boolean casado;
	private int antiguedad;
	static double importeporhijo = 20;
	static double importeporcasado = 10;

	public EmpleadoP(String nombre, int edad, int legajo, int hijos, boolean casado, int antiguedad) {
		super(nombre, edad, legajo);
		this.setHijos(hijos);
		this.setCasado(casado);
		this.setAntiguedad(antiguedad);
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double calcularSueldo(double sueldobasico) {
		sueldobasico = sueldobasico * ((this.getAntiguedad() * 0.04)+1);
		sueldobasico = sueldobasico + (importeporhijo * this.getHijos());
		if (this.isCasado() == true ) {
			return sueldobasico + importeporcasado;	
		}
		return sueldobasico;
	}

}
