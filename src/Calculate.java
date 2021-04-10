public class Calculate {
    public static void changeThePositionOfColumn(int[][] array, int column1, int column2) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i][column1 - 1];
            array[i][column1 - 1] = array[i][column2 - 1];
            array[i][column2 - 1] = tmp;
        }
    }
}
