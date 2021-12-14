package ec.edu.ups.pru.EvaluacionU2_Chabla.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pru.EvaluacionU2_Chabla.DAO.PersonaDAO;
import ec.edu.ups.pru.EvaluacionU2_Chabla.modelo.Persona;

@Stateless
public class PersonaON implements PersonaONRemote {
	
	@Inject
	private PersonaDAO daoPersona;
	
	public void insert(Persona p) throws Exception{
		daoPersona.insert(p);
	}
	
	public List<Persona> getClientes(){
		return daoPersona.getList();
	}


}
