package cn.bjsxt.collection;


/**
 * 自己实现一个ArrayList,帮助我们更好的理解Arraylist类的底层结构
 * @author Administrator
 *
 */
public class SxArrayList{
	  
	  private Object[] elementData;
	  private int size;
	  
	  public int size(){
		  return size;
	  }
	  
	  public boolean isEmpty(){
		  return size==0;
	  }
      public SxArrayList(){
    	  this(10);
      }
      
      public SxArrayList(int initialCapacity){
    	  if(initialCapacity<0){
    		  try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	  }
    	  elementData=new Object[initialCapacity];
      }
      
      public void add(Object obj){
    	  //数组扩容
    	  
    	  ensureCapacity();
    	  
    	  elementData[size++]=obj;
    	  
      }
      
      public Object get(int index){
          rangeCheck(index);
          
    	  return elementData[index];
      }
      
      public void remove(int index){
    	 //删除指定位置的对象  
    	  rangeCheck(index);
    	  int numMoved = size - index - 1;
    		if (numMoved > 0)
    		    System.arraycopy(elementData, index+1, elementData, index,
    				     numMoved);
    		elementData[--size] = null; 

      }
      
      public void remove(Object obj){
    	  for(int i=0;i<size;i++){
    		  if(get(i).equals(obj)){  //注意：顶层调用的equals而不是...
    			  remove(i);
    		  }
    	  }
    	  
      }
      
      public Object set(int index,Object obj){
    	rangeCheck(index);
    	
  	    Object oldValue = elementData[index];
  	    elementData[index] = obj;
  	    return oldValue;
      }
      
      public void add(int index,Object obj){
  	      rangeCheck(index);
  	    
    	    ensureCapacity();    //数组扩容
    		System.arraycopy(elementData, index, elementData, index + 1,
    				 size - index);
    		elementData[index] = obj;
    		size++;
      }
      
      private void ensureCapacity(){
    	  if(size==elementData.length){
    		  Object[] newArray=new Object[size*2+1];
    		  //System.arraycopy(elementData, 0, newArray, 0, elementData.length);
    		  for(int i=0;i<elementData.length;i++){
    			  newArray[i]=elementData[i];
    		  }
    		  elementData=newArray;
    	  }
      }
      private void rangeCheck(int index){
    	  if(index>=size){
    		  try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
    	  }
      }
      public static void main(String[] args) {
		SxArrayList list=new SxArrayList(3);
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("5");
		list.add("333");
		list.add("444");
		list.add(3,"3233");
		System.out.println(list.size());
		
		System.out.println(list.get(6));
		
	}
}
