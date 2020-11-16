
package lab;


/**
 *
 * @author Bogdan Kovalov
 * @since 11/15/2020
 * 
 */


import java.util.*; //import so the scanner can be used.


public class GradeCalculator {
    public static void main(String args[])
    {
        
      Scanner userInput = new Scanner(System.in);     
      System.out.println("How many grade marks are you entering?");
      
      int y = userInput.nextInt();
       
        int[] grades = new int[y];
       
        int x;
        float total = 0, avg;
                           
        for(x=0; x<y; x++) { 
           System.out.print("Enter Grade Mark "+(x+1)+":");
           grades[x] = userInput.nextInt();
           total = total + grades[x];
        }
        userInput.close();      
        avg = total/4;
        System.out.print("The final Grade is: ");
        if(avg>=90 && avg<=100)
        {
            System.out.println("A");
        }
        else if(avg>=80 && avg<=89)
        {
           System.out.println("B");
        } 
        else if(avg>=70 && avg<=79)
        {
            System.out.println("C");
        }
        else if(avg>=60 && avg<=69)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
}

