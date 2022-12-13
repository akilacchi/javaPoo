package guia7_ej4;

import java.util.Scanner;

public class Rectangle {
    Scanner scan =  new Scanner(System.in);
    
    private int height;
    private int base;

    public Rectangle() {
    }

    public Rectangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void createRectangle(){
        System.out.println("Ingrese altura del rectángulo");
        setHeight(scan.nextInt());
        System.out.println("Ingrese la base del rectángulo");
        setBase(scan.nextInt());
    }
    
    public int surface(){
       return (base*height); 
    }
    
    public int perimeter(){
     return (base+height)*2;   
    }
    
    public void drawRectangle(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
        
}
