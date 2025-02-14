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

        System.out.println("enter the row size");
        int row = Sc.nextInt();
        System.out.println("enter the column size");
        int col = Sc.nextInt();

        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter the element");
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("your output is:");
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("answer: " + sum);

        Sc.close();
    }
}
