// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
int sum = Integer.parseInt(args[0]); // סכום השקעה ראשוני
double rate = Double.parseDouble(args[1])/100; // אחוז ריבית
int n =Integer.parseInt(args[2]); // מספר שנים בהשקעה
double FutureValue = sum*(Math.pow(rate +1 ,n));
System.out.println("After " + n + " years, $" + sum + " saved at " + rate*100 + "% will yield $" + (int)FutureValue );


	}
}