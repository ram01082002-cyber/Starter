package collectionAPI;
import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<String,Integer> std = new Hashtable<>();
        std.put("Ram",100);
        std.put("Raj", 89);
        std.put("Rake", 79);
        std.put("Ramu", 99);
        std.put("Ram", 10);
        System.out.println(std);
        System.out.println(std.get("Ram"));
        System.out.println(std.get(79));
        System.out.println(std.keySet());
        for(String s: std.keySet())
        System.out.println(s+":"+std.get(s));
    }   
}