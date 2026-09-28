package streamAPI;
import java.util.*;
import java.util.stream.Stream;

public class strm {
      public static void main(String[] args) {
        List<Integer> num = Arrays.asList(10,5,3,8,2,6);
       /*   Stream<Integer> s1 = num.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int res = s3.reduce(0,(c,e) -> c+e );
        System.out.println(res);*/
        int result = num .stream().filter(n-> n%2==0).map(n -> n*2).reduce(0,(c,e) -> c+e );
        System.out.println(result);
}
}