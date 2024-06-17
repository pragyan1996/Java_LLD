package Generics;
class Box<T>{
    private T t;
    public Box(T t){
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
public class UnderstandingGenerics {
    public static void main(String[] args) {
        Box<String> b = new Box<>("Pragyan");

        System.out.println(b.getT());

    }
}
