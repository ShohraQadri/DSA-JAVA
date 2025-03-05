import java.util.ArrayList;
import java.util.List;

public class Paascaltriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstrow = new ArrayList<>();

        firstrow.add(1);

        answer.add(new ArrayList<>(firstrow));

        int middleelement = 0;

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentrow = new ArrayList<>();
            currentrow.add(1);

            // middle element
            for (int j = 1; j <= middleelement; j++) {
                int element = answer.get(i - 1).get(j) + answer.get(i - 1).get(j - 1);

                currentrow.add(element);
            }
            currentrow.add(1);
            answer.add(new ArrayList<>(currentrow));
            middleelement++;

        }
        return answer;
    }
}
