package guia7_ej07;

import guia7_ej07.Person;

public class Guia7_ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        
        int cla=0,ciw=0,cuw=0,cow=0;
        double avgOA, avgUW,avgOW,avgIW;
        
        p1.createPerson();
        p1.CalculateIMC();
        p1.legalAge();
        p2.createPerson();
        p2.CalculateIMC();
        p2.legalAge();
        p3.createPerson();
        p3.CalculateIMC();
        p3.legalAge();
        p4.createPerson();
        p4.CalculateIMC();
        p4.legalAge();
        
        if(p1.getAge()>17){
            cla++;
        }
        if(p2.getAge()>17){
            cla++;
        }
        if(p3.getAge()>17){
            cla++;
        }
        if(p4.getAge()>17){
            cla++;
        }
        switch (p1.getImc()) {
            case -1:
                cuw++;
                break;
            case 0:
                ciw++;
                break;
            default:
                cow++;
                break;
        }
        switch (p2.getImc()) {
            case -1:
                cuw++;
                break;
            case 0:
                ciw++;
                break;
            default:
                cow++;
                break;
        }
        switch (p3.getImc()) {
            case -1:
                cuw++;
                break;
            case 0:
                ciw++;
                break;
            default:
                cow++;
                break;
        }
        switch (p4.getImc()) {
            case -1:
                cuw++;
                break;
            case 0:
                ciw++;
                break;
            default:
                cow++;
                break;
        }
        avgOA = (double)cla/4.0;
        avgOW = (double)cow/4.0;
        avgUW = (double)cuw/4.0;
        avgIW = (double)ciw/4.0;
        
        System.out.println("Personas con sobrepeso promedio: "+(avgOW*100)+"%");
        System.out.println("Personas con peso bajo el ideal promedio: "+(avgUW*100)+"%");
        System.out.println("Personas con peso ideal promedio: "+(avgIW*100)+"%");
        System.out.println("Personas mayores de edad promedio :"+ (avgOA*100)+"%");
        
    }
    
}
