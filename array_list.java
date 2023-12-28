import java.util.ArrayList;
import java.io.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<Integer>();

        for(int i=1;i<=5;i++){
            a.add(10*i);
        }
        System.out.println(a);
        a.add(60);
        System.out.println(a);
        for(int i=0;i<a.size();i++) {
            System.out.print(a.get(i)+" ");
        }
    }
}

