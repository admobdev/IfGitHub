import java.util.Scanner;

public class if30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num = sc.nextInt();


        int yuz = num /100;
        int on = num % 100/10;

        if (on % 2 == 0) System.out.println("Ikki xonali juft son");
        else  if (on % 2 != 0) System.out.println("Ikki xonali toq son");
        else  if (yuz % 2 != 0) System.out.println("Uch xonali toq son");
        else  if (yuz % 2 == 0) System.out.println("Uch xonali juft son");
        else System.out.println("Son nolga teng");

    }
}
