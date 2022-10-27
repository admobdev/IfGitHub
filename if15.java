import java.util.Scanner;

public class if15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();


        if (a>b && a>c) {
            if(b>c) System.out.println(b);
            else System.out.println(c);
            System.out.println(a);
        }else if(b>c && b>a) {
            if(c >a) System.out.println(c);
            else System.out.println(a);
            System.out.println(b);
        }else {
            if (a > b) System.out.println(a);
            else System.out.println(b);
            System.out.println(c);
        }
    }
}
