package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates2 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date1 = cal.getTime();
		System.out.println(" sem formatar: " + date1);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		System.out.println(" formatado: " + sdf.format(date1));
	}
	
}
