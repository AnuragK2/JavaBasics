package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class BookAllocationProblem {
    public static boolean isPossible(int arr[],int n,int m, int mid){
        int studentCount=1;
        int pageSum=0;
        for(int i=0;i<n;i++){
            if(pageSum+arr[i]<=mid){
                pageSum+=arr[i];
            }
            else{
                studentCount++;
                if(studentCount>=m || arr[i]>mid){
                    return false;
                }
                pageSum=arr[i];
            }
        }
        return true;
    }
    public static int BookAllocation(int arr[],int n,int m){
        int start=0;
        int sum=0;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int end=sum;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(isPossible(arr,n,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of Students: ");
            int m=sc.nextInt();
            System.out.println("Enter the value of N: ");
            int n=sc.nextInt();
            System.out.println("Enter the array elements: ");
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("The minimum value of the maximum number of pages in book allocation is: " +BookAllocation(arr, n, m));
        }
    }
}
