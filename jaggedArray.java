import java.util.Scanner;
class jaggedArray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[][]=new int[3][];
        int c0=s.nextInt();
        int c1=s.nextInt();
        int c2=s.nextInt();
        arr[0]=new int[c0];
        arr[1]=new int[c1];
        arr[2]=new int[c2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("The jagged array is ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
}
}