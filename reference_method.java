import javax.swing.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class reference_method {
       void a(Object n){

         System.out.println(n);
     }
}
class b{
    public static void main(String[] args) {

        Stream.of(Arrays.asList(1,2,3,4)).forEach(System.out::println);
;    }
}
