/*ID:21CE131
Name:Rishi Shah
AIM :WAP to show the try - catch block to catch 
     the different types of exception.*/

public class Practical4_1 {
    public static void main(String[] args) {
        //ArithmeticException Example
        try{
            int a =131;
            int result = a/0;
        }        
        catch(ArithmeticException e){
            System.out.println(e);
        }

        //NullPointer Exception
        try{
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e1){
            System.out.println(e1);
        }

        //StringIndexOutOfBound Exception
        try{
            String s = "Rishi";
            char c = s.charAt(10);
        }
        catch(StringIndexOutOfBoundsException e2){
            System.out.println(e2);
        }

        //ArrayIndexOutOfBounds Exception
        try{
            int a[] = new int[5];
            a[6] = 131;
        }
        catch(ArrayIndexOutOfBoundsException e3){
            System.out.println (e3);
        }
    }
}
