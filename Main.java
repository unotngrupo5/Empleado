package ejercicioEmpleados;

public class Main {

	public static void main(String[] args) {
		
		Empleado e1 = new Operario("Pablo", 27, 1, 2, true, 2);
		System.out.println(e1.calcularSueldo(Operario.sueldobasico));
		Empleado e2 = new EmpleadoT("Walter", 33, 2, 9);
		System.out.println(e2.calcularSueldo(EmpleadoT.sueldobasico));
		Empleado e3 = new Gerente("Mauro", 33, 3, 2, true, 5);
		System.out.println(e3.calcularSueldo(Gerente.sueldobasico));
		Empresa telistema = new Empresa();
		telistema.agregarEmpleado(e1);
		telistema.agregarEmpleado(e2);
		telistema.agregarEmpleado(e3);
	}

}
