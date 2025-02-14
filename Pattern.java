public class Pattern {
    static void printSquare(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printHollowSquare(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num; stars++) {
                if (row == 1 || row == num || stars == 1 || stars == num || row == stars || stars == num - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printRightTriangle(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printRightTriangleWithSpaces(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= row; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printPyramid(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printReverseRightTriangleWithSpaces(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars < row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= num - row + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printReversePyramid(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars < row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * num - 2 * row + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void printDiamond(int num) {
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row < num; row++) {
            for (int stars = 1; stars <= row; stars++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * (num - 1) - 2 * row + 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void printReverseRightTriangle(int num) {
    
        for (int row = 1; row <= num; row++) {
            for (int stars = 1; stars <= num - row + 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // printSquare(5);
        // printRightTriangle(5);
        // printReverseRightTriangle(5);
        // printRightTriangleWithSpaces(5);
        // printReverseRightTriangleWithSpaces(5);
        // printPyramid(5);
        // printReversePyramid(5);
        // printDiamond(5);
        printHollowSquare(12);

    }

}
