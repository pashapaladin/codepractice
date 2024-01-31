package demo1;

import java.util.Calendar;

public class leapYear {
	static boolean isLeapYear(int year) {
		if (year%4!=0) {
			return false;
		} else if (year%400==0) {
			return true;
		} else if (year%100==0) {
			return false;
		} else {
			return true;
		}
		
	}
	static boolean calcLeapYear2(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		return cal.getActualMaximum(Calendar.DAY_OF_YEAR)>365;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcLeapYear2(1996);
	}

}
