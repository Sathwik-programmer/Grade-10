import java.util.*;
class Method_Overload
{
    int c=0;
  
    void verify()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println(n+" is a prime number");
        else       
        System.out.println(n+" is not a prime number");
    in.close();
    }
    public static void main(String[] args) 
    {
        Method_Overload obj=new Method_Overload();
        obj.verify();
    }
}