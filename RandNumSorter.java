/** This program print random integers and arrange  them as even 
    and  odd integers 
    1.User select random integer between 0-999
    2.Check if the user input is between 0-999
    3.Randomize the integers
    5.First print randomized integers
    6.Then arrange them from least even integer to largest even integer 
    and largest Odd integer to the least odd integer 
    7.print the number of random, even and odds integers
    respectively 
    * @author Abenezer Anglo, abeang-2@student.ltu.se 
    */
import java.util.Scanner;
class RandNumSorter {
  public static void main(String[] args) {
    
    
    // Varaible declration
    int randNum =0 ;
    int[] newArray; 
    int oddCounter=0 ;
    int evenCounter=0 ;
    int minAt=0;
    int temp=0;
    //Create an object of Scanner
     
    Scanner input = new Scanner(System.in) ;
    
    // Get user input 
    if  (randNum>=0&&randNum<=999) {    
        System.out.print("How many random numbers in the range 0 - 999 are desired?");
    
        randNum = input.nextInt();
    }
    
    // Validate input
    // If input is out of range print error and exit program
    if (randNum<0||randNum>999) {
        System.out.println("Error! The integer is not in the range ");
        return;
    }    
    
    // Fill array with random numbers
    newArray= new int [randNum] ;
    for (int i=0; i<newArray.length;i++) {
        newArray[i]= (int)(Math.random()*999)+1;   
           
    }

    System.out.println();
    
    //  Print random numbers unsorted
    System.out.println ("Here are the numnbers:");        
    for (int i=0; i<newArray.length;i++) {
        System.out.print(newArray[i]+" ");

    }        
    System.out.println();
     

    // Sort  the numbers from smallest to largest
    for (int i = 0; i < newArray.length - 1; i ++)
    {        
         minAt = i;
        for (int k = i + 1; k <newArray.length; k ++)  {
            if (newArray[k]< newArray[minAt]) {
                minAt = k;
            }
        }
        // Switches places in two places in the array
         temp = newArray[i];
        newArray[i] = newArray[minAt];
        newArray[minAt] = temp;
    
    }
      
       System.out.println();
    
    System.out.println("Here are the random numbers arranged:");

    // Print even
    for(int x:newArray) {
        if (x%2 == 0) {
            System.out.print(x+" ");
          evenCounter++;
        }
    }

    // Print separation character
    System.out.print("- ");

    // Print odd
    for(int i=newArray.length-1; i >=0; i--) {
        if (newArray[i] %2 != 0) {
            System.out.print(newArray[i]+" ");
           oddCounter ++;
        }
    }
    System.out.println();
    System.out.println();
   //print the number of random, even and odd integers 
    System.out.print("Of the above " + randNum + " "+ "numbers," +" "+ evenCounter+ " " +"were even and" + " "+ oddCounter + " " +"odd" );
    


    input.close();
   
    
  }
}