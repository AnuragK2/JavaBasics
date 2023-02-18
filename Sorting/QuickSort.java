package JAVA.Tutorial.Sorting;

import java.util.Scanner;

public class QuickSort {
    public static void PrintArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int partition(int arr[],int s,int e){
        int pivot=arr[s];
        int cnt=0;
        for(int i=s+1;i<e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        int PivotIndex=s+cnt;
        int temp=arr[PivotIndex];
        arr[PivotIndex]=arr[s];
        arr[s]=temp;
        int i=s;
        int j=e;
        while(i<PivotIndex && j>PivotIndex){
            while(arr[i]<PivotIndex){
                i++;
            }
            while(arr[j]>PivotIndex){
                j++;
            }
            if(i<PivotIndex && j>PivotIndex){
                int val=arr[i];
                arr[i]=arr[j];
                arr[j]=val;
                i++;
                j--;
            }
        }
        return PivotIndex;
    }
    public static void Sort(int arr[],int s,int e){
        if(s<=e){
            return;
        }
        int p=partition(arr,s,e);
        Sort(arr, s, p-1);
        Sort(arr, p+1, e);
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n=sc.nextInt();
            System.out.println("Enter the array elements: ");
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Sort(arr, 0, n-1);
            PrintArray(arr, 7);
        }
        System.out.println();
    }
}
