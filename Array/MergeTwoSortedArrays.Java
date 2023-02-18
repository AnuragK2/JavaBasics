import java.util.Scanner;

public class MergeTwoSortedArrays(){
    public static int Merge(int arr1[],int arr2[],int n,int m,arr3[]){
        int i=0,j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k++]==arr1[i++];
            }else {
                arr3[k++]=arr2[j++];
            }
        }
        while(i<n){
            arr3[k++]=arr1[i++];
        }
        while(j<m){
            arr3[k++]=arr1[j++];
        }
    }
    public static void Print(int arr[],int n){
        for(int i=0;i<n;i++)
        System.out.println("Array elements are: "+arr[i]);
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array 1: ");
int n=sc.nextInt;
System.out.println("Enter the size of array 2: ");
int m=sc.nextInt;
System.out.println("Enter the array elements of array 1: ");
int arr1[]=new int[n];
for(int i=0;i<n;i++){
    int arr1[i]=sc.nextInt;
}
System.out.println("Enter the array elements of array 2: ");
int arr2[]=new int[m];
for(int i=0;i<m;i++){
    int arr2[i]=sc.nextInt;
}
Merge(arr1,5,arr2,3);
Print(arr3,8);
}
}