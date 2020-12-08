package com.springboot.wangpan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	public static boolean timeStampIsDate(String timeString) throws DateTimeParseException, ParseException {
		Date parse = simpleDateFormat.parse("1970-01-01");
		Date date = new Date(Long.parseLong(timeString));
		if (date.after(parse) && date.before(Calendar.getInstance().getTime())) {
			return true;
		}
		return false;
	}

}
