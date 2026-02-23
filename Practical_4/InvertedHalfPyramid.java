public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int rows = 6;
        int num = 1;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;

                if (num == 10)
                    num = 1;
            }

            System.out.println();
        }
    }
}