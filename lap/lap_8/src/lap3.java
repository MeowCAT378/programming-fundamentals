void main() {
    int[][] matrixA = {
            { 1, 2, 3, 4},
            { 5, 6, 7, 8},
            { 9, 0, 1, 2}
    };


    int max;
    IO.println("===== Matrix A =====     Max");
    // ลูปตามขนาด arr
    for (int[] row : matrixA) {
        max = row[0];
        // ลูปหาค่า max
        for (int j = 1; j < row.length; j++) {
            if (row[j] > max) { // เทียบค่าที่ละตำแหน่ง
                max = row[j]; // เก็บค่ามาก
            }
        }
        IO.print("   ");
        // พิมพ์ row และ max ในบรรทัดเดียวกัน
        IO.println(Arrays.toString(row) + "           " + max);
    }
}
