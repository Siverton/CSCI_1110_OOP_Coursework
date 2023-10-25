package code;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable
{ 
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Octagon myOctagon = new Octagon();
		Octagon octagonClone = (Octagon)myOctagon.clone();
		
		System.out.println(octagonClone.compareTo(myOctagon));
	}
	public double side;
	
	public Octagon()
	{
		side = 1.0;
	}
	public Octagon(double side)
	{
		this.side = side;
	}
	public Octagon(double side, String color, boolean filled)
	{
		this.side = side;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	//abstract methods inherited from GeometricObject
	@Override
	public double getArea() 
	{
		return (2 + (4 / Math.sqrt(2)) * side * side);
	}

	@Override
	public double getPerimeter() 
	{
		return side * 8;
	}
	
	//methods overridden from the Comparable and Cloneable interfaces
	@Override
	public int compareTo(Octagon o) 
	{
		if (o.getArea() > this.getArea())
			return -1;
		else if (o.getArea() < this.getArea())
			return 1;
		else 
			return 0;
	}
	
	@Override
	 public Object clone() throws CloneNotSupportedException
	 {
		return super.clone();
	 }

}
