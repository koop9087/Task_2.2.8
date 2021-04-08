public class Main {
    public static void main(String[] args) {
        int size = CustomScanner.scanInt();
        int column = CustomScanner.scanInt();
        int column1 = CustomScanner.scanInt();
        int[][] array = new int[size][size];
        Filler.filler(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d\t", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        Calculate.changeThePositionOfColumn(array, column, column1);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d\t", array[i][j]);
            }
            System.out.println();
        }
    }
}
