import java.util.*;
class Binary_Search
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the elements in sorted order: ");
        System.out.println("Enter the number of elements: ");
        int n =sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched: ");
        int s = sc.nextInt();
        sc.close();
        int flag=0;
        int l=0,h=n-1,mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(a[mid]==s)
            {
                System.out.println("Element found at: "+(mid+1));
                flag=1;
                break;
            }
            else if(a[mid]<s)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
    }
}