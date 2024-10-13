public class EqualSignFigure {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == 0 || j == columns - 1) {
                    // First and last columns have missing equal signs at the beginning and end
                    if (i == 0 || i == rows - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("=");
                    }
                } else {
                    // Middle columns have equal signs with spaces between them
                    if (i == 0 || i == rows - 1) {
                        System.out.print("=");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}