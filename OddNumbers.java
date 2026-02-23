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
    }
}