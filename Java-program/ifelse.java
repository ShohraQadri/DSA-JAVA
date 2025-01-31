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

        // for (int i = 2; i <= number; i++) {
        // boolean isPrime = true;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // isPrime = false;
        // break; // If divisible, no need to check further
        // }
        // }

        // if (isPrime) {
        // System.out.print(i + " ");
        // }
        // }

        // *************************************************

        // Calculate product of all digits

        // int product = 1;
        // for (int i = 1; i <= number; i++) {
        // int lastdigit = number % 10;
        // product = product * lastdigit;
        // number = number / 10;
        // }
        // System.out.println(product);
    }
}
