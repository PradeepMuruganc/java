import java.util.*;
import java.lang.String;
public class optional_class {
    public static void main(String[] args) {
        String arr[]=new String[5];
        Optional<String>o=Optional.ofNullable(arr[3]);
//        System.out.println(arr[3].toLowerCase());
        if(o.isPresent()){
            System.out.println(arr[3].toLowerCase());
        }
        else{
            System.out.println("Value not found");
        }
    }
}
