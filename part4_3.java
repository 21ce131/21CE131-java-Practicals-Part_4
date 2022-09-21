/*ID:21CE131
Name:Rishi Shah
AIM :Write a program that raises two exceptions. 
Specify two ‘catch’ clauses for the two exceptions. 
Each ‘catch’ block handles a different type of exception. 
For example the exception could be ‘ArithmeticException’ 
and ‘ArrayIndexOutOfBoundsException’. Display a message 
in the ‘finally’ block.*/

public class Practical4_3 {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                //Only the arithmeticexception is handled.
                //After first exception is encountered catch block is execuated.
                //Remaining statements in try block are not execuated.
                a[5]=131/0;  
                a[6]=6;  
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception ");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception ");  
                  }               
            finally{
                System.out.println("Message in finally: There are multpile catch blocks.");
            }
    }  
}  
