import java.util.*;

public class lpp_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i+=1){
            for (int j = num; j > i; j-=1){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
