import java.util.Scanner;

public abstract class twodarraya {

    // 4 5
    // 1 2 3 4 5
    // 6 7 8 9 10
    // 11 12 13 14 15
    // 16 17 18 19 20

    // output

    // 1
    // 6 2
    // 11 7 3
    // 16 12 8 4
    // 17 13 9 5
    // 18 14 10
    // 19 15
    // 20

    public static void move(int R, int C, int arr[][], int col) {
        while (R >= 0 && C < col) {
            System.out.print(arr[R][C] + " ");
            R--;
            C++;
        }
        System.out.println();
    }

    /**
     * @param arg
     */
    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter the row size");
        // int row = Sc.nextInt();
        // System.out.println("enter the column");
        // int col = Sc.nextInt();
        // System.out.println("enter the element in array");
        // int arr[][] = new int[row][col];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // arr[i][j] = Sc.nextInt();
        // }
        // }

        // for (int i = 0; i < row; i++) {
        // int R = i;
        // int C = 0;
        // move(R, C, arr, col);
        // }
        // for (int j = 1; j < col; j++) {
        // int R = row - 1;
        // int C = j;
        // move(R, C, arr, col);
        // }

        // multipication of two array

        // 1 2 3 - - - 9 8 7 1*9+2*6+3*3 = 9+12+9 = 30
        // 4 5 6 - * - 6 5 4
        // 7 8 9 - - - 3 2 1

        // output
        // 30 24 18
        // 84 69 54
        // 138 114 90

        System.out.println("enter the size of array");
        int n = Sc.nextInt();

        System.out.println("enter the element in array");
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }
        System.out.println("enter the second array element in array");
        int arr1[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = Sc.nextInt();
            }
        }
        int arr2[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    arr2[i][j] += arr[i][k] * arr1[k][j];

                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
