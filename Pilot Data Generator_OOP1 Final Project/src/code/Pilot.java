package code;

public class Pilot extends Faction
{
	private String codeName;
	private String name;
	private String combatStyle;
	private String symbols;
	private String nsStatus;
	private String planeType;
	
	
	public Pilot ()
	{
		this.codeName = "Undefined";
		this.name = "Undefined";
		this.combatStyle = "Undefined";
		this.symbols = "Undefined";
		this.nsStatus = "Undefined";
		this.planeType = "Undefined";
		super.setAlignment("Unaligned");
	}
	
	public Pilot (String codeName, String name, String combatStyle, String symbols, String nsStatus, String planeType, String alignment)
	{
		this.codeName = codeName;
		this.name = name;
		this.combatStyle = combatStyle;
		this.symbols = symbols;
		this.nsStatus = nsStatus;
		this.planeType = planeType;
		super.setAlignment(alignment);
	}
	//get methods for all Pilot variables
	public String getCodeName ()
	{
		return this.codeName;
	}
	public String getName ()
	{
		return this.name;
	}
	public String getCombatStyle ()
	{
		return this.combatStyle;
	}
	public String getSymbols ()
	{
		return this.symbols;
	}
	public String getnsStatus ()
	{
		return this.nsStatus;
	}
	public String getPlaneType ()
	{
		return this.planeType;
	}
	
	//set methods for Pilot variables
	public void setCodeName (String codeName) 
	{
		this.codeName = codeName;
	}
	public void setName (String name)
	{
		this.name = name;
	}
	public void setCombatStyle (String combatStyle)
	{
		this.combatStyle = combatStyle;
	}
	public void setSymbols (String symbols)
	{
		this.symbols = symbols;
	}
	public void setnsStatus (String nsStatus)
	{
		this.nsStatus = nsStatus;
	}
	public void setPlaneType (String planeType)
	{
		this.planeType = planeType;
	}
	
	@Override
	public String toString ()
	{
		return "Codename: " + this.codeName + " Name: " + this.name + " Combat Style: " + this.combatStyle + " Symbols: " + this.symbols + " Nemesis Status: " + this.nsStatus + " Plane Type: " + this.planeType + " Alignment: " +  this.getAlignment();
	}
	// prints a list of all the Pilot object variables without descriptors for saving data to file. 
	public String fileToString ()
	{
		return this.codeName + " " + this.name + " " + this.combatStyle + " " + this.symbols + " " + this.nsStatus + " " + this.planeType + " " + this.getAlignment();
	}
}
