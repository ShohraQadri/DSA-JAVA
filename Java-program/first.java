import java.util.Scanner;

public class first {
    public static void main(String[] arg) {
        // System.out.println("hello shohra qadri.");
        // print the simple intrest

        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter the principle");
        // int P = Sc.nextInt();
        // System.out.println("entre the Rate of Intrest");
        // int R = Sc.nextInt();
        // System.out.println("enter the time");
        // int T = Sc.nextInt();

        // int SI = P * R * T / 100;
        // System.out.println("result : " + SI);

        // *****************************************************
        // sum of two number

        // System.out.println("enter the first number");
        // int num1 = Sc.nextInt();
        // System.out.println("enter the second number");
        // int num2 = Sc.nextInt();
        // int sum = num1 + num2;
        // System.out.println("sum : " + sum);

        // *****************************************************

        // - Find area and perimeter of rectangle.

        // perimeter = (length+width)*2
        // Area = Length*Width

        // int l = Sc.nextInt();
        // int w = Sc.nextInt();

        // int p = (l + w) * 2;
        // int a = l * w;
        // System.out.println("peramiter : " + p);
        // System.out.println("Area : " + a);

        // Calculate total average and percentage of five subjects

        int first = Sc.nextInt();
        int second = Sc.nextInt();
        int thired = Sc.nextInt();
        int four = Sc.nextInt();
        int five = Sc.nextInt();

        int total = first + second + thired + four + five;
        System.out.println("total : " + total);

        int avg = total / 5;
        float per = ((float) total / 500) * 100;

        System.out.println("average : " + avg);
        System.out.println(per);
    }
}
