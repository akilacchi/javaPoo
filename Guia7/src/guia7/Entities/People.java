package guia7.Entities;

public class People {

    public String name;
    public int age;
    public char gender;

    public People() {
    }

    public People(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public People(String name) {
        this.name = name;
    }

    public People(int age) {
        this.age = age;
    }

    public People(char gender) {
        this.gender = gender;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }

    
    
}
