import java.util.*;
public class stack_ {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        s.pop();
        i = s.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
            System.out.println();
            s.pop();
            i = s.iterator();
            while (i.hasNext()) {
                System.out.print(i.next() + " ");}
            }
        }

