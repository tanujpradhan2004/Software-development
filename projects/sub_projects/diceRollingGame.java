import java.util.Scanner;
import java.util.Random;


class dice{
    int roll;


    public int roll(){

       
    Random rnum = new Random();
    int n = rnum.nextInt(6 - 1 + 1 ) + 1;
    return n;
    }

}

class user extends dice{

    int scoreUser1 =0;
    public void setScore(int n){
        
        System.out.println("the score in this round is " + n);
        System.out.println();
        
        scoreUser1 += n;
        
    }
    public int getScore(){
        return scoreUser1;
    }
}




public class diceRollingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        user player1 = new user();
        user player2 = new user();


        System.out.println("======ENTER HOW MANY ATTEMTS U WANT TO CALCULATE======");
        int n = sc.nextInt();
        

        System.out.println("=====ENTER FOR PLAYER 1======");
        sc.nextLine();
        String ask = "yes";

        while(ask.equalsIgnoreCase("yes")){
            int i =n;
        while(n>0){
            System.out.println(" press enter ");
            sc.nextLine();
            player1.setScore(player1.roll());
            n--;

        }
        int sum1 = player1.getScore();


        System.out.println("=====ENTER FOR PLAYER 2 =====");
        sc.nextLine();
        while(i>0){
            System.out.println(" press enter ");
            sc.nextLine();
            
            player2.setScore(player2.roll());
            i--;

        }
        int sum2 = player2.getScore();


        System.out.println("the player1 score is =  "+ sum1);

        System.out.println("the player2 score  is =  " + sum2);

        if(sum1>sum2){
            System.out.println("==PLAYER 1 WINS== ");

        }
        else if(sum1<sum2){
            System.out.println("==PLAYER 2 WINS== ");
        }
        else{
            System.out.println("==DRAW==");
        }


        do{
            System.out.println("IF YOU WANT TO PLAY AGAIN ENTER YES ");
            ask = sc.next();

            if(!ask.equalsIgnoreCase("yes") && !ask.equalsIgnoreCase("no")){
                System.out.println("enter valid option ");
            }
            

        }while(!ask.equalsIgnoreCase("yes") && !ask.equalsIgnoreCase("no"));

        if(ask.equalsIgnoreCase("no")){
            System.out.println("    ==THE GAME IS== \n    ======over======");

        }

        

        
    }
        sc.close();
    }
}
