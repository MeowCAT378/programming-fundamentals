import java.util.*;

public class lap_02 {
    public static void main(String[] args) {

        int[] list = { 2, 45, 24, 29, 90, -2, 59, 45, 23, 89 };
        int sum = 0; // เก็บผลรวม
        int max = 0; // เก็บค่าน้อยสุด
        int min = 0; // เก็บค่ามากสุด
        double avg = 0.0;

        for (int i = 0; i < list.length; i+=1){
            sum += list[i];  // ลงผลรวม
            if (list[i] < min) { // หาค่าน้อยสุด
                min = list[i];
            }
            if (list[i] > max) { //หาค่ามากสุด
                max = list[i];
            }
        }
        avg = (double) sum / list.length; // หา avg
        System.out.println("ผลรวม : " + sum);
        System.out.println("ค่าเฉลี่ย : " + avg);
        System.out.println("ค่าน้อยสุด : " + min);
        System.out.println("ค่ามากสุด : " + max);
    }
}
