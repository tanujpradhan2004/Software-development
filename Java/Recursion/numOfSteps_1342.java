package recursion;

public class numOfSteps_1342 {
    public static void main(String[] args) {
        int num = 14 ;
        int steps = 0;
        System.out.println(steps(num , steps));
    }
    static int steps(int num , int steps){
        if(num == 0){
            return steps ;
        }
        if(num % 2 == 0){
            return steps(num/2, steps+1);

        }
        return steps(num -1, steps +1);
    }
}
