/**   
* @Title：Test1.java   
* @Project: Think_in_Java
*    
* @date：2010-12-6
* @Description: TODO(用一句话描述该文件做什么) 
* @author: 马欣
* @date: 2010-9-3 上午11:41:45 
*
* Copyright 马欣 2010    
* @version V1.0   
*/
package com.maeiei;

/**   
 *    
 * @Package：com.maeiei  
 * @ClassName：Test1   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author 马欣
 * @date：2010-12-6 下午02:14:54   
 *  
 * @version 
 */
public class Test1
{
	@org.junit.Test
	public void test1()
	{
		int index = 0;
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = i;
		}
//		System.out.println("a[index++] = " + a[index++]);
//		System.out.println("index = " + index);
		System.out.println("a[++index] = " + a[++index]);
		System.out.println("index = " + index);
	}

}
