import java.util.*;
public class tree_set {
    public static void main(String[] args) {
        TreeSet<String>hs=new TreeSet<String>();
        hs.add("k");
        hs.add("y");
        hs.add("z");
        hs.add("b");
        hs.add("k");
        hs.add("a");
        Iterator<String>i=hs.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

    }
}
