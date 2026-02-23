public class FullPyramid {
    public static void main(String[] args) {
        int rows = 5;
        char[] letters = {'A','B','C','D','E'};
        for (int i = 1; i <= rows; i++) {

            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 0; i < rows; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - i; j++) {
                System.out.print(letters[j] + " ");
            }

            System.out.println();
        }
    }
}