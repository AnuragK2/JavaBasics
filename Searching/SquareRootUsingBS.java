package JAVA.Tutorial.Searching;

import java.util.Scanner;

public class SquareRootUsingBS {
    public static int SquareRoot(int n){
        int start=0;
        int end=n;
        int mid=start+(end-start)/2;
        int ans=-1;
        while(start<=end){
            int square=mid*mid;
            if(square==n){
                return mid;
            }
            else if(square>n){
                end=mid-1;
            }
            else if(square<n){
                ans=mid;
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return ans;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            System.out.println("The square of the number is: "+SquareRoot(n));
        }
    }
}
