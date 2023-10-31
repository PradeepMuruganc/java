import java.util.Scanner;
class doWhile{
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       do{
        System.out.print(num);
        num--;
       } 
       while(num==0);
    }
}