public class Test {
    public static void main(String[] args) {
        String s="abc";
        printallPermutation(s, "");
    }
    private static void printallPermutation(String s, String result ) {
        if(s.isEmpty()) {
            System.out.println(result);
            return;
        }
        for(int i=0;i<s.length();i++) {
            printallPermutation(new String(s.substring(0,i)+s.substring(i+1)), result+s.charAt(i));
        }
    }
}
