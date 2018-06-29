package com.adam.BaseClass;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

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
		
	}
}
