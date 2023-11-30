package code;

public class Faction 
{
	// The alignment variable needs to be Unaligned, Ally, or Enemy. Any other option would defeat the purpose of tracking this feature. 
	private String alignment;
	
	public Faction ()
	{
		this.alignment = "Unaligned";
	}
	public Faction (String alignment)
	{
		this.alignment = alignment;
	}
	public String getAlignment()
	{
		return this.alignment;
	}
	public void setAlignment(String alignment)
	{
		this.alignment = alignment;
	}
			
}
