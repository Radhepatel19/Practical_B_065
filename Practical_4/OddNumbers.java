import java.util.ArrayList;

public class OddNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> oddList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddList.add(i);
                sum += i;
            }
        }

        System.out.println("List of Odd Numbers: " + oddList);
        System.out.println("Minimum Odd Number: " + oddList.get(0));
        System.out.println("Maximum Odd Number: " + oddList.get(oddList.size() - 1));
        System.out.println("Total Sum of Odd Numbers: " + sum);

        ArrayList<Integer> oddList1 = new ArrayList<>();
        int sum1 = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddList1.add(i);
                sum1 += i;
            }
        }

        System.out.println("Odd Numbers List: " + oddList1);

        System.out.println("Three Minimum Odd Numbers: "
                + oddList1.get(0) + ", "
                + oddList1.get(1) + ", "
                + oddList1.get(2));

        int size = oddList1.size();

        System.out.println("Three Maximum Odd Numbers: "
                + oddList1.get(size - 1) + ", "
                + oddList1.get(size - 2) + ", "
                + oddList1.get(size - 3));

        double average = (double) sum1 / oddList1.size();

        System.out.println("Average of Odd Numbers (1–50): " + average);
    }
}