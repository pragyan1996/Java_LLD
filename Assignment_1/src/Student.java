public class Student {
    int age;
    String name;

    void display(){
        System.out.println("My name is "+this.name + ". I am "+this.age + " years old.");
    }

    void sayHello(String name){
        System.out.println(this.name + " says hello to " +name);
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
}
