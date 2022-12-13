package guia7_ej01.Entities;

public class Book {

    public int ISBN;
    public String tittle;
    public String author;
    public int pages;

    public Book(int ISBN, String tittle, String author, int pages) {
        this.ISBN = ISBN;
        this.tittle = tittle;
        this.author = author;
        this.pages = pages;
    }

    public Book() {
        
    }

   
    public int getISBN() {
        return this.ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTittle() {
        return this.tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    public void fillBook(int ISBN, String author, String tittle, int pages){
        this.ISBN= ISBN;
        this.author= author;
        this.tittle= tittle;
        this.pages= pages;
    }

    public void showBook() {
        System.out.println("El número de ISBN es: " + ISBN);
        System.out.println("EL autor es: " + author);
        System.out.println("El título del libro es: " + tittle);
        System.out.println("El número de páginas es: " + pages);
    }
}
