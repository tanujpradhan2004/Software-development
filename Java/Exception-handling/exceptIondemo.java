
// import java.nio.channels.InterruptedByTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exceptIondemo {
    public static void main(String args []) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.println("enter a number");
        int arr[] = {1,2,3} ;  
        
       
        try{
            a = sc.nextInt();
          
            int b = 300/a;
            System.out.println(b);
            System.out.println(arr[a]);


        }
        catch(ArithmeticException e){
            System.out.println(e);
            

        }
       
        catch(IndexOutOfBoundsException s){
            System.out.println(s);
            
        }
        catch(InputMismatchException x){
            System.out.println(x);
            
            }
        catch(Exception i){
            System.out.println(i);
            
        }
      

       
        sc.close();
    

    }
}
