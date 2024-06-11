//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Student s = new Student();
//        s.name = "Pragyan";
//        s.age = 10;
//        s.display();
//        s.sayHello("Priya");
        Rectangle r = new Rectangle();
        r.height = 10;
        r.width = 20;
        r.p = new Point();
        r.p.x = 0;
        r.p.y = 0;
        System.out.println(r.getArea());
        Point p = r.getBottomRight(r.p);
        System.out.println(p.x + " " + p.y);

    }
}