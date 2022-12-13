package guia7_ej06;

import java.util.Scanner;

public class Nespresso {

    Scanner scan = new Scanner(System.in);
    private int maxCap=3000;
    private int currentCap;

    public Nespresso() {
    }

    public Nespresso(int maxCap, int currentCap) {
        this.maxCap = maxCap;
        this.currentCap = currentCap;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public int getCurrentCap() {
        return currentCap;
    }

    public void setCurrentCap(int currentCap) {
        this.currentCap = currentCap;
    }

    public void fillCoffeM() {
        currentCap = maxCap;
        System.out.println("La cafetera se llenó exitosamente");
    }

    public void serveCup(int size) {

        if (size > currentCap) {
            System.out.println("La cantidad actual no alcanza para para llenar la taza");
            System.out.println("La taza contiene " + currentCap + " ml.");
            currentCap = 0;
        } else {
            System.out.println("Taza servida.");
            currentCap -= size;
            System.out.println("cantidad de café restante: " + currentCap);
        }
    }

    public void emptyKettle() {
        System.out.println("Cafetera vacía.");
        currentCap = 0;
    }

    public void addCoffe(int size) {
        System.out.println("Cantidad "+size+" de café añadida exitosamente.");
        currentCap +=size;
    }
}
