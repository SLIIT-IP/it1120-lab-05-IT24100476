import java.util.Scanner;

public class IT24100476Lab5Q1 {
   public static void main(String[] args) {

      int max = 0;
      int min = 0;

      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the first integer: ");
      int num1 = input.nextInt();

      System.out.println("Enter the second integer: ");
      int num2 = input.nextInt();

      System.out.println("Enter the third integer: ");
      int num3 = input.nextInt();

      // Compare first two numbers to decide initial max and min
      if (num1 > num2) {
         max = num1;
         min = num2;
      } else {
         max = num2;
         min = num1;
      }

      //compare num3 with current max and min
      if (num3 > max) {
         max = num3;
      } 
      
      if (num3 < min) {
         min = num3;
      }

      System.out.println("User entered numbers are : "+num1+" "+num2+" "+num3);
      System.out.println("The Smallest number is: " + min);
      System.out.println("The Largest number is: " + max);
   }
}
