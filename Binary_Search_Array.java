public class Binary_Search_Array 
{
    public static void main(String[] args) 
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int s = 5;
        int flag=0;
        int l=0,h=a.length-1,mid;
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
