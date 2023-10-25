package code;

public abstract class GeometricObject 
{
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	//constructors for GeometricObject
	protected GeometricObject()
	{
		color = "white";
		filled = false;
		dateCreated = new java.util.Date(System.currentTimeMillis());
	}
	protected GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date(System.currentTimeMillis());
	}
	//get and set methods
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public boolean getFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}
	public String toString()
	{
		return "Color = " + color + "\nFilled = " + filled + "\nDate Created = " + dateCreated.toString();
	}
	
	//abstract methods that will be overridden in the Octagon class 
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
