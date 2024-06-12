import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2); li.add(3); li.add(4);
        display(li);
    }
    static void display(Iterable list){
        for(Object data : list){
            System.out.println(data);
        }
    }
}
