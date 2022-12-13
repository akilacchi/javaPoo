package ej_5_servicio;

import java.util.Scanner;

public class cuentaServicio {

    Scanner scan = new Scanner(System.in);
    cuenta us = new cuenta();

    public void crearCuenta() {
        System.out.println("Ingrese número de cuenta");
        us.setNumeroCuenta(scan.nextInt());
        System.out.println("Ingrese DNI");
        us.setDNI(scan.nextLong());
        us.setSaldoActual((int) ((Math.random() * 1000 + 1)));
    }

    public void ingresar(double ingreso) {
        int balance = us.getSaldoActual();
        us.setSaldoActual(balance + (int) ingreso);
    }

    public void retirar(double retiro) {
        int balance = us.getSaldoActual();
        if (retiro < balance) {
            us.setSaldoActual(balance - (int) retiro);
        } else {
            us.setSaldoActual(0);
            System.out.println("Cantidad de dinero insuficiente.");
        }
    }
    
    public void extraccionRapida(){
        System.out.println("Ingrese cantidad a retirar.(no puede se superior a "+
                (us.getSaldoActual()/5)+", que equivale al 20%)");
        int aux = scan.nextInt();
        int balance = us.getSaldoActual();
        if(aux<=(us.getSaldoActual()/5)){
            us.setSaldoActual(balance-aux);
        }else{
            System.out.println("error, número ingresado supera el límite.");
        }
    }
    public void consultarSaldo(){
        System.out.println("Saldo actual.");
        System.out.println(us.getSaldoActual());
    }
    public void consultarDatos(){
        System.out.println("número de cuenta");
        System.out.println(us.getNumeroCuenta());
        System.out.println("DNI");
        System.out.println(us.getDNI());
        
    }
}
