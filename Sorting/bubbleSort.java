import java.util.Scanner;

public class bubbleSort {
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
            for (int j=0;j<l-1-i;j++) {
                if (arr[j]>arr[j+1]) {
                    int t= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= t;
                }
            }
        }
        // printing data
        System.out.print("The sorted data is...\n| ");
        for (int i=0;i<l;i++)
            System.out.print(arr[i]+" | ");
    }
}