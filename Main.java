package Practica2_180524;

// Interfaz para comportamientos de conducción
interface Conducible {
    void acelerar(int velocidad);
    void girarIzquierda();
    void girarDerecha();
}

// Clase abstracta para vehículos
abstract class Vehiculo {
    // Método común a todos los vehículos
    public void arrancar() {
        System.out.println("El vehículo ha arrancado.");
    }

    // Método común a todos los vehículos
    public void detenerse() {
        System.out.println("El vehículo se ha detenido.");
    }

    // Método abstracto para girar
    abstract void girar();

    // Otros métodos comunes a todos los vehículos
}

// Clase concreta que representa un automóvil
class Automovil extends Vehiculo implements Conducible {
    @Override
    public void acelerar(int velocidad) {
        System.out.println("El automóvil acelera a " + velocidad + " km/h.");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("El automóvil gira a la izquierda.");
    }

    @Override
    public void girarDerecha() {
        System.out.println("El automóvil gira a la derecha.");
    }

    @Override
    void girar() {
        // Implementación específica para girar un automóvil
        System.out.println("El automóvil gira.");
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Automovil
        Automovil miAutomovil = new Automovil();

        // Llamar a los métodos de Automovil
        miAutomovil.arrancar();
        miAutomovil.acelerar(100);
        miAutomovil.girarIzquierda();
        miAutomovil.girarDerecha();
        miAutomovil.detenerse();
    }
}