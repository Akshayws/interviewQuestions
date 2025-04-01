package AK;

public class SingletoneClass {
	private static SingletoneClass insatnce;
	private SingletoneClass() {//to privant the external instatiation
		
	}
	public static synchronized SingletoneClass getInstance() {
		if(insatnce==null) {
			insatnce =new SingletoneClass();
		}
		return insatnce;
	}
	
	

	public static void main(String[] args) {
		
		SingletoneClass s1= SingletoneClass.getInstance();
		SingletoneClass s2=  SingletoneClass.getInstance();
		System.out.println(s1+" "+s2 );

	}

}
