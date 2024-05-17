import java.util.*;

public class ElectricityBill {

	public static void main(String[] args) {
		System.out.println("Electricity bill calculator");
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EB bill amount");
		double tamt=sc.nextInt(); //total electricty bill amount
		System.out.println("Enter the total units consumed");
		int tunits=sc.nextInt(); // total units consumed
		System.out.println("Enter the 1st bedroom units");
		int b1= sc.nextInt();
		System.out.println("Enter the 2nd bedroom units");
		int b2=sc.nextInt();
		System.out.println("Enter the 3rd bedroom units");
		int b3=sc.nextInt();
		AirCondConsumption ac =new AirCondConsumption(b1,b2,b3,tunits,tamt);
		System.out.println("First bedroom charges = "+ac.bedroom1(b1));
		System.out.println("Second bedroom charges = "+ac.bedroom2(b2));
		System.out.println("Third bedroom charges = "+ac.bedroom3(b3));
		System.out.println("Total Ac units consumed = "+ ac.acTotal(b1,b2,b3));
		System.out.println("Total Ac consumption charges = "+ac.acAmt(b1,b2,b3));
		CommonArea cm = new CommonArea(b1,b2,b3,tunits,tamt);
		System.out.print("Common Area units Consumed = ");
		System.out.println(cm.comConsmp(tunits,b1,b2,b3));
		System.out.print("Common Area total amount = ");
		System.out.println(cm.comAmt(tamt,ac.totalAmt));
		System.out.print("Common Area Per head charges = ");
		System.out.println(Math.round(cm.perHead(cm.tComAmt,cm.totalHead)));
		sc.close();
		
	}

}
