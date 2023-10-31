import java.util.Scanner;
class testArray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.print("The elements are : ");
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}