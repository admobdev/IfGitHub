import java.util.Scanner;

public class if29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num = sc.nextInt();

        if (num > 0 && num % 2 != 0) System.out.println("Musbat toq son");
         else if (num < 0 && num % 2 == 0) System.out.println("Manfiy juft son");
          else if (num < 0 && num % 2!= 0) System.out.println("Manfiy toq son");
           else if ( num  > 0 && num % 2 == 0) System.out.println("Musbat juft son");
            else System.out.println("Son nolga teng");
    }
}
