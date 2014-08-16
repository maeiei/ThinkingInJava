//: access/ChocolateChip2.java

public class ChocolateChip2 extends Cookie {
  public ChocolateChip2() {
   System.out.println("ChocolateChip2 constructor");
  }
  public void chomp() { bite(); } // Protected method
  /**     
* bite(这里用一句话描述这个方法的作用)   
*  
* TODO(这里描述这个方法适用条件 – 可选)     
* TODO(这里描述这个方法的执行流程 – 可选)     
* TODO(这里描述这个方法的使用方法 – 可选)   
* TODO(这里描述这个方法的注意事项 – 可选)   
*
* @param   name  
* @return    设定文件 
* @return String    DOM对象  
* @Exception 异常对象 
* @since  CodingExample　Ver(编码范例查看) 1.1   
*
* @author 马欣
*  
*/
private void bite()
{
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.chomp();
  }
} /* Output:
Cookie constructor
ChocolateChip2 constructor
bite
*///:~
