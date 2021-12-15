package ec.edu.ups.pru.EvaluacionU2_Chabla.modelo;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Domicilio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name= "do_codigo")
	private int codigo;
	
	@Column(name= "do_ciudad")
	private String Ciudad;
	
	@Column(name= "do_calle_principal")
	private String callePrincipal;
	
	@Column(name= "do_calle_secundaria")
	private String calleSecundaria;
	
	//@OneToOne
    //@JoinColumn(name= "per_cedula")
	//private Persona personas;

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return Ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	/**
	 * @return the callePrincipal
	 */
	public String getCallePrincipal() {
		return callePrincipal;
	}

	/**
	 * @param callePrincipal the callePrincipal to set
	 */
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	/**
	 * @return the calleSecundaria
	 */
	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	/**
	 * @param calleSecundaria the calleSecundaria to set
	 */
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	/**
	 * @return the personas
	 */
	/*public Persona getPersonas() {
		return personas;
	}*/

	/**
	 * @param personas the personas to set
	 */
/*	public void setPersonas(Persona personas) {
		this.personas = personas;
	}*/
	
	

}
