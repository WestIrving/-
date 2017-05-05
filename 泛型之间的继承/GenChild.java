package 泛型之间的继承;
                 //���෺�Ϳ������ӵ��Ǳ������ٺ��и���ķ���
public class GenChild<T,V> extends GenParent<T>{

	V obj1;
	public GenChild(T obj,V obj1) {
		
		super(obj);
		this.obj1=obj1;
		
	}
	
	

}
