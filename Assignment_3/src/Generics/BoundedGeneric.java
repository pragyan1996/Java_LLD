package Generics;
class Animal{
    String name;
    public Animal(){}
    public Animal(String name){this.name = name;}
}

class Dog extends Animal{
    String hasFourLegs;

    public Dog(String hasFourLegs){
        this.hasFourLegs = hasFourLegs;
        this.name = "Dog";
    }
}

class BoundedGeneric<T extends Animal> {
    T animal;
    public BoundedGeneric(T t){
        animal = t;
    }
    public void printName(){
        System.out.println( this.animal.name);
    }
}

class Bird{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        Dog animal = new Dog("yes");
        System.out.println(animal.hasFourLegs + " " + animal.name);
        BoundedGeneric<Dog> bd = new BoundedGeneric<>(animal);
        bd.printName();

        Bird bird = new Bird();
        bird.setName("Pegion");

        BoundedGeneric<Bird> db2 = new BoundedGeneric<Bird>();
        db2.printName();

    }
}
