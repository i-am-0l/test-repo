package com.app.core;

public class Box
{
private double width;
private double height;
private double depth;

public Box(double w, double height, double d)
	{
		width = w;
		this.height = height;
		depth = d;
	}
//overload constructor to init a cube

public Box(double side)
{
	this(side, side, side); //constructor chaining
} 
public String getBoxDetails()
	{
		//return String.valueOf(width) + String.valueOf(height) + String.valueOf(depth);
		return "Box Dimensions: "+this.width+"*"+height+"*"+depth;
	}

public double computeVolume()
	{
		return this.width*this.height*depth;
	}

public boolean checkEquality(Box anotherBox)
	{
		return width==anotherBox.width && height==anotherBox.height && depth==anotherBox.depth;
	}

public Box createNewBox(double widthOffset, double heightOffset, double depthOffset)
	{
		return (new Box(width+widthOffset, height+heightOffset, depth+depthOffset));
	}

}