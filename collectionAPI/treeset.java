package collectionAPI;
import java.util.*;
public class treeset {
    public static void main(String[] args) {
        Collection<Integer> num = new TreeSet<Integer>();
        num.add(111);
        num.add(11);
        num.add(101);
        num.add(21);
        num.add(11);
        System.out.println(num);
        Iterator<Integer> n = num.iterator();
        while(n.hasNext())
        System.out.println(n.next());
    } 
}
