package gomez.christian;

public abstract class Asistente {

	private Integer dni;
	private Integer numeroCamiseta;
	private String posicion;
	private String nombreApellido;
	private String equipo;
	private Integer edad;
	public Asistente(Integer dni,Integer numeroCamiseta,String posicion,String nombreApellido,String equipo,Integer edad)
	{
		this.dni=dni;
		this.numeroCamiseta=numeroCamiseta;
		this.posicion=posicion;
		this.nombreApellido=nombreApellido;
		this.equipo=equipo;
		this.edad=edad;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Asistente other = (Asistente) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}
	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNombreApellido() {
		return nombreApellido;
	}
	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public abstract String getTipo();
	
	
	
}
