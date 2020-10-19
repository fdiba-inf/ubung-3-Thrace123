package exercise3;

import java.util.Scanner;

public class BasicInputLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print(" Size of the angle: ");
    double angle = input.nextInt();
    System.out.print(" Unit: ");
    char einheit = input.next().charAt(0);

    do {

      if (einheit == 'r') {
        char einh = 'd';
        double result = angle * 180 / Math.PI;
        System.out.println("Angle: " + result + einh);
      } else {
        char einh = 'r';
        double result = angle * Math.PI / 180;
        System.out.println("Angle: " + result + einh);
      }

      angle = input.nextInt();
      einheit = input.next().charAt(0);
    } while (einheit == 'r' || einheit == 'd');
  }
}