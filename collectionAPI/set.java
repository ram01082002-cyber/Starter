package collectionAPI;
import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        num.add(10);
        num.add(30);
        num.add(60);
        num.add(50);
        num.add(50);                //no duplication in hashset
        System.out.println(num);
        for(int n : num)
            System.out.println(n);
    }
}