import java.util.Scanner;

public class komara {
    public boolean rev(int i) {
        int temp = 0, n = 0;
        while (i != 0) {
            n = i % 10;
            temp = (temp * 10) + n;
            i = i / 10;
        }
        if (prime(temp)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean prime(int i) {
        int count = 0;
        for (int j = 2; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 1) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int range, result = 0;
        range = s.nextInt();
        komara k = new komara();
        for (int i = 2; i < range; i++) {
            if (k.prime(i)) {
                if(k.rev(i)){
                    result = result + i;
                }
            } else {
                result = result + 0;
            }
        }
        System.out.println(result);
    }


}
