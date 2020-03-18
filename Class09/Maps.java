package Class09;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String args[]){
        Map<String, String> roll = new HashMap<>();
        roll.put("Student00", "Ze");
        roll.put("Student01", "Bah");
        roll.put("Student02", "John");
        roll.put("Student03", "John");

        System.out.println(roll.get("Student00"));

        for (String key: roll.keySet()) {
            String value = roll.get(key);
            System.out.println(value);
        }

    }
}
