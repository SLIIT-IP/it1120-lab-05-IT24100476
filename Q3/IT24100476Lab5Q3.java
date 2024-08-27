import java.util.Scanner;

public class IT24100476Lab5Q3{
	
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      
      //Constants 
      final int ROOM_CHARGE_PER_DAY = 48000;
      final double PERCENTAGE_TO_PAY_AFTER_3_TO_4_DAYS = 0.9;  //How much percentage customer need to pay from total bill which is 90%
      final double PERCENTAGE_TO_PAY_AFTER_5_OR_MORE_DAYS = 0.8; //How much percentage customer need to pay from total bill which is 80%
      

      System.out.println("Enter Start Date (1-31): ");
      int startDate = input.nextInt();
   
      System.out.println("Enter End Date (1-31): ");
      int endDate = input.nextInt();
 
      int noOfDays = 0;
      double roomCharge = 0;
     
      if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) 
      {
          System.out.println("Error: Days must be between 1 and 31  ");
         
      }
      
      
      else if(startDate>endDate)
         {
    	 System.out.println("Error: Start Date must be less than End Date ");
    	
         }
      else
      {
            
    	 
    	            //calculating the number of days reservation has done 
                    noOfDays = endDate - startDate;
                   
                    if(noOfDays >=5)
                       {
                          roomCharge = ROOM_CHARGE_PER_DAY*noOfDays*PERCENTAGE_TO_PAY_AFTER_5_OR_MORE_DAYS;
                       }
                    else if(noOfDays >=3)
                       {
                           roomCharge = ROOM_CHARGE_PER_DAY*noOfDays*PERCENTAGE_TO_PAY_AFTER_3_TO_4_DAYS;
                       }
                    else
                       {
                            roomCharge =ROOM_CHARGE_PER_DAY*noOfDays;
                       }
                    System.out.println("Room Charge Per Day: Rs. 48000.0/= ");
                    System.out.println("Number Of Days Reserved: "+ noOfDays); 
                    System.out.println("Total Amount to be Paid: "+ roomCharge);
              
       }
   
    }
       
        
      
}
              