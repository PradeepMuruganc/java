import java.util.Scanner;
class multilply_matrix{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int m=s.nextInt();
        int n=s.nextInt();
        int arr1[][]=new int[m][n];
        System.out.print("Enter the elements of matrix 1 : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        int arr2[][]=new int[m][n];
        System.out.print("Enter the elements of matrix 2 : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        int res[][]=new int[m][n];
        System.out.println("The resultant matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<n;k++)
                {
                    res[i][j]=res[i][j]+arr1[i][j]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}