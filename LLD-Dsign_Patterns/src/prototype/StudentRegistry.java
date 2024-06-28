package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    Map<String, Student> hm = new HashMap<>();
    public void register(String key, Student student){
        hm.put(key, student);
    }

    public Student get(String key){
        return hm.get(key);
    }
}
