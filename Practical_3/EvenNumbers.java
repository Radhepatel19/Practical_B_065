import java.util.ArrayList;

public class EvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> evenList = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
                sum += i;
            }
        }

        int min = evenList.get(0);
        int max = evenList.get(evenList.size() - 1);

        System.out.println("Even Numbers List: " + evenList);
        System.out.println("Minimum Even Number: " + min);
        System.out.println("Maximum Even Number: " + max);
        System.out.println("Sum of Even Numbers: " + sum);
    }
}
