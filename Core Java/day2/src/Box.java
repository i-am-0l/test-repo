class Box
{
private double width;
private double height;
private double depth;

Box(double w, double height, double d)
	{
		width = w;
		this.height = height;
		depth = d;
	}
//overload constructor to init a cube

Box(double side)
{
	this(side, side, side); //constructor chaining
} 
String getBoxDetails()
	{
		//return String.valueOf(width) + String.valueOf(height) + String.valueOf(depth);
		return "Box Dimensions: "+this.width+"*"+height+"*"+depth;
	}

double computeVolume()
	{
		return this.width*this.height*depth;
	}

}