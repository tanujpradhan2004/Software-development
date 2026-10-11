import java.util.Scanner;


class mcq{
    static int result = 0;

    public String queAndOption(int q){
        String q1 = "1. What is java ? \nA. Operating System \nB. Programming Language \nC.Database \nD.Browser";
        String q2 = "2. Which keyword is used to create an object in java ? \nA. Class  \nB. new \nC. this \nD. static" ;
        String q3 = "3. Which method is the entry point of a java program ? \nA. start()  \nB. run() \nC. main() \nD. execute()" ;
        String q4 = "4. which of the following is the primitive datatype in java ? \nA. string  \nB. array \nC. int \nD. object" ;
        String q5 = "5. which loop executes at least once ? \nA. for  \nB. while \nC. do-while \nD. foreach";
        String q6 = "6. which operator is used to create two values  ? \nA. =  \nB. == \nC. += \nD. !=" ;
        String q7 = "7. which package is automatically imported in every java program ? \nA. java.util  \nB. java.io \nC. java.lang \nD. java.net";
        String q8 = "8. Which keyword is used for inheritance ? \nA. implements  \nB. extends \nC. import \nD. package";
        String q9 = "9. Which of the following is not a access modifier? \nA. public   \nB. private \nC. protected \nD. default";
        String q10 = "10. Which class is used to take input from the keyboard ? \nA. printer  \nB. input \nC. Scanner \nD. reader";
        String arr[] = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};
        return arr[q]; 

    }
    
    public String answers( int i){

        String a1 = "B";
        String a2 = "B";
        String a3 = "C";
        String a4 = "C";
        String a5 = "C";
        String a6 = "B";
        String a7 = "C";
        String a8 = "B";
        String a9 = "D";
        String a10 = "C";
        String arr[] = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
        return arr[i];

    }
    public void setResult(){
        result +=1 ;
    }
    public void getResult(){
        System.out.println("YOUR TOTAL SCORE IS " + result);
        result = 0 ;

    }
}
public class quizTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a ;
        String r ;
        String ask = "yes";

        mcq obj = new mcq();



        System.out.println("== YOUR QUIZ TEST BEGINS ==");



        while(ask.equalsIgnoreCase("yes")){
        for(int i = 0; i <= 9; i++){
            r = obj.answers(i);

            System.out.println(obj.queAndOption(i)); 
            System.out.println("ENTER YOUR OPTION ");
            a = sc.next();
            if(a.equalsIgnoreCase(r)){
                obj.setResult();
            }

        }

        obj.getResult();

        System.out.println("== IF YOU WANT TO PLAY AGAIN ENTER YES ELSE NO ==");
        ask = sc.next();


        do{

            if (!ask.equalsIgnoreCase("yes") && !ask.equalsIgnoreCase("no")){
                System.out.println("== ENTER EITHER YES OR NO ==");
                ask = sc.next();

            }
        }while(!ask.equalsIgnoreCase("yes") && !ask.equalsIgnoreCase("no"));

        if(ask.equalsIgnoreCase("no")){
            System.out.println("== THE GAME IS OVER ==");
            
        }


        }

        sc.close();
    }
}
