package coding;

public class NumberPrinter {

    public void printOddNumbers(int minNumber, int maxNumber) {
        for (int i = minNumber; i <= maxNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(String.format("%2d", i));
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();
        numberPrinter.printOddNumbers(1, 99);
    }
}
