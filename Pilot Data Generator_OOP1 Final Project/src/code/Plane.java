package code;

public class Plane 
{
	private String name;
	private double topSpeed;
	private double stallSpeed;
	private double turnSpeed;
	private String armaments;
	
	public Plane ()
	{
		this.name = "Undesignated";
		this.topSpeed = 0.0;
		this.stallSpeed = 0.0;
		this.turnSpeed = 0.0;
		this.armaments = "Undesignated";
	}
	
	public Plane (String name, double topSpeed, double stallSpeed, double turnSpeed, String armaments)
	{
		this.name = name;
		this.topSpeed = topSpeed;
		this.stallSpeed = stallSpeed;
		this.turnSpeed = turnSpeed;
		this.armaments = armaments;
	}

	//get methods for all Plane variables
	public String getName ()
	{
		return this.name;
	}
	public double getTopSpeed()
	{
		return this.topSpeed;
	}
	public double getStallSpeed()
	{
		return this.stallSpeed;
	}
	public double getTurnSpeed()
	{
		return this.turnSpeed;
	}
	public String getArmaments()
	{
		return this.armaments;
	}
	
	//set methods for all Plane variables
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTopSpeed (double topSpeed)
	{
		this.topSpeed = topSpeed;
	}
	public void setStallSpeed (double stallSpeed)
	{
		this.stallSpeed = stallSpeed;
	}
	public void setTurnSpeed (double turnSpeed)
	{
		this.turnSpeed = turnSpeed;
	}
	public void setArmaments (String armaments)
	{
		this.armaments = armaments;
	}
	
	// prints Pilot object variables and descriptors for the benefit of the user.
	@Override
	public String toString()
	{
		return "Name; " + this.name + " Top Speed: " +  this.topSpeed + " Stall Speed: " + this.stallSpeed + " Turn Speed: " + this.turnSpeed + " Armaments: " + this.armaments;
	}
	// prints a list of all the Pilot object variables without descriptors for saving data to file. 
	public String fileToString()
	{
		return this.name + " " + this.topSpeed + " " +  this.stallSpeed + " " + this.turnSpeed + " " + this.armaments;
	}
}
