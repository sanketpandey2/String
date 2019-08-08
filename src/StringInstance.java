
public class StringInstance {
	
	public static void main(String[] args) {
		String s1 = "Delhi";
		String s4= "Delhi";
		
		String s2= new String("Delhi");
		String s5= new String("Delhi");
		
		
		
		String s3= new String("Delhi");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s5);
		String s = "sanket";
		
		StringBuffer sa = new StringBuffer(s);
		
		System.out.println(s.equals(sa));
		
	}

}
