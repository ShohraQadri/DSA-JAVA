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

    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the row size");
        int row = Sc.nextInt();
        System.out.println("enter the column");
        int col = Sc.nextInt();
        System.out.println("enter the element in array");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int R = i;
            int C = 0;
            move(R, C, arr, col);
        }
        for (int j = 1; j < col; j++) {
            int R = row - 1;
            int C = j;
            move(R, C, arr, col);
        }
    }
}
