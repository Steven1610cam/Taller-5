package pruebas;

import vehiculos.Moto; // Importar la clase Moto

public class PruebaVehiculo {
    public static void main(String[] args) {
        // Intentar crear un objeto de la clase Moto
        Moto moto = new Moto("Deportiva");

        // Intentar acceder al atributo tipo de la clase Vehiculo
        // Esto generará un error de compilación porque 'tipo' es de paquete
        // System.out.println(moto.tipo); // Descomentar para ver el error
    }
}