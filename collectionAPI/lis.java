package collectionAPI;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lis {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(4);
        System.out.println(num);
        System.out.println(num.get(3));
        System.out.println(num.indexOf(30));
        for(int n : num)
        System.out.println(n);
    }
}
