void main() {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // รับค่าเมทริกซ์ 3x3
        System.out.println("กรอกค่าเมทริกซ์");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // ตรวจสอบสมมาตร
        boolean symmetric = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        // แสดงผล
        if (symmetric) {
            System.out.println("สมมาตร");
        } else {
            System.out.println("ไม่สมมาตร");
        }
}
