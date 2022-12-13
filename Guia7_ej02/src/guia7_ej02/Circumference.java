package guia7_ej02;

import java.util.Scanner;

public class Circumference {
    Scanner scan = new Scanner(System.in);

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void createCir(double radio) {
        this.radio = radio;
    }

    public double area() {
        return radio * radio * Math.PI;

    }

    public double perimeter() {
        return radio * Math.PI * 2;
    }

    public Circumference() {
    }

    public void createCircumference() {
        System.out.println("Ingrese el radio del cícrulo");
        setRadio(scan.nextDouble());
    }

}
