package guia7_extra01;

import java.util.Scanner;

public class Cancion {

    Scanner scan = new Scanner(System.in);
    
    private String tittle, author;

    public Cancion() {
        this.tittle = "";
        this.author = "";
    }

    public Cancion(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}
