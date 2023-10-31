import java.util.Scanner;
class arraySort{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int temp=0;
        int num=s.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("The sorted array is ");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}