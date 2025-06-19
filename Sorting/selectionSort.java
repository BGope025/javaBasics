import java.util.Scanner;

public class selectionSort {
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
        for (int i=0;i<l-1;i++) {
            int k=i;
            for (int j=i+1;j<l;j++) {
                if (arr[k]>arr[j]) {
                    k=j;
                }
            }
            int t= arr[k];
            arr[k]= arr[i];
            arr[i]= t;
        }
        // printing data
        System.out.print("The sorted data is...\n| ");
        for (int i=0;i<l;i++)
            System.out.print(arr[i]+" | ");
    }
}