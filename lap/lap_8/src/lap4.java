void main() {
                int[][] arr = {
                {4, 6, 4, 9},
                {5, 3, 2, 0},
                {6, 5, 0, 12},
                {3, 1, 9, 8}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int[] rowSum = new int[rows];   // เก็บผลรวมแต่ละแถว
        int[] colSum = new int[cols];   // เก็บผลรวมแต่ละคอลัมน์
        int total = 0;                  // ผลรวมทั้งหมด

        // คำนวณผลรวม
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSum[i] += arr[i][j];
                colSum[j] += arr[i][j];
                total += arr[i][j];
            }
        }

        // พิมพ์หัวตาราง
        System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%n",
                "", "col1", "col2", "col3", "col4", "Total");

        // พิมพ์ค่าของอาร์เรย์ + row sum
        for (int i = 0; i < rows; i++) {
            System.out.printf("row%-3d", i + 1);
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-6d", arr[i][j]);
            }
            System.out.printf("%-6d%n", rowSum[i]);
        }

        // พิมพ์ col sum และ total
        System.out.printf("%-6s", "Total");
        for (int j = 0; j < cols; j++) {
            System.out.printf("%-6d", colSum[j]);
        }
        System.out.printf("%-6d%n", total);
    }
