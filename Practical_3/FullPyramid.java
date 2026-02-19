public class FullPyramid {
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
    }
}
