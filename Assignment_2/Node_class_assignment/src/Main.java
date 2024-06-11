//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Node x = new Node(10);
        Node y = new Node(x);
        x.next = y;
        Node z = new Node(x);
        System.out.println(z);
    }
}