import java.util.Scanner;

public class arrays {

    public static boolean istargetpresent(int target, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // normal print the element in array
    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter rthe size of array");
        int number = Sc.nextInt();
        // int arr[] = new int[number];

        // for (int i = 0; i < number; i++) {
        // System.out.println("enter the element int the array");
        // arr[i] = Sc.nextInt();
        // }
        // for (int i = 0; i <= number; i++) {
        // System.out.print(arr[i] + " ");
        // }

        System.out.println("enter the target value");
        int target = Sc.nextInt();
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("enter the element size");
            arr[i] = Sc.nextInt();
        }
        if (istargetpresent(target, arr) == true) {
            System.out.println("target value is present");
        } else {
            System.out.println("target value is not present");
        }
    }
}
