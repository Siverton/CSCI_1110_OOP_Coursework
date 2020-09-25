// Class for Exercise9-1
class Rectangle 
{
	public static void main(String[] args) 
	{
		
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.println("The first rectangle's width and height are: " + r1.width + ", " + r1.height);
		System.out.println("It's area is: " + r1.getArea());
		System.out.println("It's perimeter is: " + r1.getPerimeter());
		
		System.out.println("\nThe second rectangle's width and height are: " + r2.width + ", " + r2.height);
		System.out.println("It's area is: " + r2.getArea());
		System.out.println("It's perimeter is: " + r2.getPerimeter());
	}
	
	double width;
	double height;
	
	Rectangle()
	{
		width = 1;
		height = 1;
	}
	
	Rectangle (double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}
	
	double getArea()
	{
		return width * height;
	}
	
	double getPerimeter()
	{
		return (width * 2) + (height * 2);
	}
}