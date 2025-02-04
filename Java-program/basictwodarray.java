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

        // int sumL = 0;
        // int sumR = 0;

        // for (int i = 0; i < col; i++) {
        // for (int j = 0; j < row; j++) {
        // if (i == j) {
        // sumL += myarr[i][j];
        // }
        // if ((i + j) == row - 1) {
        // sumR += myarr[i][j];
        // }
        // }

        // }
        // System.out.println(sumL);
        // System.out.println(sumR);

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // reverse the first row and last row
        // input 3 3
        // 1 2 3
        // 4 5 6
        // 7 8 9

        // output
        // 3 2 1
        // 4 5 6
        // 9 8 7

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
        // int j = 0;
        // for (int i = 0; i < row; i++) {
        // int temp = myarr[i][j];
        // myarr[i][j] = myarr[i][row - 1 - j];
        // myarr[i][row - 1 - j] = temp;

        // j++;
        // }

        // for (int i = 0; i < row; i++) {
        // for (j = 0; j < col; j++) {
        // System.out.print(myarr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // pritn the upper triangel in the array
        // input
        // 1 2 3 4
        // 5 6 7 8
        // 9 1 2 3
        // 4 5 6 7

        // output
        // 1 2 3 4
        // 6 7 8
        // 2 3
        // 7

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

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (i <= j) {
        // System.out.print(myarr[i][j] + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // pritn the lower triangel in the array
        // input
        // 1 2 3 4
        // 5 6 7 8
        // 9 1 2 3
        // 4 5 6 7

        // output
        // 1
        // 5 6
        // 9 1 2
        // 4 5 6 7

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

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (i >= j) {
        // System.out.print(myarr[i][j] + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // find sum of upper triangular matrix
        // input
        // 1 2 3 -----2 3
        // 4 5 6 -------6
        // 7 8 9

        // output
        // 11

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
        // int sum = 0;
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (i < j) {
        // sum = sum + myarr[i][j];
        // }
        // }
        // }
        // System.out.print(sum + " ");

        // first matrix
        // 1 2 3 - - - - - - - 1 2 3
        // 4 5 6 - - - + - - - 4 5 6
        // 7 8 9 - - - - - - - 7 8 9

        // out put
        // 2 4 6
        // 8 10 12
        // 14 16 18

        // add two matrix
        System.out.println("for matrix 1");
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
        System.out.println("for matrix two");
        System.out.println("enter the row number");
        int row1 = Sc.nextInt();
        System.out.println(("enetr the column number"));
        int col1 = Sc.nextInt();
        System.out.println("enter the element");
        int myarr1[][] = new int[row1][col1];
        int subarray[][] = new int[row][col];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                myarr1[i][j] = Sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                subarray[i][j] = myarr[i][j] + myarr[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(subarray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
