package array1;

import java.util.*;

public class arrayLinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("enter the inputs");
            arr[i] =  sc.nextInt();
        }
        System.out.println("all the inputs are");
        for(int i = 0; i< size; i++){
            System.out.println(arr[i]);

        }
        //linear search
        boolean found = false;
        System.out.println("enter the number of which u want the index");
        int k = sc.nextInt();
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == k){
                System.out.println("the index of given number is "+i);
                found =true;
                break;
            }
            
        }
        if(!found){
                System.out.println("not found ");
            }
        sc.close();
    }
}
