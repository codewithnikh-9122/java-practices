package basics;

import java.util.Scanner;

public class Nikhil {

	public static void main(String[] args) {
		final double PI=3.1417;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the value of radius");
		double radius= scan.nextDouble();
		
		double area=  PI *  radius *radius;
		double circumference= 2*PI*radius;
		System.out.println("area of circle=" +area);
		System.out.println("circumference of circle="+circumference);
		
			scan.close();
		}

	}
