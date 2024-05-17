
public class CommonArea extends AirCondConsumption {
	public CommonArea(int b1, int b2, int b3,int tunits, double tamt) {
		super(b1, b2, b3,tunits, tamt);
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		this.tunits=tunits;
		this.tamt=tamt;
		super.totalAc=totalAc;
		super.totalAmt=totalAmt;
	}
	int comUnits;
	double comChrg, comphead, tComAmt, ccpHead;
	int totalHead=6;
	public int comConsmp(int tunits, int b1, int b2, int b3)
	{
		comUnits=tunits-(b1+b2+b3);
		return comUnits;
	}
	public double comAmt(double tamt, double totalAmt)
	{
		tComAmt=tamt-totalAmt;
		return tComAmt;
	}
	public double perHead(double tComAmt, double totalHead)
	{
		ccpHead=tComAmt/totalHead;
		return ccpHead;
	}
	
	

}
