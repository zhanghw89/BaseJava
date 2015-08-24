package com.zhangshiwen.thread;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadBlock {
	public static void main(String[] args) throws InterruptedException, ParseException {
		String dateStr = "2015-08-07 13:04";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date parse = df2.parse(dateStr);
		System.out.println(parse.toString());
		
		DateFormat df = new SimpleDateFormat("MM月dd日 HH:mm");
		String date = df.format(parse);
		System.out.println(date);
		
	}
	

}
