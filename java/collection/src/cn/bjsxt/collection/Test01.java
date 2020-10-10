package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


/**
 * 测试List的基本方法
 * @author Administrator
 *
 */
public class Test01 {
     public static void main(String[] args){
    	 List list=new ArrayList();
    	 //ArrayList:底层实现是数组，线程不安全，效率高。所以，查询快，修改、插入、删除慢。
    	 //LinkedList:底层实现是链表，线程不安全，效率高。所以，查询慢，修改、插入、删除快。
    	 //Vector:线程安全的，效率低。
    	 
    	 
    	 list.add("aaa");
    	 list.add(new Date());
    	 list.add(new Dog());
    	 list.add(1234);   //自动类的：自动装箱！Integer
    	 
    	 list.add(3,"sfdsdfsd");
/*    	 System.out.println(list.size());
    	 System.out.println(list.isEmpty());
    	 
    	 list.remove(new Date());
    	 System.out.println(list.size());
    	 
    	 List list2=new ArrayList();
    	 list2.add("bbb");
    	 list2.add("ccc");
    	 
    	 list.add(list2);
*/
    	 
    	 //跟顺序的操作
    	 String str=(String)list.get(0);
    	 System.out.println(str);
    	 list.set(1, "abvaa");
    	 list.remove(0);
    	 
     }
}
class Dog{
	
}
