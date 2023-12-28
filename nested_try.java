import org.w3c.dom.ls.LSOutput;

public class nested_try {
    public static void main(String[] args) {
        try{
            try{
                int arr[]=new int[10];
                System.out.println(arr[100]);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println(e);
            }

            try{
                int a=9/0;
            }
            catch(IndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Pradiiiii :)");
    }


}
