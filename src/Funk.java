
import java.math.BigInteger;
import java.util.Scanner;

public class Funk {
    public static void main(String[] args) {
        int k;
        Scanner in=new Scanner(System.in);
        System.out.print("Input a number: ");
        int n=in.nextInt();
        k=fib(n);
        System.out.println(k);
        int num0=0;
        int num1=1;
        int num2;
        System.out.print(num0+" "+ num1+" ");
        for(int i=3;i<=n;i++)
        {
            num2=num0+num1;
            System.out.print(num2+" ");
            num0=num1;
            num1=num2;
        }
        in.close();
    }
    public static int fib(int i) {
        if (i <= 1)
            return 0;
        else if (i == 2)
            return 1;
        else
            return fib(i - 1) + fib(i - 2);
    }
}


