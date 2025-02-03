import java.util.Scanner;

public class basictwodarray {
    public static void main(String[] arg) {

        // input[3][3]
        // 1 2 3
        // 4 5 6
        // 7 8 9

        // basic 2d array print
        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter the number of row");
        // int row = Sc.nextInt();
        // System.out.println("enter the column of array");
        // int col = Sc.nextInt();

        // System.out.println("enter the element");
        // int myarr[][] = new int[row][col];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // myarr[i][j] = Sc.nextInt();
        // }
        // }
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(myarr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // second question is print the row into col and col into row

        // input[3][3]
        // 1 4 7
        // 2 5 8
        // 3 6 9

        // System.out.println("enter the row number");
        // int row = Sc.nextInt();
        // System.out.println(("enetr the column number"));
        // int col = Sc.nextInt();

        // int myarr[][] = new int[row][col];

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // myarr[i][j] = Sc.nextInt();
        // }
        // }
        // for (int j = 0; j < col; j++) {
        // for (int i = 0; i < row; i++) {
        // System.out.print(myarr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // input[3][3]
        // sum of row and column
        // 6
        // 15
        // 24
        // sum of column wise
        // 12
        // 15
        // 18

        // System.out.println("enter the row number");
        // int row = Sc.nextInt();
        // System.out.println(("enetr the column number"));
        // int col = Sc.nextInt();
        // System.out.println("enter the element");
        // int myarr[][] = new int[row][col];

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // myarr[i][j] = Sc.nextInt();
        // }
        // }
        // System.out.println("sum of row wise");
        // for (int i = 0; i < col; i++) {
        // int sum = 0;
        // for (int j = 0; j < row; j++) {
        // sum += myarr[i][j];

        // }
        // System.out.println(sum);
        // }
        // System.out.println("sum of column wise");
        // for (int j = 0; j < col; j++) {
        // int sum = 0;
        // for (int i = 0; i < row; i++) {
        // sum += myarr[i][j];
        // }
        // System.out.println(sum);
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // sum of right and left diongnal

        // input [3][3]
        // 1 2 3 left-D 1+5+9 = 15
        // 4 5 6 right-D 7+5+3 = 15
        // 7 8 9

        // output
        // 15
        // 15

        System.out.println("enter the row number");
        int row = Sc.nextInt();
        System.out.println(("enetr the column number"));
        int col = Sc.nextInt();
        System.out.println("enter the element");
        int myarr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                myarr[i][j] = Sc.nextInt();
            }
        }

        int sumL = 0;
        int sumR = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    sumL += myarr[i][j];
                }
                if ((i + j) == row - 1) {
                    sumR += myarr[i][j];
                }
            }

        }
        System.out.println(sumL);
        System.out.println(sumR);

    }
}
