// / Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        // המרה ל-int (כדי ששעות 1-9 יודפסו ללא 0 מוביל)
        int hours24 = Integer.parseInt(args[0].substring(0, 2)); 
        // הדקות נשארות כמחרוזת כדי לשמר את ה-0 המוביל, כפי שנדרש.
        String minutesStr = args[0].substring(3, 5); 

        int hours12;
        String suffix;

        // 1. קביעת AM/PM והמרת שעות
        if (hours24 == 0) {
            // 00:xx (חצות) -> 0:xx AM.
            hours12 = 0;
            suffix = "AM";
        } else if (hours24 >= 1 && hours24 <= 11) {
            // 01:xx עד 11:xx -> נשאר אותו מספר AM
            hours12 = hours24;
            suffix = "AM";
        } else if (hours24 == 12) {
            // 12:xx (צהריים) -> 12:xx PM
            hours12 = 12;
            suffix = "PM";
        } else { // 13:xx עד 23:xx
            // אחר הצהריים/ערב -> מחסירים 12 PM
            hours12 = hours24 - 12;
            suffix = "PM";
        }

        // 2. עיצוב הפלט (תיקון פערים)
        
        // הדפסת שעות (הן int, לכן לא יודפס 0 מוביל)
        System.out.print(hours12);
        
        // הדפסת המפריד
        System.out.print(":");
        
        // הדפסת דקות (כבר מחרוזת עם 0 מוביל)
        // אם היית משתמש ב-int בדקות, היית צריך להוסיף 0 מוביל ידנית.
        System.out.print(minutesStr);
        
        // **תיקון פער 1: הוספת רווח לפני הסיומת**
        System.out.print(" ");
        System.out.println(suffix);
    }
}