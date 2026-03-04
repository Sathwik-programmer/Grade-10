import java.util.Scanner;
class Prime_Array
{
public static boolean isPrime(int num) 
    {
        if (num<=1) 
        {
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements: ");
        for (int i=0;i<n;i++) 
        {
            a[i]=in.nextInt();
        }
        System.out.println("Prime numbers in the array:");
        for (int i=0;i<a.length;i++) 
        {
            if (isPrime(a[i]))
            {
                System.out.print(a[i] + " ");
            }
        }
        in.close();
    }
}
