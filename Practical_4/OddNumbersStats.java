import java.util.ArrayList;

public class OddNumbersStats {
    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
                sum += i;
            }
        }

        System.out.println("Odd Numbers List: " + oddList);

        System.out.println("Three Minimum Odd Numbers: "
                + oddList.get(0) + ", "
                + oddList.get(1) + ", "
                + oddList.get(2));

        int size = oddList.size();

        System.out.println("Three Maximum Odd Numbers: "
                + oddList.get(size - 1) + ", "
                + oddList.get(size - 2) + ", "
                + oddList.get(size - 3));

        double average = (double) sum / oddList.size();

        System.out.println("Average of Odd Numbers (1–50): " + average);

        System.out.println("List of Odd Numbers:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\n\nMinimum Odd Number: 1");
        System.out.println("Maximum Odd Number: 99");
        System.out.println("Total Sum: " + sum);
    }
}
