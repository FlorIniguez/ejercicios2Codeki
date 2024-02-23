package org.actividad.operaciones;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }

    public void crearOperacion() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        this.numero1 = teclado.nextInt();
        System.out.println("Ingrese otro número entero:");
        this.numero2 = teclado.nextInt();
    }

    public void sumar() {
        int resultadoSuma = this.numero1 + this.numero2;
        System.out.println("La suma de los numeros ingresados es: " + resultadoSuma );
    }

    public void restar() {
        int resultadoResta = this.numero1 - this.numero2;
        System.out.println("La resta de los numeros ingresados es: " + resultadoResta );
    }

    public void multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            int resultadoMultiplicar = this.numero1 * this.numero2;
            System.out.println("No se puede multiplicar por 0, todo número multiplicado por 0 da: " + resultadoMultiplicar);
        } else {
           int resultadoMultiplicar = this.numero1 * this.numero2;
            System.out.println("La multiplicación de los numeros ingresados es: " + resultadoMultiplicar );
        }
    }

    public void dividir() {
        if (numero1 == 0 || numero2 == 0) {
            int resultadoDividir = this.numero1 * this.numero2;
            System.out.println("No se puede dividir por 0, todo número divido por 0 da: " + resultadoDividir);
        } else {
            int resultadoDividir = this.numero1 / this.numero2;
            System.out.println("La división de los numeros ingresados es: " + resultadoDividir );
        }
    }
}
