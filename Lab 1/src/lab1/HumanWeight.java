package lab1;

public class HumanWeight {

	protected double weightOnEarth;
	protected double weightOnMars;

	public HumanWeight (double weightOnEarth) 
	{
		this.weightOnEarth=weightOnEarth;
	}

	public void setWeightOnEarth (double weightOnEarth)
	{
		this.weightOnEarth=weightOnEarth;
	}
	
	public double getWeightOnEarth ()
	{
		return weightOnEarth;
	}
	
	public void setWeightOnMars (double weightOnMars)
	{
		this.weightOnMars=weightOnMars;
	}
	
	public double getWeightOnMars ()
	{
		return weightOnMars;
	}

	public void calculateWeightOnMars()
	{
		weightOnMars = (getWeightOnEarth() * 9.81) / 3.711;
	}
}
