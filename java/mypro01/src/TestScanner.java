import java.util.Scanner;


/**
 * 测试Scanner类的使用，如何接受键盘的输入。
 * @author Administrator
 *
 */
public class TestScanner {
	
	public static void test01(){
   	 Scanner s=new Scanner(System.in);
   	 String str=s.next();    //程序运行到next会阻塞，等待键盘输入字符串
   	 
   	 System.out.println("刚才键盘输入："+str);
	}
	public static void test02(){
      	 Scanner s=new Scanner(System.in);
      	 System.out.println("请输入一个加数：");
      	 int a=s.nextInt();       //输入数值
      	 System.out.println("请输入另一个加数：");
      	 int b=s.nextInt();
      	 int sum=a+b;
      	 System.out.println("计算结果，和为："+sum);
	}
     public static void main(String[] args){
         test02();
     }
}
