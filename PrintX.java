//
//  Class author:  Leo Brennan
//  Date created:  10/28/26
//  General description: bunch of methods that create patterns with loops. this is used for practicing loops
//
public class PrintX {
    public static void main(String[] args) {
        PrintX.printX(5);
        System.out.println();
        PrintX.checkerBoard(5);
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
