//� A+ Computer Science  -  www.apluscompsci.com
//Name -Derek Bragado
//Date -2/8/18
//Class -1
//Lab  -03D

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("xOne:");
	     int x1 = sc.nextInt();
	     System.out.println("yOne");
	     int y1 = sc.nextInt();
	     System.out.println("xTwo");
	     int x2 = sc.nextInt();
	     System.out.println("yTwo");
	     int y2 = sc.nextInt();
	    Distance d = new Distance(x1, y1, x2, y2);
	    d.calcDistance();
	    d.print();
	     
		//add test cases
		
		
		
		
			
	}
}