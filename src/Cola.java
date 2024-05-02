import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<PersonaIsraelTabango> personas;

    public Cola(){

        personas= new LinkedList<PersonaIsraelTabango>();
    }

    public boolean esVacia(){
        // cambie el método para que funcione correctamente
        return personas.isEmpty();
    }

    public int tamanio(){

        return personas.size();
    }

    public void encolar(String cedula, String nombre, int edad, String genero, String region){
        personas.add(new PersonaIsraelTabango(cedula,nombre,edad,genero,region));
    }

    public Object desencolar() throws Exception{
        if (esVacia())
            throw new Exception("No hay personas");
        return personas.poll();
        //   return null;
    }

    public String listarPersonas(){
        String mensaje = "";
        for (PersonaIsraelTabango persona:personas){
            mensaje += persona.toString();
        }
        return mensaje;
    }



}
