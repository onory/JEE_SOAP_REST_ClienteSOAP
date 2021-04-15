/*
 *clase de prueba para el web service persona desde sga jee web
 */
package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWS;
import java.util.List;

public class TestPersonaServiceWS {
    
    public static void main(String[] args) {
        
        PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort(); //instanciamos de PersonaServiceWS
        
        System.out.println("ejecutando servicio listar personas ws");
        
        List<Persona> personas = personaService.listarPersonas(); // llamamos el metodo listar por la variable personaService
        
        for(Persona persona : personas){
            
            System.out.println("Persona: " + persona.getIdPersona() + ", Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido()
            + ", Email: " + persona.getEmail());
            
        }
        
        System.out.println("Fin Web service listar personas ws");
        
        
    }
    
}
