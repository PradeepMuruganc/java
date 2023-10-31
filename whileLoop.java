import java.util.Scanner;
class whileLoop{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        while(num>0){
            System.out.print(num);
            num--;
        }

    }
}