import java.util.Scanner;

public class fun {
    // add two number function
    public static int sum(int num1, int num2) {
        return (num1 + num2);
    }

    // number is prime or not
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
    // number is armstrong or not

    public static boolean isArmstrong(int number) {
        int copyofnumber = number;
        int sum = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            sum = sum + lastdigit * lastdigit * lastdigit;
            number = number / 10;
        }
        if (sum == copyofnumber) {
            return true;
        }
        return false;
    }

    // given the range and print the even number;
    public static boolean isprime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void printprime(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isprime(i) == true) {
                System.out.println(i + " ");
            }
        }
    }

    // print ncr factorial

    public static long factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] arg) {

        // // sum of two number

        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter the first number");
        // int num1 = Sc.nextInt();
        // System.out.println("enter the second number");
        // int num2 = Sc.nextInt();
        // int answer = sum(num1, num2);
        // System.out.println("sum is : " + answer);

        // ****************************************************************

        // even number

        // System.out.println("enter the number");
        // int number = Sc.nextInt();
        // System.out.println(isEven(number));

        // *************************************************************

        // number is armstrong or not

        // System.out.println("enter the number");
        // int number = Sc.nextInt();
        // for (int i = 1; i <= number; i++) {
        // if (isArmstrong(i) == true) {
        // System.out.println(i);
        // }
        // }

        // find prime numbers in given range using functions

        // System.out.println("enter the lower limit");
        // int start = Sc.nextInt();
        // System.out.println("enter the end limit");
        // int end = Sc.nextInt();
        // printprime(start, end);

        System.out.println("enter the number of n");
        int n = Sc.nextInt();
        System.out.println("enter the number of r");
        int r = Sc.nextInt();

        long n_factorial = factorial(n);
        long r_factorial = factorial(r);
        long nR_factorial = factorial(n - r);
        long answer = n_factorial / r_factorial;
        answer = answer / nR_factorial;
        System.out.println(answer);
    }

}
