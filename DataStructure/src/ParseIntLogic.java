
public class ParseIntLogic {

	public static void main(String[] args) {

		String s="123";
		int result =0;
		char[] array= s.toCharArray();
		
		for(int i=0;i<array.length;i++){
			char c = array[i];//'1',
			int asci=(int)c;
			int digit=asci-48;
			result= (result*10 +digit);
		}
		
		System.out.println(result);
	}
}
