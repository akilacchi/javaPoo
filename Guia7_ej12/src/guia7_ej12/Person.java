package guia7_ej12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Person {
    private String name;
    private int day, month, year;
    
    Scanner scan= new Scanner(System.in);
    
    public Person(){
        
    }
    
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void createPerson(){
        System.out.println("Ingrese su nombre");
        name = scan.next();
        System.out.println("Ingrese la fecha de su nacimiento");
        System.out.println("Ingrese día");
        day = scan.nextInt();
        System.out.println("Ingrese mes");
        month = scan.nextInt();
        System.out.println("Ingrese año");
        year = scan.nextInt();
    }
    
    
    public void calculateAge(){
        LocalDate now = LocalDate.now();
        LocalDate bDay = LocalDate.of(year, month, day);
        
        System.out.println("Su edad es :");
        System.out.println(ChronoUnit.YEARS.between(bDay, now));
    }
    
    public boolean minor(int age){
        LocalDate now = LocalDate.now();
        LocalDate bDay = LocalDate.of(year, month, day);
        
        return age<(ChronoUnit.YEARS.between(bDay, now));
    }
    
    public void showPerson(){
        LocalDate bDay = LocalDate.of(year, month, day);
        System.out.println("Su nombre es: "+name);
        System.out.println("Su fecha de nacimiento es: "+bDay.toString());
    }
}
