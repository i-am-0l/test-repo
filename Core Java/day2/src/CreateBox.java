import java.util.*;

class CreateBox
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width, height and depth of box.");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		double depth = sc.nextDouble();

		Box box1;// box1 is reference type of variable (class type of ref), no obj created so far, method local var: memory allocated on the stack: how many bytes : as per JVM spec
		
		box1 = new Box(width, height, depth); // Box class gets loaded in method area and it's instance is created in the heap

		
		System.out.println("Box dimentions: "+ box1.getBoxDetails());
		System.out.println("Box voulme: "+ box1.computeVolume());

		System.out.println("Enter the side of cubical box.");
		Box cube = new Box(sc.nextDouble());
	
		System.out.println("Cube dimentions: "+ cube.getBoxDetails());
		System.out.println("Cube voulme: "+ cube.computeVolume());

		//close the scanner
		sc.close();
	}
}