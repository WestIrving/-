package 泛型类型边界;

public class TestAverage {
	
	public static void main(String[] args) {
		
		Number [] n={1,2,3,4.5,5,6,6.5};
		
		
		Average<Number> a=new Average<>(n);
		
		a.average();
		
		System.out.println(a.toString());
		
	}

}
