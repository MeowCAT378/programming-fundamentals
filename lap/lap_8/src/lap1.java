void main() {

    int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    // ลูปตามขนาด arr
    for (int[] ints : m) {
        // ลูปที่ตำแหน่ง i เมื่อ น้อยหรือเท่ากับ j
        for (int j = ints.length - 1; j >= 0; j -= 1) {
            //แสดงค่า i / j
            IO.print(ints[j]);
            IO.print(" "); // วรรคเลข
        }
        // ขึ้นบรรทัดใหม่
        IO.println();
    }
}
