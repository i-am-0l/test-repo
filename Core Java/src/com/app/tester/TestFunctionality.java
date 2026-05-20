package com.app.tester;
import java.util.Scanner;
import com.app.core.Box;

class TestFunctionality
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions of 1st Box: w*h*d");
		Box box1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter the dimensions of 2nd Box: w*h*d");
		Box box2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(box1.checkEquality(box2)?"SAME":"Different");

		System.out.println("Enter the dimensions of the Box: w*h*d");
		Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter the offsets of New Box: width Offset, height Offset, depthOffset");
		
		System.out.println(box.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()).getBoxDetails());

		sc.close();
		System.out.println("main over");
	}	

}