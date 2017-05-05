package 泛型;

public class Gen <T>{
	
	T obj;

	public Gen(T obj) {
		
		this.obj = obj;
	}

	@Override
	public String toString() {
		
		return "Gen [obj=" + obj + "]";
	}

	
	

}
