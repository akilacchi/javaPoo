package guia7.Services;

import guia7.Entities.People;
import java.util.Scanner;

public class PeopleServices {

    Scanner scan = new Scanner(System.in);

    public People createPeople() {

      //  People fullPeople = new People();

        System.out.println("Ingrese nombre de la persona");

        String name = scan.next();
        //fullPeople.setName(scan.next());

        System.out.println("Ingrese su edad");
        
        int age = scan.nextInt();
        //fullPeople.setAge(scan.nextInt());

        System.out.println("Ingrese su genero(M-F-O)");
        
        char gender = scan.next().toLowerCase().charAt(0);
        //fullPeople.setGender(scan.next().toLowerCase().charAt(0));
        

        return new People(name, age, gender);
    }

}
