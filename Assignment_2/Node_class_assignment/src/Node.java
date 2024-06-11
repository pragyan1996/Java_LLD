public class Node {
    int x;
    Node next;
    Node(int x){
        this.x = x;
        this.next = null;
    }
    Node (Node x){
        this.x = x.x;
        if(x.next == null) this.next = null;
        else{
            this.next = new Node(x.next);
        }
    }
}
