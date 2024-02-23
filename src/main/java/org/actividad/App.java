package org.actividad;


import org.actividad.cuentaBancaria.Cuenta;
import org.actividad.geometria.Circulo;
import org.actividad.geometria.Rectangulo;
import org.actividad.operaciones.Operacion;

public class App {
    public static void main(String[] args) {
        // ------- Operaciones ------------
        //creo objeto operación
        Operacion operacion1 = new Operacion();
        operacion1.crearOperacion();

        operacion1.sumar();

       operacion1.restar();

       operacion1.multiplicar();

       operacion1.dividir();


        //------------ CUENTA ---------------
         Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        cuenta.ingresar(2000);
        cuenta.retirar(500);
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();

        // ---------FIGURAS GEOMETRICAS -----------
        Circulo circulo = new Circulo(5);

        System.out.println("El área del circulo es: " + circulo.calcularArea());
        System.out.println("El perímetro del circulo es de: " + circulo.calcularPerimeto());

        Rectangulo rectangulo = new Rectangulo(5, 2);
        System.out.println("El área del rectangulo es: " + rectangulo.calcularArea());
        System.out.println("El perímetro del rectangulo es de: " + rectangulo.calcularPerimeto());

    }


}
