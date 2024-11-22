class Persona {
    private String nombre;  // Atributo privado
    String edad;           // Atributo de paquete (default)

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getNombre() {
        return nombre;
    }
}