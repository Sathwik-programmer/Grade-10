import java.util.Scanner;
class ElectricBill
{
    String n;
    int unit;
    double bill;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the customer:");
        n=sc.nextLine();
        System.out.println("Enter the number of units consumed:");
        unit=sc.nextInt();
    }
    void calculate()
    {
        if(unit<=100)
        {
            bill=unit*1.5;
        }
        else if(unit>100 && unit<=200)
        {
            bill=100*1.5+(unit-100)*2.5;
        }
        else
        {
            bill=100*1.5+100*2.5+(unit-200)*3.5;
        }
    }
    void display()
    {
        System.out.println("Customer Name: "+n);
        System.out.println("Units Consumed: "+unit);
        System.out.println("Electricity Bill: "+bill);
    }
    public static void main(String[] args)
    {
        ElectricBill obj=new ElectricBill();
        obj.input();
        obj.calculate();
        obj.display();
    }
    sc.close();
}