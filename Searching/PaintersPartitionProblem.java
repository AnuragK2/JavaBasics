package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class PaintersPartitionProblem {
    public static boolean isPossible(int arr[],int size,int k,int mid){
        int painterCount=0;
        int boardSum=-1;
        for(int i=0;i<size;i++){
            if(boardSum+arr[i]<=mid){
                boardSum+=arr[i];
            }
            else{
                painterCount++;
                if(painterCount>=k || arr[i]>mid){
                    return false;
                }
                boardSum=arr[i];
            }
        }
        return true;
    }
    public static int BinarySearch(int arr[],int size,int k){
        int start=0;
        int sum=0;
        for(int i=0;i<=size;i++){
            sum+=arr[i];
        }
        int end=sum;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(isPossible(arr,size,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        mid=start+(end-start)/2;
        return ans;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            System.out.println("Enter the array elements: ");
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number of painters: ");
            int k=sc.nextInt();
            System.out.println("The minimum time required to get the job done is: "+BinarySearch(arr, size, k));
        }
    }
}

