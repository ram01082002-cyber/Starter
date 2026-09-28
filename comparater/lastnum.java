package comparater;

import java.util.*;
public class lastnum {
     public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i,Integer j)
            {
                if(i%10>j%10)
                    return 1;
                else 
                    return -1;
            }
        };
        List<Integer> num = new LinkedList<>();
        num.add(229);
        num.add(27);
        num.add(12); 
        num.add(0);
        num.add(72);
        Collections.sort(num,com);
        System.out.println(num);
    }   
    
}
