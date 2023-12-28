import java.util.*;
import java.util.List;

public class streamapi {
    public static void main(String[] args) {
        List<Integer>l=Arrays.asList(5,1,3,4,2);
        l.stream().sorted().forEach(n-> System.out.println(n-1));
    }
}
