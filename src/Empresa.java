import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private int id;
	
	private String nombre;
	private String direccion;
	private int fundacion;
	private List<Empleado>empleados = new ArrayList<Empleado>();
	
	
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getFundacion() {
		return fundacion;
	}
	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public void addEmpleados(Empleado empleado){
		empleado.setEmpresa(this);
		this.empleados.add(empleado);
	}
	
	
	
}
