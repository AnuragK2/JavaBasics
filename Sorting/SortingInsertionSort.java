package JAVA.Tutorial.Sorting;

import java.util.Scanner;

public class SortingInsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<arr.length;i++){
                int current=arr[i];
                int j=i-1;
                while(j>=0 && current<arr[j] ){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=current;
            }
            insertionSort(arr);
        }  
    }
}
