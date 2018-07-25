package com.adam.BaseClass;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class NewDatePackageTest {
	public static void main(String[] args) {
		//-----------下面是关于Clock的用法
		//h获取当前的Clock
		Clock clock = Clock.systemUTC();
		//通过clock获取当前时间
		System.out.println("当前时刻是："+clock.instant()); //2018-06-11T14:00:19.247091300Z
		//获取clock对应的毫秒数，与system.currentTimeMillis()输出相同
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		//-------------下面是关于Duration的用法
		Duration duration = Duration.ofSeconds(6000);
		System.out.println("6000 is equivalent to "+duration.toMinutes()+" minutes");
		System.out.println("6000 is equivalent to "+duration.toHours()+" hours");
		System.out.println("6000 is equivalent to "+duration.toDays()+" days");
		//add 6000 seconds to the clock, return the new clock
		Clock clock2 = Clock.offset(clock, duration);
		System.out.println("current moment adding 6000 seconds is:"+clock2.instant());
		//the following is about the usages of instant
		Instant instant = Instant.now();
		System.out.println("get the current timestamp"+instant);
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println("add 6000 seconds(100 minutes) to instant, return the new instant:"+instant2);
		//parsing Instant Object from String
		Instant instant3 = Instant.parse("2018-06-11T16:01:03.7850Z");
		System.out.println(instant3);
		//on the basis of the instant3, add 5 hours and 4 minutes
		Instant instant4 = instant3.plus(Duration.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		//get the moment five days before the instant4 
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);
		// below is the usage of the LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		//get the 146 day of the 2018 year
		localDate = LocalDate.ofYearDay(2018, 146);
		System.out.println(localDate);
		//set the date as 2018-05-21
		localDate = LocalDate.of(2018, Month.MAY, 21);
		System.out.println(localDate);
		//below is the usage of LocalTime 
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); // get the time with Hour Minutes Seconds & 9 digits milliseconds
		//set the time as 22:33
		localTime = LocalTime.of(22, 33);
		System.out.println(localTime);
		// return time of the 5503s in one day
		localTime = LocalTime.ofSecondOfDay(5503);
		System.out.println(localDate);
		//below is usage of the LocalDateTime
		// get the current date, time 
		LocalDateTime lcoalDateTime = LocalDateTime.now();
		// current date, time adding 25 hours and 3 minutes
		LocalDateTime future = lcoalDateTime.plusHours(25).plusMinutes(3);
		System.out.println(future);
		//below is the usage of Year, YearMonth, MonthDay
		Year year = Year.now();
		System.out.println("Current year is :" + year);
		year = year.plusYears(5);
		System.out.println("5 years later is :" + year);
		YearMonth ym =year.atMonth(10);
		System.out.println(ym);
		ym = ym.plusYears(5).minusMonths(3);
		System.out.println(ym);
		// set the date as May-23
		MonthDay md = MonthDay.now();
		System.out.println(md);
		MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
		System.out.println(md2);
	}
}
