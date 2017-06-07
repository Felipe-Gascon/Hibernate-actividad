public class Empleado {

	private int id;
	private String nombre;
	private int edad;
	private Datos dato;
	private Empresa empresa;


	public Empleado(){
		
	}


	


	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Datos getDato() {
		return dato;
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
	public void setDato(Datos dato) {
		this.dato= dato;
		dato.setEmpleado(this);
	}


}
