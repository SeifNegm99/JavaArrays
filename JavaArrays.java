package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Array size  ");
        int n = scan.nextInt();
        int array [] = new int [n];
        System.out.println("Enter Array elements:  ");
        for (int i=0 ; i < n ; i++){
            int y = scan.nextInt();
            array[i] = y; 
            Arrays.sort(array);
        }
        System.out.println("Array Elements are"+Arrays.toString(array));
        System.out.println("the array length is "+array.length);
        System.out.println("enter any number");
        int y = scan.nextInt();
        if (y >= 1){
            System.out.println(""+y);
        }
    }
    
}
