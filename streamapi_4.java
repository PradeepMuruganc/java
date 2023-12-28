import java.util.ArrayList;
import java.util.List;

public class streamapi_4 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<Integer>();
        l.add(4);
        l.add(8);
        l.add(12);
        l.add(16);
        l.add(20);
        int data = l.stream().filter(n->n>15).reduce(0,(a,b)->a+b);
        System.out.println(data);

    }

}
