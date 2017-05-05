package 泛型方法;

public class GenMethod {

	public static <T> boolean have(T[] arry, T t){   //hava()����
		                                            //�ж�(arry)�������Ƿ���� (t)
		
		boolean flag=false;
		
		for (int i = 0; i < arry.length; i++) {
			
			if(t.equals(arry[i])){
				
				flag=true;
				break;
			}
		}
		
		return flag;
	}
	
	
	public static void main(String[] args) {
		
		Integer [] i={1,2,3,4,5,6};
		
		int i_1=2;
		
		System.out.println(have(i, i_1));  //��(i)�������(i_1)����true
	}
	
	
}
