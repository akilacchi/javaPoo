package guia7_ej01;

import java.util.Scanner;
import guia7_ej01.Entities.Book;

public class Guia7Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        
        System.out.println("Ingrese ISBN");
        int ISBN = scan.nextInt();
        System.out.println("Ingrese autor");
        String author = scan.next();
        System.out.println("Ingrese título");
        String tittle = scan.next();
        System.out.println("Ingrese número de páginas");
        int pages = scan.nextInt();

        Book b1 = new Book();
        b1.fillBook(ISBN, author, tittle, pages);
        b1.showBook();
        
    }

}
