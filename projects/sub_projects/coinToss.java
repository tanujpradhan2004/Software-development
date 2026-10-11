import java.util.Scanner;
import java.util.Random;

public class coinToss {
        static int w = 0;
        static int l = 0;

    static void countScore(String ht, String s){     
        if(ht.equalsIgnoreCase("head") && s.equalsIgnoreCase("head") || ht.equalsIgnoreCase("tail") && s.equalsIgnoreCase("tail")){
        System.out.println("==YOU WON THIS ROUND==");
            w++;    
        }

        else if(ht.equalsIgnoreCase("head") && s.equalsIgnoreCase("tail") || ht.equalsIgnoreCase("tail") && s.equalsIgnoreCase("head")){
            
            System.out.println("==YOU LOOSE==");
            l++; 
        }

        else{
            System.out.println("enter correct option");
        }

        System.out.printf("THE SCORE IS \nWIN == %d\nLOOSE == %d\n\n",w,l);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String arr[] = {"head","tail"};
        int rNum = r.nextInt(2); 

        
        
        // System.out.println(arr[rNum]);
        String s = "yes";
        while(s.equalsIgnoreCase("yes")){  

            System.out.println("==ENTER HEAD OR TAIL==");
            String ht = sc.next();   

            rNum = r.nextInt(2);

            countScore(ht,arr[rNum]);
            do{
                System.out.println("== ENTER YES OR NO ==");
                s = sc.next();
                if(!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no")){

                    System.out.println("ENTER VALID OPTION ");
                }



            }
            while(!s.equalsIgnoreCase("yes") && !s.equalsIgnoreCase("no"));

            if(s.equalsIgnoreCase("no")){
                System.out.println("==THE GAME IS OVER==");
            }
        }

        sc.close();

    }
}



