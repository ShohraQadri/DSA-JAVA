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

        // int n = 5;
        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(n);
        // }
        // System.out.println();
        // n--;
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // for (int i = number; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // 1 2 3 4 5 6
        // 2 3 4 5 6
        // 3 4 5 6
        // 4 5 6
        // 5 6
        // 6

        // for (int i = 1; i <= number; i++) {
        // for (int j = i; j <= number; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // 1-------1
        // -2-----2
        // --3---3
        // ---4-4
        // ----5
        // ---4-4
        // --3---3
        // -2-----2
        // 1-------1

        // int leftspace = 0;
        // int middlespace = 1 + (number - 2) * 2;

        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= leftspace; j++) {
        // System.out.print(" ");
        // }
        // System.out.print(i);

        // for (int j = 1; j <= middlespace; j++) {
        // System.out.print(" ");
        // }
        // if (i != number)
        // System.out.print(i);
        // leftspace = leftspace + 1;
        // middlespace = middlespace - 2;
        // System.out.println();
        // }
        // // lowe part
        // leftspace = number - 2;
        // middlespace = 1;
        // for (int i = number - 1; i >= 1; i--) {
        // for (int j = 1; j <= leftspace; j++) {
        // System.out.print(" ");
        // }
        // System.out.print(i);

        // for (int j = 1; j <= middlespace; j++) {
        // System.out.print(" ");
        // }

        // System.out.print(i);
        // leftspace = leftspace - 1;
        // middlespace = middlespace + 2;
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++

        // ----*****
        // ---*---*
        // --*---*
        // -*---*
        // *****

        // int space = number - 1;
        // for (int i = 1; i <= number; i++) {
        // for (int j = 1; j <= space; j++) {
        // System.out.print(" ");
        // }
        // if (i == 1 || i == number) {
        // for (int j = 1; j <= number; j++) {
        // System.out.print("*");
        // }
        // } else {
        // System.out.print("*");
        // for (int j = 1; j <= number - 2; j++) {
        // System.out.print(" ");
        // }

        // System.out.print("*");
        // }
        // space = space - 1;
        // System.out.println();
        // }

        // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        // **********
        // ****--****
        // ***----***
        // **------**
        // *--------*
        // *--------*
        // **------**
        // ***----***
        // ****--****
        // **********

        int star = number;
        int space = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            star = star - 1;
            space = space + 2;
            System.out.println();
        }

        // lower part

        space = space - 2;
        star = star + 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            star = star + 1;
            space = space - 2;
            System.out.println();
        }
    }

}
