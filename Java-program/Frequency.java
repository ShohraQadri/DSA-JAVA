import java.util.Scanner;

public class Frequency {
    public static void main(String[] arg) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int number = Sc.nextInt();

        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("enter element");
            arr[i] = Sc.nextInt();
        }

        // step 1
        int maximum = arr[0];
        for (int i = 0; i < number; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        // size of frequency array
        int size = maximum + 1;

        // create frequency array

        int fre[] = new int[size];
        for (int i = 0; i < number; i++) {
            fre[arr[i]]++; // Increment frequency count
        }
        for (int i = 0; i < size; i++) {
            if (fre[i] > 0) {
                System.out.println(i + "-->" + fre[arr[i]]);
            }
        }
    }
}
