public class Binary_Search_Words 
{
    public static void main(String[] args) 
    {
        String[] a = {"John","The","Don"};
        String s = "The";
        int flag=0;
        int l=0,h=a.length-1,mid;
        while(l<=h)
        {
            mid = (l+h)/2;
            if(a[mid].compareTo(s)==0)
            {
                System.out.println("Element found at: "+(mid+1));
                flag=1;
                break;
            }
            else if(a[mid].compareTo(s)<0)
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
