import java.lang.String;
public class bufferexample {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Pradeep");
        a.append("Murugan");
        System.out.println(a);
        a.delete(1,3);
        System.out.println(a);
        a.insert(3,"AAA");
        System.out.println(a);
        a.reverse();
        System.out.println(a);
    }
}
