package project1;

import java.util.Scanner;

public class areamethod {
	

    public void area(int side)
    {
        System.out.print(side*side);
    }
    void area(float radius)
    {
        System.out.print(31.4f*radius*radius);
    }
    void area(int l,int b)
    {
        System.out.print(l*b);
    }
    public static void main(String aa[])
    {
         System.out.print("Thankyou!!!");
         areamethod t=new areamethod();
         t.area(22.5f);
         t.area(2);
         t.area(3,9);
}

	
	
	   }
