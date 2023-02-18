package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array:");
            int size=sc.nextInt();
            System.out.println("Enter the element to be found:");
            int element=sc.nextInt();
            System.out.println("Enter the array:");
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            boolean found=Search(arr,size,element);
            if(found){
                System.out.println("Element is found:");
            }
            else{
                System.out.println("Element is not found:");
            }
        }
    }
    public static boolean Search(int[] arr, int size, int element) {
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element is found at index "+arr[i]);
            }
        }
        return false;
    }
}

