package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Text: ");
    int a = 0;

    for(String text = input.nextLine(); a < text.length(); a++) {
      char b = text.charAt(a);
      System.out.println("* " + b + " *");
    }
  }
}