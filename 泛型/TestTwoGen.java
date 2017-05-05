package 泛型;

public class TestTwoGen {
	
	public static void main(String[] args) {
		
		Integer it=new Integer(6);
		
		String s=new String("xixi");
		
		TwoGen<Integer,String> tg=new TwoGen<Integer, String>(it, s);
		
		System.out.println(tg.getClass());
		
		System.out.println(tg.toString());
		
	}

}
