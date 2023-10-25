package Code;

public class Triangle extends GeometricObject implements Colorable
{
	public static void main(String[] args)
	{
		GeometricObject myTriangle = new Triangle();
		System.out.println("New Triangle has been created. How do we color it?\n" + ((Colorable)myTriangle).howToColor());
	}
	
	private double side1;
	private double side2;
	private double side3;
	
	//constructors for Triangle
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		super.setColor(color);
		super.setFilled(filled);
	}
	//get and set methods for changing aspects of the triangle
	public double getSide1()
	{
		return side1;
	}
	public double getside2()
	{
		return side2;
	}
	public double getSide3()
	{
		return side3;
	}
	public void setSide1(double side1) 
	{
		this.side1 = side1;
	}
	public void setSide2(double side2)
	{
		this.side2 = side2;
	}
	public void setSide3 (double side3)
	{
		this.side3 = side3;
	}
	//methods that override the defined methods in GeometricObject
	@Override
	public double getArea()
	{
		double s = (side1 + side2 + side3)/2;
		return java.lang.Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	@Override
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	@Override
	public String howToColor()
	{
		return "Color all three sides.";
	}
}
