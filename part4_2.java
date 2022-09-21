/*ID:21CE131
Name:Rishi Shah
AIM :WAP to generate user defined exception 
     using “throw” and “throws” keyword.*/

class NegativeNumber extends Exception{
    public NegativeNumber(String s){
        super(s);
    }
}
public class Practical4_2 {
    
    public static void main(String[] args) {
        int a = -2;
        try{
                if (a<0){
                    throw new NegativeNumber("The number cannot be negative.");
                }
        }
        catch (NegativeNumber e){
            System.out.println(e);
        }
    }
}
