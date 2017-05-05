package 泛型类型边界;

import java.util.Arrays;

public class Average <T extends Number>{
	
	T[] obj;

	public Average(T[] obj) {
		
		this.obj = obj;
	}
	
	double sum=0;
	
	public double average(){
		
		
		
		for (int i = 0; i < obj.length; i++) {
			
			sum+=obj[i].doubleValue();  //doubleValue(): �����Ƿ���һ��double������
		}
		
		return sum=(sum/obj.length);
	}


	@Override
	public String toString() {
		return "Average [obj=" + Arrays.toString(obj) +"sum="+sum+ "]";
	}
	
	

}
