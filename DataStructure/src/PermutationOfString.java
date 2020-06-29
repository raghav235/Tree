
public class PermutationOfString {

	public static void main(String[] args) {

		String s="abc";
		permutation(s);
	}
	
	private static void permutation(String s) {
		permutation(s,"");
	}
	/**
	 * 
	 * @param rotateMe
	 * @param fixed
	 * 
	 * Fixed char 0, rotate rest of string
	 * For rest of String , fix char 0 , rotate rest of string
	 * 
	 */
	public static void permutation(String rotateMe, String fixed){
		if(rotateMe.isEmpty()){
			System.out.println(fixed+"");
		}
		for(int i=0;i<rotateMe.length();i++){
			char ch= rotateMe.charAt(i);
			String toBeRotated= rotateMe.substring(0,i)+rotateMe.substring(i+1);
			permutation(toBeRotated, fixed+ch);
		}
	}

}
