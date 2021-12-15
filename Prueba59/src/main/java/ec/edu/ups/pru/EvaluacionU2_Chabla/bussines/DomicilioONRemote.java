package ec.edu.ups.pru.EvaluacionU2_Chabla.bussines;


import java.util.List;



import ec.edu.ups.pru.EvaluacionU2_Chabla.modelo.Domicilio;


public interface DomicilioONRemote {
	
	public void insert(Domicilio p) throws Exception;
	public void update(Domicilio p) throws Exception;
	public List<Domicilio> getClientes();
	
}
