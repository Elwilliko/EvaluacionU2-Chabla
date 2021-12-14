package ec.edu.ups.pru.EvaluacionU2_Chabla.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.pru.EvaluacionU2_Chabla.DAO.DomicilioDAO;
import ec.edu.ups.pru.EvaluacionU2_Chabla.modelo.Domicilio;

@Stateless
public class DomicilioON implements DomicilioONRemote {
	
	@Inject
	private DomicilioDAO daoDomicilio;
	
	public void insert(Domicilio p) throws Exception{
		daoDomicilio.insert(p);
	}
	
	public List<Domicilio> getClientes(){
		return daoDomicilio.getList();
	}

}
