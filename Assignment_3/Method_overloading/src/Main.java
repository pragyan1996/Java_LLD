import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> li = List.of(1,2,3,4,5);
        Stream<Integer> s = li.stream();
        s.reduce(0,(count, ele)->{
            System.out.println(ele);
           return count++;
        });





    }
}