package 泛型通配符;

public class TestAverage {

public static void main(String[] args) {
		
		Integer [] n={1,2,3,4,5};
		
		Double [] d={1.0,2.0,3.0,4.0,5.0};
		
		Average<Integer> a=new Average<Integer>(n);
		
		Average<Double> a1=new Average<>(d);
		
		a.average();
		
		System.out.println(a.equalAvg(a1));

		
	}
}
