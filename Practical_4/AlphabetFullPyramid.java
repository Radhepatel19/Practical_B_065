public class AlphabetFullPyramid {
    public static void main(String[] args) {

        char[] letters = {'A','B','C','D','E'};
        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows - i; j++) {
                System.out.print(letters[j] + " ");
            }

            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {

            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
