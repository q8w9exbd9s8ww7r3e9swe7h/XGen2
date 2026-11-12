//
//  Class author:  Leo Brennan
//  Date created:  10/28/26
//  General description: bunch of methods that create patterns with loops. this is used for practicing loops
//
public class PatternGenerator {
    public static void main(String[] args) {
        PatternGenerator.printX(5);
    }
    public static void printX(int size) {
        int num = 0;
        int num2 = size - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == num || j == num2) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            num++;
            num2--;
        }
    }
}
