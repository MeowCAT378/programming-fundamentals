import java.util.Scanner;

public class lap_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;

        for (int i = 1; i <= num ;i+=1){
            int load = input.nextInt();
                if (load > 60){
                    count += 1;
                }else {
                    count += 0;
                }
        }
        System.out.println(count);
    }
}
