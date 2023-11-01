import java.lang.String;
public class str_rev
{
    public static void main(String args[])
    {
        String str="123 456 789";
        aa:
        for(int i=0;i<11;i++)
        {
            char character = str.charAt(i);
            if(character==' ')
            {
                bb:
                for (int j = i - 1; j >= 0 || str.charAt(j)==' ';j--)
                {
                    if(j>0&&str.charAt(j)!=' '){
                    System.out.print(str.charAt(j));}
                    else if(j==0) {
                        System.out.print(str.charAt(j));
                        break bb;
                    }
                    else {
                        break bb;
                    }

                }
                System.out.print(" ");
            }
            else if(i==str.length()-1)
            {
                cc:
                for (int j = i; j >= 0;j--)
                {
                    if(str.charAt(j)!=' '){
                        System.out.print(str.charAt(j));}

                    else {
                        break cc;
                    }

                }

            }

        }
    }
}
