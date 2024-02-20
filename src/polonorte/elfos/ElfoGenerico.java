package polonorte.elfos;

public abstract class ElfoGenerico {

	private String nombre;
	private boolean trabajando;
	private Enum seccionLaboral;
	
	protected ElfoGenerico(String nombre, Enum seccionLaboral) {
		this.nombre = nombre;
		this.seccionLaboral = seccionLaboral;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the trabajando
	 */
	public boolean isTrabajando() {
		return trabajando;
	}
	/**
	 * @param trabajando the trabajando to set
	 */
	public void setTrabajando(boolean trabajando) {
		this.trabajando = trabajando;
	}
	/**
	 * @return the seccionLaboral
	 */
	public Enum getSeccionLaboral() {
		return seccionLaboral;
	}
	/**
	 * @param seccionLaboral the seccionLaboral to set
	 */
	public void setSeccionLaboral(Enum seccionLaboral) {
		this.seccionLaboral = seccionLaboral;
	}
	
	
}
