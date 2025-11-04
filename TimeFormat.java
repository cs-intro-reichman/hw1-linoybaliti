// / Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
      
        int hours24 = Integer.parseInt(args[0].substring(0, 2)); 
        String minutesStr = args[0].substring(3, 5); 

        int hours12;
        String suffix;

        if (hours24 == 0) {
            hours12 = 0;
            suffix = "AM";
        } else if (hours24 >= 1 && hours24 <= 11) {  
            hours12 = hours24;
            suffix = "AM";
        } else if (hours24 == 12) {     
            hours12 = 12;
            suffix = "PM";
        } else { 
            hours12 = hours24 - 12;
            suffix = "PM";
        }
     
        System.out.print(hours12);  
        System.out.print(":");
        System.out.print(minutesStr);
        System.out.print(" ");
        System.out.println(suffix);
    }
}