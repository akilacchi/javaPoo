package guia7_ej14;

import java.util.Scanner;

public class Phone {
    
    public Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    private String brand, model;
    private int price, ram, rom;
    private int [] code = new int[7];

    public Phone() {
    }

    public Phone(String brand, String model, int price, int ram, int rom) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.rom = rom;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }
    
    public void loadPhone(){
        System.out.println("Ingrese marca del dispositivo móvil");
        brand = scan.next();
        System.out.println("Ingrese el precio");
        price = scan.nextInt();
        System.out.println("Ingrese modelo del dispositivo");
        model = scan.next();
        System.out.println("Ingrese cantidad de memoria");
        ram = scan.nextInt();
        System.out.println("Ingrese capacidad de almacenamiento");
        rom = scan.nextInt();
        
        loadCode();
        
    }
    public void loadCode(){
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese dígito número "+(i+1)+" del código. Sólo se conciderará un caracter.");
            
            code[i]= (int)scan.nextInt();
        }
    }

    @Override
    public String toString() {
        return "Phone{ brand=" + brand + ", model=" + model + ", price=" + price + ", ram=" + ram + ", rom=" + rom + '}';
    }
    public void printCode(){
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]);
        }
        System.out.println("");
    }
}
