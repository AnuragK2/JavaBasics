import java.util.Scanner;

public class BayerMooreMajorityVotingAlgo {
    public static int MajorityElement(int arr[]){
        int count=0,candidate=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
                count=1;
            }
            else{
                if(arr[i]==candidate){
                    count++;
                }else{
                    count--;
                }
            }
        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }
            if(count>(arr.length/2)){
                return candidate;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int size=sc.nextInt();
            System.out.println("Enter the array elements: ");
            int arr[]=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Majority Element is:"+MajorityElement(arr));
        }
    }
}
