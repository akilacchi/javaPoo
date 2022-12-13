package guia7;

import guia7.Entities.People;
import guia7.Services.PeopleServices;

public class Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PeopleServices persona = new PeopleServices();

        People p1 = persona.createPeople();

        System.out.println(p1.toString());
    }
}
