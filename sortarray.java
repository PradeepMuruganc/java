import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        Arrays.parallelSort(arr,0,4);
        for(int i:arr) {
            System.out.print(i);
        }
    }
}
