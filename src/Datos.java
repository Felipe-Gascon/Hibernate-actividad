public class Datos {
	private int empleadoId;
	private String puesto;
	private String segsocial;	
	private Empleado empleado ;
	
	
	
	public Datos() {
		
	}
	

	
	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getSegsocial() {
		return segsocial;
	}
	public void setSegsocial(String segsocial) {
		this.segsocial = segsocial;
	}

}
