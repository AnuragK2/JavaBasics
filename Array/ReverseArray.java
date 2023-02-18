import java.util.Scanner;

public class ReverseArray {
    public static int RevArray(int arr[],int size){
        int s=0;
        int e=size-1;
        while(s<=e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return e;
    }
    public static void Print(int arr[]){
        for(int i=0;i<=arr.length;i++){
            System.out.println("Array Elements are: "+arr[i]);
        }
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            int arr[]=new int[size];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int ans=RevArray(arr, size);
            Print(ans);
        }
    }
    private static void Print(int ans) {
    }
}
