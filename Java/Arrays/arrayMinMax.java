package array1;

import java.util.*;

public class arrayMinMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i< size; i++){
            System.out.println("enter the numbers ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("the maximum value is " + max);
        System.out.println("the minimum value is " + min);

        sc.close();

        
       

    }
}
