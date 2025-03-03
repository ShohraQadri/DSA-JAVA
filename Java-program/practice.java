import java.util.Scanner;

public class practice {

    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter the row size");
        // int row = Sc.nextInt();
        // System.out.println("enter the column size");
        // int col = Sc.nextInt();

        // int arr[][] = new int[row][col];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.println("enter the element");
        // arr[i][j] = Sc.nextInt();
        // }
        // }
        // System.out.println("your output is:");
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // int sum = i + j;
        // System.out.print(sum + " ");
        // }
        // System.out.println();
        // }

        // *********************************
        // find minimum and maximum number
        // input [1,2,3,4,5,6,7]
        // output [maximum - 7, minimum - 1]
        // System.out.println("enter the size of array");
        // int number = Sc.nextInt();
        // int arr[] = new int[number];
        // for (int i = 0; i < number; i++) {
        // System.out.println("enter the element");
        // arr[i] = Sc.nextInt();
        // }
        // int maximum = arr[0];
        // int minimum = arr[0];
        // for (int i = 0; i < number; i++) {
        // if (arr[i] >= maximum) {
        // maximum = arr[i];
        // } else if (arr[i] <= minimum) {
        // minimum = arr[i];
        // }
        // }
        // System.out.println("ther maximum element is : " + maximum);
        // System.out.println("minimum element is : " + minimum);

        // +++++++++++++++++++++++++++++++++++++++++++++++

        // sum of middle line
        // 1 2 3
        // 4 5 6 - - - 1+5+9= 15
        // 7 8 9

        // System.out.println("enter the row size");
        // int row = Sc.nextInt();
        // System.out.println("enter the column size");
        // int col = Sc.nextInt();

        // int arr[][] = new int[row][col];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.println("enter the element");
        // arr[i][j] = Sc.nextInt();
        // }
        // }
        // System.out.println("your output is:");
        // int sum = 0;
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (i == j) {
        // sum += arr[i][j];
        // }
        // }
        // }
        // System.out.println("answer: " + sum);

        // System.out.println("enter the number");
        // int number = Sc.nextInt();

        // for (int i = number; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // output 6
        // add the first row element
        // 1 2 3 - - -6
        // 4 5 6
        // 7 8 9

        // System.out.println("enter the row size");
        // int row = Sc.nextInt();
        // System.out.println("enter the column size");
        // int col = Sc.nextInt();
        // int arr1[][] = new int[row][col];

        // System.out.println("enter the elements");
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // arr1[i][j] = Sc.nextInt();
        // }
        // }

        // int sum = 0;
        // for (int j = 0; j < col; j++) {
        // sum += arr1[0][j];
        // }
        // System.out.println("first row elsement sum is: " + sum);

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // reverse string
        // input HELLO
        // OLLEH

        // System.out.println("enter the string");
        // String s = Sc.nextLine();

        // char[] charArray = s.toCharArray();

        // int i = 0;
        // int j = charArray.length - 1;

        // while (i < j) {
        // char temp = charArray[i];
        // charArray[i] = charArray[j];
        // charArray[j] = temp;
        // i++;
        // j--;
        // }

        // String reversedString = new String(charArray);
        // System.out.println("Reversed string: " + reversedString);
        // input the 5
        // out put
        // ----*
        // ---* *
        // --* * *
        // -* * * *
        // * * * * *

        // System.out.println("enter the row size");
        // int number = Sc.nextInt();
        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= number - i; j++) {

        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++=
        // ----*
        // ---***
        // --*****
        // -*******
        // *********
        System.out.println("enter the row size");
        int number = Sc.nextInt();

        int star = 1;
        int space = number - 1;
        // create space
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // print start
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            space = space - 1;
            star = star + 2;
            System.out.println();
        }

        Sc.close();
    }
}
