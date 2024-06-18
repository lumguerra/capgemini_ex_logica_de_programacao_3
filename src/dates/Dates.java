package dates;

import java.util.Calendar;
import java.util.TimeZone;

public class Dates {

	static void greet(int horaLocal) {
		if(horaLocal < 12) {
			System.out.println("Bom dia!");
		}else if(horaLocal > 12 && horaLocal < 18) {
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
	}
	
	public static void main(String[] args) {
		
		Calendar cal1 = Calendar.getInstance();
		TimeZone tzSP = TimeZone.getTimeZone("GMT-3");
		cal1.setTimeZone(tzSP);
		int horaLocal = cal1.get(Calendar.HOUR_OF_DAY);
		horaLocal += 5;
		greet(horaLocal);
	}

}
