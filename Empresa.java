package ejercicioEmpleados;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Empleado> empleados;

	public Empresa(ArrayList<Empleado> empleados) {
		this.setEmpleados(empleados);
	}
	public Empresa() {
		this(new ArrayList<Empleado>());
	}
	
	public void agregarEmpleado(Empleado empleado) {
		if(empleado != null) {
			this.getEmpleados().add(empleado);
		}
	}
	public double calcularSaldo() {
		//double total;
		//for (Empleado empleados:???) {
			
		//}
		return 0;
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
