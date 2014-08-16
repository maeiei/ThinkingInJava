/**   
* @Title：Maeiei.java   
* @Project: Think_in_Java
*    
* @date：2010-11-10
* @Description: 一个类要实现一个接口，用内部类完成接口的任务。
* @author: 马欣
* @date: 2010-9-3 上午11:41:45 
*
* Copyright 马欣 2010    
* @version V1.0   
*/
package com.maeiei;

import java.util.Iterator;

/**   
 *    
 * @Package：com.maeiei  
 * @ClassName：Maeiei   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author 马欣
 * @date：2010-11-10 上午09:35:48   
 *  
 * @version 
 */
public class Maeiei implements Iterable
{
	
	/* (non-Javadoc)   
	* @see java.lang.Iterable#iterator()   
	*/
	@Override
	public Iterator iterator()
	{
		// TODO Auto-generated method stub
		return new MaeieiIterator();
	}
	private class MaeieiIterator implements Iterator
	{

		/* (non-Javadoc)   
		* @see java.util.Iterator#hasNext()   
		*/
		@Override
		public boolean hasNext()
		{
			// TODO Auto-generated method stub
			return false;
		}

		/* (non-Javadoc)   
		* @see java.util.Iterator#next()   
		*/
		@Override
		public Object next()
		{
			// TODO Auto-generated method stub
			return null;
		}

		/* (non-Javadoc)   
		* @see java.util.Iterator#remove()   
		*/
		@Override
		public void remove()
		{
			// TODO Auto-generated method stub
			
		}		
	}
	public static void main(String[] args)
	{
		Maeiei maeiei = new Maeiei();
		Iterator iterator = maeiei.iterator();		
	}
	
}
