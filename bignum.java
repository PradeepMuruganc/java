public class bignum {
    static void compare(int a,int b){
        if(a>b){
            System.out.println(a+" is bigger.");
        }
        else if(a==b){
            System.out.println("Both are equal.");
        }
        else{
            System.out.println(b+" is bigger.");
        }
    }
    public static void main(String args[]){
        compare(45,66);
        compare(6,1);
        compare(7,7);
        compare(-9,0);
    }
}
