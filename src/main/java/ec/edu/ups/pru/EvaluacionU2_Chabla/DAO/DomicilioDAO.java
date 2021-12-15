package ec.edu.ups.pru.EvaluacionU2_Chabla.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.pru.EvaluacionU2_Chabla.modelo.Domicilio;

public class DomicilioDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Domicilio op) {
		em.persist(op);
		
	}
	
	public void update(Domicilio op) {
			em.persist(op);
		}
	
	public Domicilio read(int codigo) {
		Domicilio op = em.find(Domicilio.class, codigo);
		return op;
	}
	
	public void delete(int codigo) {
		Domicilio op = em.find(Domicilio.class, codigo);
		em.remove(op);
	}
	
	public List<Domicilio> getList(){
		List<Domicilio> listado = new ArrayList<Domicilio>();
		
		String jpql = "SELECT op FROM Persona op";
				
		
		Query query = em.createQuery(jpql, Domicilio.class);
		
		listado = query.getResultList();
		
		return listado;
		
		//JSPQL -> SQL
		
	}

}
