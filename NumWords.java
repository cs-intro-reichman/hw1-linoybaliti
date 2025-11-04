// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

int num1 = Integer.parseInt(args[0]);
int hundred =  (num1/100);
int tens =  (num1/10)%10;
int ones =  num1%10;
System.out.println(hundred + " hundreds, " + tens + " tens, and " + ones + " ones." );


	}
}
// משום מה אחרי קימפול לא עובד ובאונליין קומפיילר עובד