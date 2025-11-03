// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		String minutes = ("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code

		if (0 <= hours && hours < 12){ // AM
			System.out.print(hours + ":" + minutes + "AM"); //  נפתר בשורה 2 - הפער בדקות כי אינט ידפיס בלי אפס
		}
		else if (hours == 12)
		{
			System.out.print(hours + ":" + minutes + "PM");
		}
		else // PM
		{
			System.out.print(hours - 12 + ": :" + minutes + "PM");
		}
		


	}
}