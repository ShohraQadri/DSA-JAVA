import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Integer type ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Values Add करना
        list.add(10);
        list.add(20);
        list.add(30);

        // Print ArrayList
        // Output: [10, 20, 30]
        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(list.size() - 1);
        System.out.println(list.get((list.size() - 1)));

    }
}
