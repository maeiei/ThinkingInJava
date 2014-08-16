/**   
 * @Title：Test.java   
 * @Project: Think_in_Java
 *    
 * @date：2010-11-19
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author: 马欣
 * @date: 2010-9-3 上午11:41:45 
 *
 * Copyright 马欣 2010    
 * @version V1.0   
 */
package com.maeiei;

import interfaces.filters.Waveform;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;


/**
 * 
 * @Package：com.maeiei
 * @ClassName：Test
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 马欣
 * @date：2010-11-19 上午08:46:34
 * 
 * @version
 */
public class Test12
{
	@Test
	public void test3_10()
	{
		int num1, num2;
//		num1 = (int) (Math.random() * 100);
//		num2 = (int) (Math.random() * 100);
		num1 = -1;
		num2 = -1;
		(num1) <<= 1;
		num1++;
		num2 <<= 1;
		System.out.println("num1: " + Integer.toBinaryString(num1));
		System.out.println("num2: " + Integer.toBinaryString(num2));
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		int result = num1 & num2;
		System.out.println("num1 & num2 =  " + Integer.toBinaryString(result));
		result = num1 | num2;
		System.out.println("num1 | num2 =  " + Integer.toBinaryString(result));
		num1 = ~num1;
		num2 = ~num2;
		System.out.println("~num1 =  " + Integer.toBinaryString(num1));
		System.out.println("~num1 =  " + num1);
		System.out.println("~num2 =  " + Integer.toBinaryString(num2));
		System.out.println("~num2 =  " + num2);
		result = num1 ^ num2;
		System.out.println("num1 ^ num2 = " + Integer.toBinaryString(result));
	}
	
	@org.junit.Test
	public void test4_5()
	{
		int num = (int) (Math.random() * 100), flag = 0x80000000;
		System.out.println("num初始化值: " + Integer.toBinaryString(num));
		System.out.println("flag初始化值: " + Integer.toBinaryString(flag));
		System.out.println("flag初始化值: " + flag);
		for(int i = 0; i < 32; i++, flag >>>= 1)
		{
			int result = (num & flag) == 0 ? 0 : 1;
			System.out.print(result);
		}
	}
	@org.junit.Test
	public void test4_7()
	{
		int i = 0;
		while(true)
		{
//			System.out.println(i++);
			System.out.println(++i);
			if(i == 99)
			{
				break;
			}
//			if(i == 99)
//			{
//				return;
//			}
		}
		System.out.println("end");
	}
	@org.junit.Test
	public void test4_10()
	{
		
	}
	@org.junit.Test
	public void test13_12()
	{
		String POEM = "Twas brillig, and the slithy toves\n" 
					+ "Did gyre and gimble in the wabe.\n"
					+ "All mimsy were the borogoves,\n" 
					+ "And the mome raths outgrabe.\n\n" 
					+ "Beware the Jabberwock, my son,\n"
					+ "The jaws that bite, the claws that catch.\n" 
					+ "Beware the Jubjub bird, and shun\n"
					+ "The frumious Bandersnatch.";
		Pattern pattern = Pattern.compile("[A-Z][a-z]+");
		Matcher matcher = pattern.matcher(POEM);
		while(matcher.find())
		{
			System.out.println("maeiei: " + matcher.group());
		}
		
	}
	@org.junit.Test
	public void testWaveform()
	{
		for(int i = 0; i < 10; i++)
		{
			Waveform waveform = new Waveform();
			System.out.println(waveform.toString());
		}
	}
	@org.junit.Test
	public void testMaeiei()
	{
	}
}
