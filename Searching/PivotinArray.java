package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class PivotinArray {
    public static int pivot(int arr[],int size){
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]>=arr[0]){
                start=mid+1;
            }
            else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
        return start;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            System.out.println("Enter the array elements: ");
            int[] arr=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("The pivot element is:"+pivot(arr, size));
        }
    }
}
