package streamAPI;

import java.util.*;
import java.util.function.*;

public class filwork {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,5,3,8,2,6);
        Predicate<Integer> pre = new Predicate<Integer>() {
            public boolean test(Integer n)
            {
              if(n%2==0)
                return true;
            else
                return false;
            }
        };
        System.out.println(pre.test(5));
    }   
}