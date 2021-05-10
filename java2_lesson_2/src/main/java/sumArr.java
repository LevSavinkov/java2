public class sumArr {
    static void testArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            System.out.println("В массиве должно быть только 4 строки и столбца");
            throw new MyArraySizeException("У массива должно быть 4 строки");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("В массиве должны быть только числа");
                    throw new MyArrayDataException("В массиве должны быть только числа");
                }
            }

        }
        System.out.println(sum);
    }
}
