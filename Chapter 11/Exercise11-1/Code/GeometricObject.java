package Code;

public class GeometricObject 
{
	public static void main(String[] args)
	{
		
	}
	
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject()
	{
		color = "red";
		filled = false;
		dateCreated = new java.util.Date(System.currentTimeMillis());
	}
	public GeometricObject(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date(System.currentTimeMillis());
	}
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
	
}
