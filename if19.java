import java.util.Scanner;

public class if19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        System.out.print("D: ");
        int d = sc.nextInt();

        if (a == b ) {
            System.out.println("to'rtinchi");
        } else if (a == c) {
            System.out.println("uchinchi");
        }else if (a == d){
            System.out.println("ikkinchi");
    }else {
            System.out.println("birinchi");
        }
    }
}
