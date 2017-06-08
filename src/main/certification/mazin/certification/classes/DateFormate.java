package mazin.certification.classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormate {
	public static void main(String[] args) {
		Date d = new Date(0L);
		String ds = "December 15, 2004";
		DateFormat df = null;
		try {
			d = df.parse(ds);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
