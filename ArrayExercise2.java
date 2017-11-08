
import java.math.BigInteger;
import java.util.Scanner;

/*****************************************************************
*Programmer:        Erika Tvaskis
*Class:             CS30S Section 007
*Assignment:        Array Exercises One Program 2
*Description:       Prints first and last 10 (if exists) numbers from Fibonacci Series             
*Input:             MaxFibonacciNumbers = how many numbers are in Fibonacci Series                                                         
*Output:            First and last 10 (if exists) numbers from Fibonacci Series                                  
******************************************************************/

public class ArrayExercise2 
{   
    
    public static void main(String[] args) 
        { //Begin main
        
//DELCARE VARIABLES      
           
    int MaxFibonacciNumbers = 100;  
    //Declaring MaxFibonacciNumbers as int and setting to 100
    
    String Output1 = "";    //Declaring Output1 as String
    String Output2 = "";    //Declaring Output2 as String
    String Output3 = "";    //Declaring Output3 as String
    String Output4 = "";    //Declaring Output4 as String
    
    Scanner Scanner = new Scanner(System.in);   
    //Declaring Scanner
    BigInteger[] FibonacciNumbers = new BigInteger[MaxFibonacciNumbers];
    //Declaring array FibonacciNumbers of BigIntegers
    //As very high numbers when MaxFibonacciNumbers = 100
    FibonacciNumbers[0] = BigInteger.ZERO;
    FibonacciNumbers[1] = BigInteger.ONE;
    //Setting first and second elements in Fibonacci series
    
//BANNER

    ProgramInfo Banner = new ProgramInfo("Array Exercises One", " Program 2"); 
    //Object that prints banner
    ProgramInfo EndOfProgram = new ProgramInfo();
    System.out.println(Banner.toString());  
    //Prints banner
    
//SCANNER (DETERMINES MaxFibonacciNumbers)
//TRY CATCH TO CATCH FORMAT EXCEPTION
          
    System.out.println("Please enter how many elements you want: (max: 100) ");
    //Prints this
    
    try {   
        //Try
        MaxFibonacciNumbers = Integer.parseInt(Scanner.nextLine());
        //Setting MaxFibonacciNumbers to entered number
    }   //Closing bracket for try statement
    catch (NumberFormatException e) {                             
        //Catch number format exception
        System.out.println("Error, please enter a numeric value");                             
        //Prints this
        System.out.println("The Error: " + e); 
        //Prints error
        return; 
        //Stops the program if catch statement catches error
    }   //Closing bracket for catch statement 
    
//IF STATEMENT (AS MaxFibonacciNumbers CANNOT BE GREATER THAN 100

    if (MaxFibonacciNumbers > 100){     
        //If statement
        System.out.println("Program can only handle up to 100, setting to hundred");
        MaxFibonacciNumbers = 100;
        //Sets MaxFibonacciNumbers to zero
    }   //Closing bracket for if statement
    
//FOR LOOPS
         
    //Calculating Fibonacci Series
    for(int i=2; i < MaxFibonacciNumbers; i++){
        //For loop
        FibonacciNumbers[i] = FibonacciNumbers[i-1].add(FibonacciNumbers[i-2]);
        //Calculation formula for the Fibonacci series
    }   //Closing bracket for loop

    //Determing first 10 numbers
    for(int i=0; i < MaxFibonacciNumbers; i++){  
        //For loop (for Output1 and Output2)
        if (i < 5) {
            //If statement
            Output1 = Output1 + (" " + FibonacciNumbers[i] + " " ); 
            //Row formatting
         }  //Closing bracket for if statement
        if (i >= 5 && i<10) {
            //If statement
            Output2 = Output2 + (" " + FibonacciNumbers[i] + " " );  
            //Row formatting
        }   //Closing bracket for if statement
    }   //Closing bracket for loop
 
    //Determing last 10 numbers
    for(int i=MaxFibonacciNumbers; i >=0; i--){ 
        //For loop (for Output3 and Output4)
        if (i >= MaxFibonacciNumbers-5 && i<MaxFibonacciNumbers) {
            //If statement
            Output3 = Output3 + (" " + FibonacciNumbers[i] + " " );
            //Row formatting
        }   //Closing bracket for loop
        if (i >= MaxFibonacciNumbers-10 && i<MaxFibonacciNumbers-5) {
            //If statement
            Output4 = Output4 + (" " + FibonacciNumbers[i] + " " ); 
            //Row formatting
        }   //Closing bracket for loop
    }   //Closing bracket for loop

//PRINTING

    System.out.println("***********");
    System.out.print(Output1 + "   ");  
    //Printing Output1
    System.out.println(" "); 
    //Ln makes next row move to next line
    System.out.print(Output2 + "   "); 
    //Printing Output2
    System.out.println(" "); 
    //Ln makes next row move to next line
    System.out.print(Output3 + "   "); 
    //Printing Output3
    System.out.println(" "); 
    //Ln makes next row move to next line
    System.out.print(Output4 + "   ");
    //Printing Output4
    System.out.println(" ");

} //End main
    
} //End public class