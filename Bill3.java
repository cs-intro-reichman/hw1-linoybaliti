// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	     
	String name1 = args[0];
	String name2 = args[1];
	String name3 = args[2];
	int bill = Integer.parseInt(args[3]);
	double ResultBill = (double) bill/  3.0;
	System.out.println("dear " + name3 + " " + name2 + " " + name1 + " you need to pay: " + Math.ceil(ResultBill));

	}
}
