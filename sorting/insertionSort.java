import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int l=sc.nextInt();
        int[] arr= new int[l];
        // taking data
        System.out.println("Enter the elements");
        for (int i=0;i<l;i++)
            arr[i]= sc.nextInt();
        // sorting data
        for (int i=1;i<l;i++) {
            int k=arr[i];
            int j=i-1;
            while (j>=0 && k<arr[j]) {
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        // printing data
        System.out.print("The sorted data is...\n| ");
        for (int i=0;i<l;i++)
            System.out.print(arr[i]+" | ");
    }
}