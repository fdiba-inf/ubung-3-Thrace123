package exercise3;

import java.util.Scanner;

public class NumberCounter {
  public static void main (String[] args) {
   Scanner input = new Scanner(System.in);


  int posCount = 0;
int negCount= 0;
 double sum = 0.0;
double averrage = 0.0;
int count=0;
  int number = input.nextInt();

while ( number != 0) {
    if (number > 0){
      posCount++;
    }else{
      negCount++;
      }

  
    sum += number;
    
    number=input.nextInt();
  
   
  }

  averrage = (sum)/count;

  System.out.println("Positive numbers: "+ posCount);
  System.out.println("Negative numbers: "+ negCount);
  System.out.println("Sum: " + sum);
  System.out.println("Average: " + averrage);
  


  }
}