package pattern;

public class pat15 {
    public static void main(String[] args) {
        int size = 6;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2; col++) {
                if ((row == 0 && (col % (size / 2) != 0)) ||
                        (row == 1 && (col % (size / 2) == 0)) ||
                        (row - col == 2) ||
                        (row + col == size * 2 - 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
