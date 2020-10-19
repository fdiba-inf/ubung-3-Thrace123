package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int number = input.nextInt();
        int s = 2;
        boolean Prime = true;
            while (s<number){
      if (number%s==0){
        Prime = false;
        break;
      }
      s++;
    }
    System.out.println("Prime number: "+ Prime);
    }
}