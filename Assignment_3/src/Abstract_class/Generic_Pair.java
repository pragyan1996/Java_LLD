package Abstract_class;

class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K first, V second){
        this.key = first;
        this.value = second;
    }

    public V getValue() {
        System.out.println(value);
        return value;
    }

    public K getKey() {
        System.out.println(key);
        return key;
    }
}

public class Generic_Pair {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(1, "Pragyan");
        Integer key = pair.getKey();
        String value = pair.getValue();

        System.out.println(key + " " +value);
    }
}
