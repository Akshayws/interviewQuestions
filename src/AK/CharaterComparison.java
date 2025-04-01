package AK;

public class CharaterComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaabbccaa";
		System.out.println("Output: "+ CompressString(a));

	}

	private static String CompressString(String a) {
		StringBuffer st= new StringBuffer();
		int count=1;
		
		for(int i=1;i<a.length();i++ ) {
			
			if(a.charAt(i)==a.charAt(i-1)) {
				count++;
			}else {
				st.append(count).append(a.charAt(i-1));
				count=1;
			}
			
		}
		st.append(count).append(a.charAt(a.length()-1));
		return st.toString();
	}

}
