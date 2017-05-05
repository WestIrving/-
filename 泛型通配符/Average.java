package 泛型通配符;

import java.util.Arrays;

public class Average <T extends Number>{
	
	T[] obj;

	public Average(T[] obj) {
		
		this.obj = obj;
	}
	
	
	
	public double average(){
		
		double sum=0;
		
		for (int i = 0; i < obj.length; i++) {
			
			sum+=obj[i].doubleValue();  //doubleValue(): �����Ƿ���һ��double������
		}
		
		return sum/obj.length;
	}


	public boolean equalAvg(Average<?> obj){   // ͨ��� ��  ����ʾ���� ����
		
		if(this.average()==obj.average()){
			
			return true;
			
		}else{
			
			return false;
		}
		
		
	}

}
