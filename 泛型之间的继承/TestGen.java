package 泛型之间的继承;

public class TestGen {

	public static void main(String[] args) {
		
		String s1=new String("Parent������");
		
		GenParent<String> gp=new GenParent<String>(s1);
		
		Integer i1=new Integer(6);
		
		GenChild<String, Integer> gc=new GenChild<String , Integer>(s1, i1);
		
		System.out.println(gc.obj);
		System.out.println(gc.obj1);
	}
}
