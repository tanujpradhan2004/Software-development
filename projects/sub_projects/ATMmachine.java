import java.util.Scanner;

class account{
    private int amount =0;
    int b = 0; 

    public int DepositAmount(int a){

        amount += a;
        return amount ;
    }

    public int Withdraw(int a){

        
        if(a <= amount){
            amount -= a;
            b = a;
            

            
        }
        else{
            System.out.println("LOW BALANCE ENTER LESS THAN " + amount);
        }
        return b;
    }
    
    public int checkBalance(){
        return amount;
    }

    public void  exit(){
        System.out.println("==THANK U FOR USING OUR ATM==");
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        account obj = new account();
        System.out.println(" ______________________\n|_________ATM__________|\n|                      |\n|1 BALANCE   WITHDRAW 2|\n|                      |\n|3 DEPOSIT       EXIT 4|\n|______________________|\n|______________________|");


        System.out.println("==ENTER THE PIN CODE TO SET FOR FURTHER TRANSACTION==");
        int pin = sc.nextInt();

        System.out.println();
        
        System.out.println(" ENTER THE OPTION NUMBER ");
        int num = sc.nextInt();
        do{
        
        if(num == 1){
            System.out.println("ENTER THE PIN TO CHECK BALANCE");
            int pin2 = sc.nextInt();

            while(pin != pin2 ){
                System.out.println("ENTER CORRECT PIN");
                pin2 = sc.nextInt();

            }
            if(pin == pin2){
                System.out.println(obj.checkBalance() + "$"); 
                }
        }
            
            
        
        else if(num == 2){
            

            System.out.println("enter the amount u want to withdraw ");
            int s = sc.nextInt();
            System.out.println("ENTER THE PIN TO WITHDRAW");
            int pin2 = sc.nextInt();
            while(pin != pin2 ){
                System.out.println("ENTER CORRECT PIN");
                pin2 = sc.nextInt();

            }if(pin == pin2){

            System.out.println(obj.Withdraw(s) + "withdrawn");

            }
           
        }
        else if(num == 3){
            System.out.println("ENTER THE PIN TO DEPOSIT");
            int pin2 = sc.nextInt();
            System.out.println("enter the the amount u want to deposit ");
            int s = sc.nextInt();
             while(pin != pin2 ){
                System.out.println("ENTER CORRECT PIN");
                pin2 = sc.nextInt();

            }
            if (pin == pin2) {
                System.out.println(obj.DepositAmount(s));
                
            }
        }

        else if (num == 4){
            obj.exit();
            break;
        }

        else{
            System.out.println("ENTER THE CORRECT OPTION");
        }

        System.out.println();
        System.out.println(" ENTER THE OPTION NUMBER ");
        num = sc.nextInt();

    }
    while(num > 0 && num <= 4);

    sc.close();


    }
    
}
