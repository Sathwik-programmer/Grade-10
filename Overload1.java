import java.util.*;
public class Overload1 
{
    int w,charge;
    String name;
    void call(int a,int b,String c){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight "+w);
        w=sc.nextInt();
        System.out.println("Enter name "+name);
        name=sc.next();
        sc.close();
    }   
    void calculate()
    {
        charge = 0;
    
   
        int s = Math.min(w, 5);
        charge += s * 50;
       w-= s;
    
        if (w > 0) {
            int slab = Math.min(w, 5);
            charge += slab * 100;
            w -= slab;
        }
        if (w > 0) {
            charge += w * 150;
        }
        System.out.println("total charge is "+charge);

        charge = (int)(5.0/100*charge) + charge;
        
    }
    void print()
        {
            System.out.println("Name of the customer is "+name);
            System.out.println("Weight of the parcel is "+w);
            System.out.println("Total charge is "+charge);
        }
        public static void main(String[] args) {
            Overload1 o=new Overload1();
            o.call(6, 100, "John");
            o.calculate();
            o.print();
        }
}
