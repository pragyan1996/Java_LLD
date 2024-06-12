package Interfaces;

interface Myinterface{
    public void myMethod();
}
class Test implements Myinterface{
    public void myMethod(){
        System.out.println("Hello from the interface");
    }
}
interface Profession{
    public void profession();
}

class Teacher implements Profession{
    public void profession(){
        System.out.println("I am a teacher.");
    }
}

class Engineer implements Profession{
    public void profession(){
        System.out.println("I am an engineer.");
    }
}
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.myMethod();

        Profession p1 = new Engineer();
        Profession p2 = new Teacher();
        p1.profession();
        p2.profession();
    }
}
