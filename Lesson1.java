/**
 * Lesson1
 */
import java.util.Scanner;

public class Lesson1 {

  public static void main(String[] args) {
    System.out.println("Goodbye world");

    double f = 123.23;
    System.out.println(f);

    boolean flag1 = 123 <= 234;
    System.out.println(flag1); // true
    boolean flag2 = 123 >= 234 || flag1;
    System.out.println(flag2); // true
    boolean flag3 = flag1 ^ flag2;
    System.out.println(flag3); // false
    int a = 123;
    System.out.println(++a);

    int b = 123;
    int c = 23;
    c--;
    b = --b - c;
    System.out.println(b);

    int v = 16;
    System.out.println(v << 1);

    System.out.println(5 | 2);
    // 101
    // 010
    // 111 = 7

    int[] ar = new int[] { 1, 2, 3 };
    System.out.println(ar.length);

    int[][] arr = new int[3][5];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%d ", arr[i][j]);
      }
      System.out.println();
    }

    int h = 9;
    {
      int g = 123;
      System.out.println(g + h);
    }

    Scanner iScan = new Scanner(System.in);
    System.out.printf("int a: ");
    int x = iScan.nextInt();
    System.out.printf("double a: ");
    double y = iScan.nextDouble();
    System.out.printf("%d + %f = %f", x, y, x + y);
    iScan.close();

    // защита от бананов
    // Scanner iScanner = new Scanner(System.in);
    // System.out.printf("int a: ");
    // boolean flag = iScanner.hasNextInt();
    // System.out.println(flag);
    // int i = iScanner.nextInt();
    // System.out.println(i);
    // iScanner.close();

    for (int i = 0; i < 10; i++){
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
      System.out.print("* ");
      }
      System.out.println();
      }
     
    
  }

  static String getType(Object o) {
    return o.getClass().getSimpleName();
  }
}
