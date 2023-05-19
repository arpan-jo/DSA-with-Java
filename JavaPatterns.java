public class JavaPatterns {
    public static void hollowRec(int totRows, int totCols) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void halfPyramidNum(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totRows - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int totRows) {
        int counter = 1;
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int totRows) {
        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= i; j++) {
                boolean isEven = ((i + j) % 2) == 0;
                if (isEven) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollowRec(5, 5);
        // halfPyramidNum(4);
        // floydsTriangle(5);
        zeroOneTriangle(5);

    }

}
