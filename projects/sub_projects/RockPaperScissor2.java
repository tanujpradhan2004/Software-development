import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnum = new Random();
        int num = rnum.nextInt(3);
        String s [] = {"rock", "paper","Scissor"};
        System.out.println("=====ROCK=====PAPER=====SCISSOR=====");

        System.out.println("ENTER ROCK PAPER OR SCISSOR");
        String ch = sc.nextLine();

        System.out.println("THE MACHINE CHOOSE \n ==" + s[num].toUpperCase());


        if(ch.equalsIgnoreCase(s[num])){
            System.out.println("THE MATCH IS DRAW");
        }
        else if(ch.equalsIgnoreCase("rock" ) && s[num].equalsIgnoreCase(s[2]) || ch.equalsIgnoreCase("paper") && s[num].equalsIgnoreCase(s[0]) || ch.equalsIgnoreCase("scissor") && s[num].equalsIgnoreCase(s[1])){
            System.out.println("YOU WON");
        }
        else if (ch.equalsIgnoreCase(s[0]) || ch.equalsIgnoreCase(s[1]) || ch.equalsIgnoreCase(s[2])){
            System.out.println("YOU LOOSE");
        }
        else{
            System.out.println("ENTER VALID OPTION");
        }

        sc.close();

    }
}
