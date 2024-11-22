public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        
        persona.setNombre("Juan");
        System.out.println("Nombre: " + persona.getNombre());

        
        persona.edad = "30"; 
        System.out.println("Edad: " + persona.edad);
    }
}