package com.thread.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Lazy Setting of ThreadLocal Value
 * 
 * In some situations you cannot use the standard ways of setting an initial
 * value. For instance, perhaps you need some configuration information which is
 * not available at the time you create the ThreadLocal variable. In that case
 * you can set the initial value lazily. Here is an example of how setting an
 * initial value lazily on a Java ThreadLocal:
 * 
 * The SimpleDateFormat class is not thread safe, so multiple threads cannot use
 * it at the same time. To solve this problem, the ThreadLocalLazySetting class
 * creates a SimpleDateFormat per thread, so each thread calling the format()
 * method will use its own SimpleDateFormat instance.
 */
public class ThreadLocalLazySetting {
	private ThreadLocal<SimpleDateFormat> simpleDateFormatThreadLocal = new ThreadLocal<>();

	public String format(Date date) {
		SimpleDateFormat simpleDateFormat = getThreadLocalSimpleDateFormat();
		return simpleDateFormat.format(date);
	}

	private SimpleDateFormat getThreadLocalSimpleDateFormat() {
		SimpleDateFormat simpleDateFormat = simpleDateFormatThreadLocal.get();
		if (simpleDateFormat == null) {
			simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			simpleDateFormatThreadLocal.set(simpleDateFormat);
		}
		return simpleDateFormat;
	}

}
