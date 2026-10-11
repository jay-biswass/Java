package Collection_Framework;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface {
    static void main(String[] args) {
        Map<String, String> mapping = new HashMap<>();

//        Insertion
        mapping.put("in", "India");
        mapping.put("pak", "Pakistan");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "Brazil");
        System.out.println(table);

        table.putAll(mapping);
        System.out.println(table);

//        Deletion

        table.remove("en");
        System.out.println(table);

        System.out.println("Size: "+table.size());

//        table.clear();
//        System.out.println("Size after clear: "+table.size());

        table.putIfAbsent("bh", "Bharat");
        System.out.println(table);

        System.out.println("get: "+table.get("bh"));

        System.out.println("getOrDefault: "+table.getOrDefault("usa","NONE"));

        System.out.println("containsKey: "+table.containsKey("in"));
        System.out.println("containsValue: "+table.containsValue("Russia"));

        System.out.println("Before replace: "+table);
        table.replace("in","Indonesia");
        System.out.println("After replace: "+table);

        Set<String> keySet = table.keySet();
        System.out.println("Keyset: "+keySet);

        Collection<String> valueSet = table.values();
        System.out.println("Valueset: "+valueSet);

        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("entrySet: "+entrySet);

//        Iteration




    }
}
