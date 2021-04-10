public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        int column = CustomScanner.scanInt();
        int column1 = CustomScanner.scanInt();
        int[][] array = new int[size][size];
        Filler.fill(array);
        Printer.printIntMatrix(array);
        System.out.println();
        Calculate.changeThePositionOfColumn(array, column, column1);
        Printer.printIntMatrix(array);
    }
}
