package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static int BinarySearching(int arr[],int size,int key){
        int start=0;
        int end=size-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=end-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            System.out.println("Enter the even array elements: ");
            int even[]=new int[size];
            for(int i=0;i<even.length;i++){
                even[i]=sc.nextInt();
            }
            int evenIndex=BinarySearching(even, size, 18);
            System.out.println("Index of 18 is: "+evenIndex);
            System.out.println("Enter the odd array elements: ");
            int odd[]=new int[size];
            for(int i=0;i<odd.length;i++){
                odd[i]=sc.nextInt();
            }
            int oddIndex=BinarySearching(odd, size, 18);
            System.out.println("Index of 18 is: "+oddIndex);
        }
    }
}
