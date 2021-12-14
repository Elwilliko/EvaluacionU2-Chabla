package ec.edu.ups.pru.EvaluacionU2_Chabla.bussines;

import java.util.List;

import ec.edu.ups.pru.EvaluacionU2_Chabla.bussines.PersonaON;
import ec.edu.ups.pru.EvaluacionU2_Chabla.modelo.Persona;

import javax.ejb.*;

@Remote
public interface PersonaONRemote {
	
	public void insert(Persona p) throws Exception;
	public List<Persona> getClientes();
	

}
