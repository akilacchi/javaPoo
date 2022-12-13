package guia7_ej13;

import java.util.Scanner;

public class Course {

    private String courseName, shift;
    private int hoursADay, daysAWeek, salaryHour;
    private String[] students = new String[5];

    public Scanner scan = new Scanner(System.in);

    public Course() {
    }

    public Course(String courseName, String shift, int hoursADay, int daysAWeek, int salaryHour) {
        this.courseName = courseName;
        this.shift = shift;
        this.hoursADay = hoursADay;
        this.daysAWeek = daysAWeek;
        this.salaryHour = salaryHour;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getHoursADay() {
        return hoursADay;
    }

    public void setHoursADay(int hoursADay) {
        this.hoursADay = hoursADay;
    }

    public int getDaysAWeek() {
        return daysAWeek;
    }

    public void setDaysAWeek(int daysAWeek) {
        this.daysAWeek = daysAWeek;
    }

    public int getSalaryHour() {
        return salaryHour;
    }

    public void setSalaryHour(int salaryHour) {
        this.salaryHour = salaryHour;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    public void loadStudents() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre del alumno número " + (i + 1));
            students[i] = scan.next();
        }
    }

    public void createCourse() {
        
        System.out.println("Ingrese nombre del curso");
        courseName = scan.next();
        loadStudents();
        System.out.println("Ingrese la cantidad de horas al día.");
        hoursADay = scan.nextInt();
        System.out.println("Ingrese la cantidad de días a la semana.");
        daysAWeek = scan.nextInt();
        System.out.println("Ingrese tipo de turno");
        shift = scan.next();
        System.out.println("Ingrese precio por hora");
        salaryHour= scan.nextInt();
    }
    
    public int weeklyEarnings(){
        
        return daysAWeek*salaryHour*hoursADay*5;
        
    }

}
