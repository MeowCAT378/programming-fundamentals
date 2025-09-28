void main() {
    int[][] matrixA = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9, 0, 1 ,2} };
    int min;

        IO.println("=====  Matrix A =====          Max");
    for (int[] ints : matrixA) {
        IO.print("    ");
        IO.print(Arrays.toString(ints));
        // ขึ้นบรรทัดใหม่
        IO.println();
    }

    IO.print("Min  ");
    for (int k = 0; k < matrixA[0].length; k+=1){
        min = matrixA[0][k];
            for (int[] ints : matrixA) {
                if (ints[k] < min) {
                    min = ints[k];
                }
            }
            IO.print(min);
            IO.print("  ");
        }
    }

