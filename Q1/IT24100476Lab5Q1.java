import java.util.Scanner;

public class IT24100476Lab5Q1{
   public static void main(String[] args) {

      
      int max=0;
      int min=0;

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first integer: ");
      int num1 = input.nextInt();

      System.out.println("Enter the second integer: ");
      int num2 = input.nextInt();

      System.out.println("Enter the third integer: ");
      int num3 = input.nextInt();

      if (num1>num2)
   {
          max = num1;
          min = num2;
   }
      else if(num1<num2)
   {
          max = num2;
          min = num1;
   }
      
      else if( num3>max)
   {
         max = num3;
   }
      
     
      else if(num3<min)
   {
         min = num3;
   }
    
    System.out.println("The Smallest number is: "+ min);
    System.out.println("The Largest number is: "+ max);
 }
}






