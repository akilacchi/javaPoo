package guia7_ej05;

import java.util.Scanner;

public class Account {

    Scanner scan = new Scanner(System.in);

    private long accNumber;
    private int DNI, balance;

    public Account() {
    }

    public Account(long accNumber, int balance, int DNI) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.DNI = DNI;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void createAccount() {
        System.out.println("Ingrese número de cuenta");
        setAccNumber(scan.nextLong());
        System.out.println("Ingrese su DNI");
        setDNI(scan.nextInt());
        setBalance((int) (Math.random() * 1000 + 1));
    }

    public void deposit(double ingest) {
        balance += ingest;
    }

    public void withdraw(double draw) {
        if (draw > balance) {
            balance = 0;
            System.out.println("Número de retiro ingresado mayor a su saldo actual");
        } else {
            balance -= draw;
        }
    }

    public void fastDraw() {
        System.out.println("Ingrese cantidad a retirar, no puede ser superior al 20% de su saldo actual.");
        int aux = scan.nextInt();
        if(aux>=(balance*0.2)){
            System.out.println("Error, el número ingresado es mayor al 20% de su saldo");
        }else{
            balance-=aux;
        }
    }
    public void balanceCheck(){
        System.out.println("Su saldo actual es: ");
        System.out.println(balance);
    }
    public void datacheck(){
        System.out.println("Su número de cuenta:");
        System.out.println(accNumber);
        System.out.println("Su DNI");
        System.out.println(DNI);
    }
}
