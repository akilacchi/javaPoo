package guia7_ej13;

import guia7_ej13.Course;

public class Guia7_ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Course c = new Course();
        
        c.createCourse();
        
        System.out.println("Ganancias semanales:");
        
        System.out.println(c.weeklyEarnings());
        
    }
    
}
