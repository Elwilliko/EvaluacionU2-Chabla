package ec.edu.ups.pru.EvaluacionU2_Chabla.modelo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity
public class Persona implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name= "per_cedula")
	private String cedula;
	
	@Column(name= "per_nombre")
	private String nombre;
	
	@Column(name= "per_direccion")
	private String direccion;
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

}
