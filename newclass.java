import java.lang.String;
import java.util.Scanner;
public class newclass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        String [] words=name.split(" ");
        for (String i:words
             ) {
            System.out.println(i);
        }
        StringBuffer sb=new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);

    }
}
