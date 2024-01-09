public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     
	static int nDaysInMonth = 31;
    static String findFirstSunday; 
	
	public static void main(String args[]) {
		
        int GivenYear = Integer.parseInt(args[0]);
	    int debugDaysCounter = 0; 

	 	while (year < GivenYear) {

            DateAndSunday(GivenYear);
	 		advance(GivenYear);
            debugDaysCounter++;

            if (isLeapYear(GivenYear) && debugDaysCounter == 366 || !isLeapYear(GivenYear) && debugDaysCounter == 365) { 
	 			break;
	 		}

	 		}

        while (year == GivenYear) {
            DateAndSunday(GivenYear);		
	 		advance(GivenYear);
	 		debugDaysCounter++;

            if (isLeapYear(GivenYear) && debugDaysCounter == 366 || !isLeapYear(GivenYear) && debugDaysCounter == 365) { 
	 			break;
	 		}
        }
        }

	 private static void DateAndSunday(int GivenYear) {
        findFirstSunday(GivenYear);
		if (dayOfWeek == 1) {
				System.out.println(dayOfMonth + "/" + month + "/" + GivenYear + " Sunday");

			} else {
				System.out.println(dayOfMonth + "/" + month + "/" + GivenYear);
			}

	 }
	
	 private static void advance(int GivenYear) {
		dayOfMonth++;

		if (dayOfMonth > nDaysInMonth) {

			dayOfMonth = 1;
			month++;
		}

		nDaysInMonth = nDaysInMonth(month, GivenYear);

		dayOfWeek = (dayOfWeek % 7) + 1;


	 } 
		 
	private static boolean isLeapYear(int GivenYear) {
	    return (GivenYear % 400 == 0) || ((GivenYear % 4 == 0) && (GivenYear % 100 != 0));

	}
	 
	private static int nDaysInMonth(int month, int GivenYear) {

		switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
		    case 2:
			    if (isLeapYear(GivenYear)) {
					return 29;
				} else {
					return 28;
				}
			default:
				return 31;
		}
	}
private static String findFirstSunday (int GivenYear) {
    int currentMonth = 1;
    int currentDayOfWeek = dayOfWeek;

    while (currentDayOfWeek != 1) {

        currentDayOfWeek = (currentDayOfWeek % 7) + 1;
        currentMonth++;

    }
    return currentMonth + "/" + 1 + "/" + GivenYear;
}
}

