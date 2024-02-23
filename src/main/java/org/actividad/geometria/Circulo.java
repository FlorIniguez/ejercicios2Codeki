package org.actividad.geometria;

public class Circulo implements calculosFormas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularArea() {
        return PI * (radio * radio);
    }

    @Override
    public double calcularPerimeto() {
        return 2 * PI * radio;
    }
}
