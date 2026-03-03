import java.util.*;
public class Min_Max {
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[]arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i=0; i<n; i++) 
            {
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <min) 
                {
                min=arr[i];
            }
            if (arr[i]>max) 
                {
                max=arr[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
