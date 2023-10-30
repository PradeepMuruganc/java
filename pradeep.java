import java.util.Scanner;
class pradeep{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=s.nextInt();
        System.out.println("enter the value of b");
        int b=s.nextInt();
        if(a<b)
        {
            if(a<5)
            {
                System.out.println("a is smaller than 5");
            }
            else if(a==5)
            {
                System.out.println("a is equal to 5");
            }
            else
            {
                System.out.println("a is greater than 5");
            }
        }
        else
        {
            System.out.println("a is greater than b");
        }
    }
}