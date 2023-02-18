package JAVA.Tutorial.BitsManipulation;

import java.util.Scanner;

public class UniqueElementForKelements {
    public static int FindNonRepeatingElement(int arr[], int n, int k){
        byte size_of_int=4;
        int Int_Size=8*size_of_int;
        int count[]=new int[Int_Size];
        for(int i=0;i<Int_Size;i++){
            for(int j=0;j<n;j++){
                if((arr[j]&(n<<1))!=0){
                    count[i]+=1;
                }
            }
        }
        int res=0;
        for(int i=0;i<Int_Size;i++){
            res+=(count[i]%k)*(1<<i);
        }
        return res;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of k: ");
            int k=sc.nextInt();
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
            System.out.println(FindNonRepeatingElement(arr, n, k));
        }
    }
}
