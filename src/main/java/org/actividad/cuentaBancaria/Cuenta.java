package org.actividad.cuentaBancaria;

import java.util.Scanner;

public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private double interes;

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCliente=" + dniCliente +
                ", saldoActual=" + saldoActual +
                ", interes=" + interes +
                '}';
    }

    public void crearCuenta() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su número de cuenta");
        this.numeroCuenta = teclado.nextInt();

        System.out.println("Ingrese su DNI");
        this.dniCliente = teclado.nextLong();

        System.out.println("Ingrese su saldo actual");
        this.saldoActual = teclado.nextDouble();

    }

    public void ingresar(double ingreso) {
        this.saldoActual = this.saldoActual + ingreso;
        System.out.println("Su saldo actúal es: $" + saldoActual);

    }

    public void retirar(double retiro) {
        if (retiro > this.saldoActual) {
            this.saldoActual = 0;
            System.out.println("No se puede realizar el retiro, su saldo actual es:  $" + this.saldoActual);
        } else {
            this.saldoActual = this.saldoActual - retiro;
            System.out.println("El dinero extraido es de: $" + retiro + " Su saldo queda en: $" + this.saldoActual);
        }
    }

    public void extraccionRapida() {
        double dineroExtraer = saldoActual * 0.2;
        this.saldoActual = saldoActual - dineroExtraer;
        System.out.println("Se extrajo de su cuenta: $" + dineroExtraer + " Su saldo actual es de: $" + this.saldoActual);
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual en su cuenta es de: $" + this.saldoActual);
    }

    public void consultarDatos() {
        System.out.println("Su número de cuenta es: " + this.numeroCuenta);
        System.out.println("Su n° de DNI es: " + this.dniCliente);
        System.out.println("Su saldo es de: " + this.saldoActual);
        System.out.println("El interes es de: " + this.interes);
    }

}
