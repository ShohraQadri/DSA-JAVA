import java.util.Scanner;

public class loops {
    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("entre the row");
        int number = Sc.nextInt();

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.err.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= number; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // * * * * *
        // - * * * * *
        // - - * * * * *
        // - - - * * * * *
        // - - - - * * * * *

        // int space = 0;
        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= number; j++) {
        // System.out.print("* ");

        // }
        // System.out.println();
        // space = space + 1;
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // ----*
        // ---***
        // --*****
        // -*******
        // *********
        // -*******
        // --*****
        // --***
        // ---*

        // upper part
        // int space = number - 1;
        // int star = 1;
        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // space = space - 1;
        // star = star + 2;
        // System.out.println();

        // }

        // // lower part

        // star = star - 4;
        // space = 1;

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= star; j++) {
        // System.out.print("*");
        // }
        // space = space + 1;
        // star = star - 2;
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // 1
        // 12
        // 123
        // 1234
        // 12345

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=

        // 1
        // 22
        // 333
        // 4444
        // 55555

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++

        // 1
        // 21
        // 321
        // 4321
        // 54321

        // for (int i = 1; i <= number; i++) {
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++

        int n = 5;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            System.out.println();
            n--;
        }
    }

}
