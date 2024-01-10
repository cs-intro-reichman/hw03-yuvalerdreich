/** 
 * Prints the calendars of all the years in the 20th century.
 */

public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int SundayCount = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year <= 1999) {

			DateAndSunday();		
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (debugDaysCounter == 36525) { 
	 			break;
	 		}
        }
	 	//// Write the necessary ending code here
	 }

	 private static void DateAndSunday() {
		if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				SundayCount++;

			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + year);
			}

	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		dayOfMonth++;

		if (dayOfMonth > nDaysInMonth) {
			dayOfMonth = 1;

			month++;
		}

		if (month > 12) {
			month = 1;
			year++;
		}

		nDaysInMonth = nDaysInMonth(month, year);

		dayOfWeek = (dayOfWeek % 7) + 1;


	 } 
		 
	private static boolean isLeapYear(int year) {
	    return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

	}
	 
	private static int nDaysInMonth(int month, int year) {

		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
		    case 2:
			    if (isLeapYear(year)) {
					return 29;
				} else {
					return 28;
				}
			default:
				return 31;
		}
	}
}