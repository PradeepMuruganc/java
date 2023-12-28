
interface lambda_Expression {
    public void a(int b,int c);
}
class Lambdaa{
    public static void main(String[] args) {
        lambda_Expression l = (p1,p2)->{
            System.out.println(p1+p2);
        };
        l.a(5,6);
    }
        }

