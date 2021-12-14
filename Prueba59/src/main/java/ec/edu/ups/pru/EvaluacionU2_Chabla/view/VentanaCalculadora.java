package ec.edu.ups.pru.EvaluacionU2_Chabla.view;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import ec.edu.ups.pru.EvaluacionU2_Chabla.bussines.DomicilioONRemote;
import ec.edu.ups.pru.EvaluacionU2_Chabla.bussines.PersonaONRemote;
import ec.edu.ups.pweb.demoapp.model.DetalleFactura;
import ec.edu.ups.pweb.demoapp.model.Producto;
import ec.edu.ups.pweb.demop59cliente.view.VentanaCalculadora;


public class VentanaCalculadora {
	
	private DomicilioONRemote dmRemote;
	private PersonaONRemote prRemote;
	
	public void conectar() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "demop59");  
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "demop59");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/EvaluacionU2-Chabla/PersonaON!ec.edu.ups.pru.EvaluacionU2_Chabla.bussines.PersonaONRemote";
            
            this.prRemote = (PersonaONRemote) context.lookup(lookupName);
            
            final String lookupName1 = "ejb:/EvaluacionU2-Chabla/DomicilioON!ec.edu.ups.pru.EvaluacionU2_Chabla.bussines.DomicilioONRemote";
            
            this.dmRemote = (DomicilioONRemote) context.lookup(lookupName1);


		} catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public void crearPersona() {
			Persona pr = new Persona();
			pr.setCodigo(2);
			pr.setNombre("Router");
			pr.setProducto(100.0);
			pr.setStock(1);
			
			try {
				prRemote.insert(pr);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void crearDomicilio() {
			Domicilio df = new Domiclio();
			df.setCodigo(1);
			
			Persona pr = new Persona();
			pr.setCodigo(2);
			
			df.setProducto(pr);

			
			df.setCantidad(4);
			df.setPrecio(20.0);
			
			try {
				this.dmRemote.insert(df);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			VentanaCalculadora vtnClc = new VentanaCalculadora();
			try {
				
				
				vtnClc.crearPersona();
				
				vtnClc.crearDomicilio();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		}


	}

}
