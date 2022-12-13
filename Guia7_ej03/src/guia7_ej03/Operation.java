package guia7_ej03;

import java.util.Scanner;

public class Operation {

    Scanner scan = new Scanner(System.in);

    private int number1;
    private int number2;

    public Operation() {
    }

    public Operation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void createOperation() {
        System.out.println("Ingrese el primer número");
        setNumber1(scan.nextInt());
        System.out.println("Ingrese el segundo número");
        setNumber2(scan.nextInt());
    }

    public int sum() {
        return (number1 + number2);
    }

    public int subtract() {
        return (number1 - number2);
    }

    public int multiply() {
        if (number1 == 0 || number2 == 0) {
            System.out.println("Alguno de los operadores es igual a 0.");
            return 0;
        }else{
            return (number1*number2);
        }
    }

    public double division(){
         if (number2 == 0) {
            System.out.println("Alguno de los operadores es igual a 0.");
            return 0;
         }else{
             return ((double)this.number1 /(double) this.number2);
         }
    }
}
