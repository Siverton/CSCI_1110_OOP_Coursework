
public class Exercise6_9 
{
	public static void main(String[] args)
	{
		System.out.println("Feet    Meters          Meters  Feet   ");
		System.out.println("---------------------------------------");
		//                 "00.0    0.000           00.0    000.000"
		double footCounter = 1;
		double meterCounter = 20;
		for (int i = 0; i < 9; i++)
		{
			System.out.printf("%2.1f    %1.3f           %2.1f    %3.3f\n", footCounter, footToMeter(footCounter), meterCounter, meterToFoot(meterCounter));
			footCounter++;
			meterCounter +=  5;
		}
		System.out.printf("%2.1f   %1.3f           %2.1f    %3.3f\n", footCounter, footToMeter(footCounter), meterCounter, meterToFoot(meterCounter));
	}
	
	public static double footToMeter (double foot)
	{
		double meter = 0.305 * foot;
		return meter;
	}
	
	public static double meterToFoot (double meter)
	{
		double foot = 3.279 * meter;
		return foot;
	}
}
