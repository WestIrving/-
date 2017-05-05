package 泛型;

public class TestGen {
	
	public static void main(String[] args) {
		
		Integer it=new Integer(5);
		
		Gen<Integer> t=new Gen<Integer>(it);
		
		System.out.println(t.getClass());
		
		System.out.println(t.toString());
		
		String s=new String("haha");
		
		Gen<String> t1=new Gen<String>(s);
		
		System.out.println(s.getClass());
		
		System.out.println(t1.toString());
		
	}

}
