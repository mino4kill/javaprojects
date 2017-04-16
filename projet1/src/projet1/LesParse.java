package projet1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LesParse {
	/**
	 * @category Sleeping for a While You can sleep for any period of time from
	 *           one millisecond up to the lifetime of your computer. For
	 *           example, the following program would sleep for 3 seconds
	 */
	public static void repos() {
		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");

			Thread.sleep(5 * 60 * 10);
			System.out.println(new Date() + "\n");

			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Difference is : " + diff);
		} catch (Exception e) {
			System.out.println("Got an exception!");
		}
	}

	public static void main(String[] args) {
		String ch[] = { "1234521" };
		String fh = "hello world";
		int t = Integer.parseInt(ch[0]);
		System.out.println(t);
		Date today = new Date();
		GregorianCalendar d = new GregorianCalendar();
		System.out.println(today.toString());
		System.out.println(d.get(Calendar.DAY_OF_MONTH) + "-" + d.get(Calendar.MONTH) + "-" + d.get(Calendar.YEAR));
		String f = (String) fh.subSequence(0, 4);
		// String = ("1987-10-12");
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'il est :' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));
		int h = 0;
		char[] pass = new char[10];
		pass = System.console().readPassword();
		try {
			h = System.in.read();

		} catch (IOException e) {
			System.out.println("muavaise lecture ");
			e.printStackTrace();
			System.exit(0);
		} finally {

			System.out.println(f + " " + h + " ton pass cest ");
		}

		System.out.println(pass);

		repos();
	}

}
