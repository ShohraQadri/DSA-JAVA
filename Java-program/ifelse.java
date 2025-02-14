import java.util.Scanner;

public class ifelse {
    /**
     * @param arg
     */

    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = Sc.nextInt();

        // if (number > 0) {
        // System.out.println("number is positive " + number);
        // } else if (number < 0) {
        // System.out.println("number is negative " + number);
        // } else {
        // System.out.println("number is equal to Zero " + number);
        // }

        // ******************************************************

        // Program to check whether a number is divisible by 5 and 11 or not.
        // if (number % 5 == 0 || number % 11 == 0) {
        // System.out.println("number is divisible by 11 and 5 " + number);
        // } else {
        // System.out.println("not divisible " + number);
        // }

        // ******************************************************
        // Program to check whether a number is even or odd.

        // if (number % 2 == 0) {
        // System.out.println("number is even : " + number);
        // } else {
        // System.out.println("number is odd : " + number);
        // }

        // *******************************************************
        // Program to find sum of all even numbers between 1 to n

        // int sum = 0;
        // for (int i = 1; i <= number; i++) {
        // if (i % 2 == 0) {
        // sum = sum + i;

        // }
        // }
        // System.out.println("sum of all even number " + sum);

        // *******************************************************

        // Program to find sum of all odd numbers between 1 to n.

        // int sum = 0;
        // for (int i = 1; i <= number; i++) {
        // if (i % 2 != 0) {
        // sum = sum + i;
        // }
        // }
        // System.out.println("sum of all odd number " + sum);

        // *******************************************************

        // Question 4 - Enter week number and print day of the week
        // System.out.println("enter the week number");
        // int weeknumber = Sc.nextInt();

        // switch (weeknumber) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("tuesday");
        // break;
        // case 3:
        // System.out.println("wednesday");
        // break;
        // case 4:
        // System.out.println("thursday");
        // break;
        // case 5:
        // System.out.println("friday");
        // break;
        // case 6:
        // System.out.println("saturday");
        // break;
        // case 7:
        // System.out.println("sunday");
        // break;
        // default:
        // System.out.println("invalid number number range 1 to 7");
        // }

        // **********************************************************
        // Question 5 - Print multiplication table of a given number

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(number + " * " + i + " = " + number * i);
        // }

        // ***********************************************************

        // power of 2

        // class Solution {
        // public boolean isPowerOfTwo(int n) {
        // while (n % 2 == 0) {
        // n = n / 2;
        // }

        // return n == 1;
        // }
        // }

        // *******************************************
        // • Print all prime numbers from 1 to N.

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // If divisible, no need to check further
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

        // *************************************************

        // Calculate product of all digits

        // int product = 1;
        // for (int i = 1; i <= number; i++) {
        // int lastdigit = number % 10;
        // product = product * lastdigit;
        // number = number / 10;
        // }
        // System.out.println(product);

        // *********************************************************

        // • Print all factors of a number

        // for (int i = 1; i <= number; i++) {
        // if (number % i == 0) {
        // System.out.print(i + " ");
        // }
        // }

        // ***********************************************************8

        // • Print first and last digit of a number

        // int lastdigit = number % 10;
        // int firstdigit = number;
        // while (firstdigit >= 10) {
        // firstdigit = firstdigit / 10;

        // }
        // System.out.println("firstdigit " + firstdigit);
        // System.out.println("lastdigit " + lastdigit);

        // ********************************************************************

        // Program to check whether a number is Armstrong number or not

        // int copyofNumber = number;
        // int sum = 0;
        // while (copyofNumber > 0) {
        // int lastdigit = copyofNumber % 10;
        // sum = sum + lastdigit * lastdigit * lastdigit;
        // copyofNumber = copyofNumber / 10;
        // }

        // if (sum == number) {
        // System.out.println("number is armstrong " + number);
        // } else {
        // System.out.println("number is not armstrong " + number);
        // }

        // *************************************************************

        // Question 2 - Program to find Armstrong numbers between 1 to n

        // System.out.println("enter the starting number");
        // int start = Sc.nextInt();
        // System.out.println("ente rthe last number");
        // int last = Sc.nextInt();

        // for (int i = start; i <= last; i++) {
        // int number = i;
        // int sum = 0;
        // int copyofNumber = number;
        // while (copyofNumber > 0) {
        // int lastdigit = copyofNumber % 10;
        // sum = sum + lastdigit * lastdigit * lastdigit;
        // copyofNumber = copyofNumber / 10;
        // }
        // if (sum == number) {
        // System.out.print(number + " ");
        // }
        // }
        // System.out.println();

        // ************************************************************

        // Question 3 - Program to find prime factors of a number

        // for (int i = 1; i <= number; i++) {
        // if (number % i == 0 && isPrime(i) == true) {
        // System.out.print(i + " ");
        // }
        // }
        // System.out.println();

        // *************************************************************

        // Print fibonacci series upto n terms

        // int firstnumber = 0;
        // int secondnumber = 1;
        // number = number - 2;
        // System.out.print(firstnumber + " " + secondnumber + " ");

        // while (number > 0) {
        // int thirednumber = firstnumber + secondnumber;
        // System.out.print(thirednumber + " ");
        // firstnumber = secondnumber;
        // secondnumber = thirednumber;
        // number--;
        // }

        // ********************************************************

        // Convert number from Binary to Decimal

        // int sum = 0;
        // int power = 1;
        // while (number > 0) {
        // int lastdigit = number % 10;
        // sum = sum + lastdigit * power;
        // power = power * 2;
        // number = number / 10;
        // }
        // System.out.println(sum);
    }

    // ************************************************************
    // second part of question 3 function
    // Question 3 - Program to find prime factors of a number

    // public static boolean isPrime(int number) {
    // int count = 0;
    // for (int i = 1; i <= number; i++) {
    // if (number % i == 0) {
    // count++;
    // }

    // }
    // if (count == 2) {
    // return true;
    // } else {
    // return false;
    // }

    // ++++++++++++++++++++++++++++++++++++++===
    // given number is prime or not

}
