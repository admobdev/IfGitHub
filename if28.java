import java.util.Scanner;

public class if28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yil kiriting: ");
        int y = sc.nextInt(); int d;

        d = y % 4 != 0 || y % 400 != 0 && y % 100 == 0 ?   365 : 366;
        System.out.println(d);
    }
}
/*
      1 -  variant
	int y = -1200, d;
		if (y % 100 == 0 && y % 400 != 0) {
			d = 365;
		} else if (y % 4 == 0) {
			d = 366;
		} else {
			d = 365;
		}
		System.out.println(d);*/

/*     2 -  variant
     int y = 1200, d = 365;
		 if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
		{d = 366;
		}
		if (y % 4 != 0 || y % 400 != 0 && y % 100 == 0) {
			d = 365;
		} else {
			d = 366;
		}
		System.out.println(d);
* */

/*
       3 - variant
       	int y = 1200, d;
		d = y % 4 != 0 || y % 400 != 0 && y % 100 == 0 ? 365 : 366;
		System.out.println(d);
 */