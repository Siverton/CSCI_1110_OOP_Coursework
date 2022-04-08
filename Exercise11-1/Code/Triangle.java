package Code;
import java.util.Scanner;

public class Triangle extends GeometricObject
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of side 1: ");
		double s1 = input.nextDouble();
		System.out.print("Enter the length of side 2: ");
		double s2 = input.nextDouble();
		System.out.print("Enter the length of side 3: ");
		double s3 = input.nextDouble();
		System.out.print("Enter the color of the shape: ");
		String userColor = input.next();
		System.out.print("Is the shaped filled? (true or false): ");
		boolean userFilled = input.nextBoolean();
		
		Triangle userTriangle = new Triangle(s1,s2,s3,userColor,userFilled);
		System.out.println(userTriangle.toString());
		System.out.println("Triangle color: " + userTriangle.getColor() + " Triangle is filled?: " + userTriangle.getFilled());
		System.out.println("Triangle area is: " + userTriangle.getArea() + " Triangle perimeter is: " +  userTriangle.getPerimeter());
	}
	
	private double side1;
	private double side2;
	private double side3;
	
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
	public double getArea()
	{
		double s = (side1 + side2 + side3)/2;
		return java.lang.Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
