package guia7_ej11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Guia7_ej11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese día");
        int day = scan.nextInt();
        System.out.println("Ingrese mes");
        int month = scan.nextInt();
        System.out.println("Ingrese año");
        int year = scan.nextInt();

        LocalDate bDay = LocalDate.of(year, month, day);
        
        LocalDate today = LocalDate.now();
        
        
        System.out.println("Entre "+today.toString()+" y "+bDay.toString());
        System.out.println("Hay "+ChronoUnit.YEARS.between(bDay, today)+" años de diferencia.");
        System.out.println("Hay "+ChronoUnit.MONTHS.between(bDay, today)+" meses de diferencia.");
        System.out.println("Hay "+ChronoUnit.DAYS.between(bDay, today)+" días de diferencia");

    }

}
