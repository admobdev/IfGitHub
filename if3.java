import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int num = sc.nextInt();

        if (num > 0) { num++; }
        else if ( num < 0 ) {num = num - 2;}
        else { num = 10; }

        System.out.println(num);
    }
}
