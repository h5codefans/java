package cqyt.sxt.ycx;

//�𱭿ͳ�
public class JB extends Bus{

	public  int CalcRent(int days) {
	       if(!Bus.flag){
	    	   System.out.println("�𱭿ͳ�С��16��������"+days+"�죬���:"+ SinglePrice.XY*days);
	    	   return SinglePrice.XY*days;
	       }else{
	    	   System.out.println("�𱭿ͳ�����16��������"+days+"�죬���:"+ SinglePrice.DY*days);
	    	   return SinglePrice.DY*days;
	       }
			
		}
}