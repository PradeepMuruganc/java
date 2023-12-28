public class multiple_exception {
    public static void main(String[] args) {
        try{
            int arr[]=new int[10];
            System.out.println(arr[15]);
            int a=5/0;

        }
        catch (ArithmeticException e ){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("ThankYou");
    }
}
