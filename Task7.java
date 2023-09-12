package Mirea.lab1;
import java.math.BigInteger;
import java.util.Scanner;

public class Task7 {
    public static BigInteger get_factorial(int f){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main (String args[]) {
        java.util.Scanner in = new java.util.Scanner(System.in, "ibm866");
        int f = in.nextInt();
        while (f <= 0||f > 999){
            System.out.print("Я не буду это считать");
            f = in.nextInt();
        }
        in.close();
        System.out.println("Ваш факториал " + get_factorial(f));
    }
}
