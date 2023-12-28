import java.util.*;
public class duplicate_elements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int temp=0;
        int num=s.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i]==arr[j]){
                    temp++;
                }
            }
        }
    }

}
