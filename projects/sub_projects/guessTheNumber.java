import java.util.Scanner;
import java.util.Random;


public class guessTheNumber {

    static void guessNum(int r){
        Scanner sc = new Scanner(System.in);
        Random rNum = new Random();
        int highScore = 0;
        int a =0;
        String ask = "yes";
        System.out.println("enter a random number  ");
        while(ask.equalsIgnoreCase("yes")){
        int count = 0;
        r = rNum.nextInt(100 - 1 + 1) + 1;


            while(r != a){
                
            a = sc.nextInt();
            if(a<r){
                System.out.println("wrong!! enter a bigger number");
            }
            else if(a>r){
                System.out.println("wrong!! enter a smaller number");
            }
            else{
                System.out.println("congrats   you won ");
            }
            count ++;
        }
        
        System.out.printf("YOU TOOK %d ATTEMPT",count);
        System.out.println();
        if(highScore<count){
            highScore = count ;
            System.out.printf("YOUR HIGHEST SCORE %d ",highScore);
            System.out.println();

        }
        else if (count<highScore){
            highScore = count ;
            System.out.printf("YOUR NEW HIGHEST SCORE %d ",highScore);
            System.out.println();
        }
        else{
            highScore = count ;
            System.out.printf("YOUR HIGHEST SCORE %d remains the same ",highScore);
            System.out.println();
        }

        System.out.println("=======PLAY AGAIN======");
        System.out.println("======IF U WANT TO PALY AGAIN ENTER YES OR NO======");
        ask = sc.next();
        if(ask.equalsIgnoreCase("yes")){
            a=0;
            System.out.println("enter your number");

        }
        
    }
    System.out.println("=======THANKS FOR PLAYING=======");

    sc.close();
}





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rNum = new Random();
        int n = rNum.nextInt(100 - 1 + 1) + 1;
        System.out.println("==========ENTER THE NUMBER BETWEEN 1 TO 100==========");
        // System.out.println("========== YOU HAVE 10 ATTEMPTS ==========");
        

        guessNum(n);
        sc.close();
        


    }
}
