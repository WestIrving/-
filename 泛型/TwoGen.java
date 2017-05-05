package 泛型;

public class TwoGen <T,V>{
	
	T obj1;
	V obj2;
	public TwoGen(T obj1, V obj2) {
		
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	@Override
	public String toString() {
		
		return "TwoGen [obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}
	
	

}
