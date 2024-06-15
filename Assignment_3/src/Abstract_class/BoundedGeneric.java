package Abstract_class;

class Student<T extends User>{
    T name;
    Student(T name){
        this.name = name;
    }
}

class User{
    public String name;
}

class Pragyan extends User{
    public int num = 20;
}

class Vikas{
    public int num = 30;
}

public class BoundedGeneric {
    public static void main(String[] args) {
        User user = new User();
        Pragyan pr = new Pragyan();
        Vikas v = new Vikas();
        Student<User> stud = new Student<>(user);
        Student<Pragyan> pragy = new Student<>(pr);
//        Student<Vikas> vk = new Student<>(v);
    }
}
