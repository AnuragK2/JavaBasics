package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class FindNonRepeatingElementinArray {
    public static int FindNonRepeatingElement(int arr[],int ar_size){
        int res=arr[0];
        for(int i=1;i<ar_size;i++)
            res=res^arr[i];
        return res;
    }  
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            System.out.println("Enter the elements of array: ");
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("The non repeating element is: ");
            System.out.print(FindNonRepeatingElement(arr, size));
        }
    }
}
