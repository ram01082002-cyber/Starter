package comparater;
import java.util.*;
public class sortlist {
    public static void main(String[] args) {
        List<Integer> num = new LinkedList<>();
        num.add(229);
        num.add(27);
        num.add(12); 
        num.add(0);
        num.add(72);
        Collections.sort(num);
        System.out.println(num);
    }   
}