
public class AirCondConsumption {
	int b1,b2,b3;
	int b1Amt,b2Amt,b3Amt,tunits;
	double tamt;
	int totalAc, totalUnit, totalAmt;
	int rate=9;

	public AirCondConsumption(int b1, int b2, int b3, int tunits, double tamt) {
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.tunits=tunits;
		this.tamt=tamt;
	}
	public int bedroom1(int b1)
	{
		b1Amt=b1*rate;
		return b1Amt;
	}
	public int bedroom2(int b2)
	{
		b2Amt=b2*rate;
		return b2Amt;
	}
	public int bedroom3(int b3)
	{
		b3Amt=b3*rate;
		return b3Amt;
	}
	public int acTotal(int b1, int b2, int b3)
	{
		totalAc=b1+b2+b3;
		return totalAc;
	}
	public int acAmt(int b1, int b2, int b3)
	{
		totalAmt = bedroom1(b1)+bedroom2(b2)+bedroom3(b3);
		return totalAmt;
	}

}
