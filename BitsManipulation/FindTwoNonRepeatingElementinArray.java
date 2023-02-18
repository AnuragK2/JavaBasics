package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class FindTwoNonRepeatingElementinArray {
    public static void FindTwoNonRepeatingElement(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum=(sum^arr[i]);
        }
        sum=(sum & -sum);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&sum)>0){
                sum1=(sum1^arr[i]);
            }
            else{
                sum2=(sum2^arr[i]);
            }
        }
        System.out.println("The non repeating elements are: "+sum1+" and "+sum2);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the elements of the array: ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            FindTwoNonRepeatingElement(arr, size);
        }
    }
}
