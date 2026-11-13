public class PrintX {
    public static void main(String[] args) {
        //PrintX.printX(5);
        //System.out.println();
        PrintX.checkerBoard(6);
    }
    public static void printX(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == i || j == size - i - 1) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void checkerBoard(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)  {
                if ((j + i) % 2 == 0) {
                    System.out.print("X");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
