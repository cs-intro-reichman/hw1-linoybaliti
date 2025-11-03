// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
	
int lim = Integer.parseInt(args[0]);
int a = (int) (Math.random() * lim) + 1;
int b = (int) (Math.random() * lim) + 1;
int c = (int) (Math.random() * lim) + 1;
System.out.println( a + " " + b + " " + c);

int temp = Math.max(a,b);
int Max = Math.max(temp,c);
temp = Math.min(a,b);
int Min = Math.min(temp,c);
int Mid = ( a+b+c)- Min-Max;
System.out.println(Min + " " + Mid + " " + Max);

	}
}
