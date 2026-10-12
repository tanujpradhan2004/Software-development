import java.util.*;
public class addTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of row");
        int r = sc.nextInt();
        System.out.println("enter the size of coloumn");
        int c = sc.nextInt();
        int arr1[][] = new int[r][c];
        System.out.println("enter the elemets of 1st array");
        for(int i = 0; i<r; i++){
            for(int j = 0; j< c; j++){
                arr1[i][j] = sc.nextInt();
            }

        }

        int arr2[][] = new int[r][c];

        System.out.println("enter the elements of 2nd array");
        for(int i = 0; i<r; i++){
            for(int j = 0; j< c; j++){
                arr2[i][j] = sc.nextInt();
            }

        }
        int arr3[][] = new int[2][3];
        System.out.println("the elements after adding ");
        for(int i = 0; i<r; i++){
            for(int j = 0; j< c; j++){
                System.out.print(arr3[i][j] = arr1[i][j] + arr2[i][j]);
            }
            System.out.println();

        }
        sc.close();





    }
}
