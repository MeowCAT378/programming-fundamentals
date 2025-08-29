import java.util.Scanner;

public class lpp_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int count = 0;

       for (int i = 1; i <= time; i += 1){
           String type = input.next();
           if (type.equals("A") || type.equals("E") || type.equals("I") || type.equals("O") || type.equals("U")) {
                count += 1;
           }
       }
        System.out.println(count);
    }
}
