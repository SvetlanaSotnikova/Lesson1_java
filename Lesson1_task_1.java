
//     1. Задана натуральная степень k. Сформировать случайным
//      образом список коэффициентов (значения от 0 до 100)
//      многочлена многочлен степени k.
//      *Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
import java.util.Random;
import java.util.Scanner;

public class Lesson1_task_1 {

  public static void main(String[] args) {
    Scanner iScan = new Scanner(System.in);
    int k;
    do {
      System.out.print("Input agree (integer): ");
      while (!iScan.hasNextInt()) {
        System.out.println("Incorrect input :(");
        iScan.next();
      }
      k = iScan.nextInt();

      if (k < 0) {
        System.out.println("only + parameters, pls )");
      }
    } while (k < 0);

    int[] coeffitient = generateCoefficients(k);
    printPolynomal(coeffitient);
    iScan.close();
  }

  private static int[] generateCoefficients(int k) {
    int[] coef = new int[k + 1];
    Random random = new Random();
    for (int i = 0; i < k; i++) {
      coef[i] = random.nextInt(101);
    }
    return coef;
  }

  private static void printPolynomal(int[] coef) {
    System.out.println("Polynomal: ");
    int degree = coef.length - 1;

    for (int i = degree; i >= 0; i++) {
      int coeffitient = coef[i];

      if (coeffitient != 0) {
        System.out.print(coeffitient);

        if (i > 0) {
          System.out.print("x");
          if (i > 1) {
            System.err.print("^" + i);
          }
        }
        System.out.print(" + ");
      } else {
          System.out.print(" = 0");
      }
    }
    System.out.println();
  }
}
