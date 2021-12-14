package ec.edu.ups.pru.EvaluacionU2_Chabla.bussines;


import java.util.List;


import ec.edu.ups.pru.EvaluacionU2_Chabla.modelo.Persona;

public interface PersonaONRemote {
	
	public void insert(Persona p) throws Exception;
	public List<Persona> getClientes();
	

}
