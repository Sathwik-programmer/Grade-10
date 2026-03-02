import java.util.*;
class libraryfine_static
{
    static int fine;
    static int d1,m1,y1,d2,m2,y2;
    static void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the actual return date");
        d1=in.nextInt();
        m1=in.nextInt();
        y1=in.nextInt();
        System.out.println("Enter the expected return date");
        d2=in.nextInt();
        m2=in.nextInt();
        y2=in.nextInt();
        in.close();
    }
    static void calculate()
    {
        if(y1>y2)
        fine=10000;
        else if(y1==y2&&m1>m2)
        fine=(m1-m2)*500;
        else if(y1==y2&&m1==m2&&d1>d2)
        fine=(d1-d2)*15;
        else
        fine=0;
    }
    static void display()
    {
        System.out.println("The fine is:"+fine);
    }
    public static void main(String[] args)
    {
        libraryfine_static obj=new libraryfine_static();
        obj.accept();
        obj.calculate();
        obj.display();
    }
}