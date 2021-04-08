public class Calculate {
    public static void changeThePositionOfColumn(int[][] array, int column, int column2) {
        int[] mas = new int[array.length];
        int k = 0;
        for (int j = column - 1, i = 0; i < array.length && j < array.length; i++) {
            mas[k] = array[i][j];
            k++;
            array[i][j] = array[i][column2 - 1];
        }

        for (int j = column2 - 1, i = 0, tmp = 0; i < array.length; i++, tmp++) {
            array[i][column2 - 1] = mas[tmp];
        }
    }
}
