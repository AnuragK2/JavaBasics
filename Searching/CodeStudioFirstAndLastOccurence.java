package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class CodeStudioFirstAndLastOccurence {
    public static int FirstOccurenceOfElement(int arr[],int size,int key){
        int start=0,end=size-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            if(mid==key){
                ans=mid;
                end=mid-1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    public static int LastOccurenceOfElement(int arr[],int size,int key){
        int start=0,end=size-1;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<end){
            if(mid==key){
                ans=mid;
                start=mid+1;
            }
            else if(key<arr[mid]){
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
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
            int first=FirstOccurenceOfElement(arr, size, 3);
            int last=LastOccurenceOfElement(arr, size, 3);
            System.out.println("First Occurence of the element is at index: "+first);
            System.out.println("Last Occurence of the element is at index: "+last);
        }
    }
}
