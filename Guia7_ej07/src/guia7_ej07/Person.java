package guia7_ej07;

import java.util.Scanner;

public class Person {
    
    Scanner scan = new Scanner(System.in);
    
    private String name;
    private int age, weight, imc;
    private double height;
    private char sex;

    public int getImc() {
        return imc;
    }

    public void setImc(int imc) {
        this.imc = imc;
    }
    

    public Person() {
    }

    public Person(String name, int age, int wight, double height, char sex, int imc) {
        this.name = name;
        this.age = age;
        this.weight = wight;
        this.height = height;
        this.sex = sex;
        this.imc = imc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int wight) {
        this.weight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
  
    
    public void createPerson(){
        System.out.println("Ingrese el nombre de la persona");
        setName(scan.next());
        System.out.println("Ingrese edad de la persona");
        setAge(scan.nextInt());
        System.out.println("Ingrese su sexo (H/M/O)");
        setSex(scan.next().toUpperCase().charAt(0));
        if(sex!='H' && sex!='M' && sex !='O'){
            System.out.println("Error, opción no válida");
        }
        System.out.println("Ingrese su peso");
        setWeight(scan.nextInt());
        System.out.println("Ingrese su altura");
        setHeight(scan.nextDouble());
    }
    
    public void CalculateIMC(){
        System.out.println("Calculando IMC");
        double aux = (weight/((height*height)));
        System.out.println(aux);
        if(aux<20){
            System.out.println(name+" se encuentra por debajo a su peso ideal deacuerdo con su IMC");
            imc = -1;
        }else if(aux>25){
            System.out.println(name+" se encuentra por encima de su peso ideal deacuerdo con su IMC");
            imc=0;
        }else{
            System.out.println(name+" se encuentra dentro de su peso ideal de acuerdo con su IMC");
            imc=1;
        }
    }
    public void legalAge(){
        if (age>17){
            System.out.println(name+" es mayor de edad");
        }else{
            System.out.println(name+" no es mayor de edad");
        }
    }
}
